package tree;

import java.util.HashMap;

public class Symbol {
    private char symbol;
    private byte bt;
    private final int occurrence;
    private Symbol left = null;
    private Symbol right = null;

    public Symbol(char symbol, int occurrence) {
        this.symbol = symbol;
        this.occurrence = occurrence;
    }

    public Symbol(byte bt, int occurrence) {
        this.bt = bt;
        this.occurrence = occurrence;
    }

    public Symbol withLeft(Symbol left) {
        this.left = left;
        return this;
    }

    public Symbol withRight(Symbol right) {
        this.right = right;
        return this;
    }

    public int occurrence() {
        int occurrence = 0;
        if (this.occurrence != 0) {
            occurrence = this.occurrence;
        } else {
            if (this.left != null) {
                occurrence += this.left.occurrence();
            }
            if (this.right != null) {
                occurrence += this.right.occurrence();
            }
        }
        return occurrence;
    }

    public void HuffmanCodes(String accumulated, HashMap<Byte, String> codes) {
        if (this.left == null && this.right == null) {
            codes.put(this.bt, accumulated);
        } else {
            if (this.left != null) {
                this.left.HuffmanCodes(accumulated + "0", codes);
            }
            if (this.right != null) {
                this.right.HuffmanCodes(accumulated + "1", codes);
            }
        }
    }

    public String toString() {
        String str = "(";
        if (this.left != null) {
            str += this.left.toString();
        }
        if (this.right != null) {
            str += this.right.toString();
        }
        if (this.symbol == '_') {
            return str + " = " + this.occurrence() + ")";
        }
        return str + this.symbol + " = " + this.occurrence() + ")";
    }
}
