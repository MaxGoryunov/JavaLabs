package tree;

import java.util.HashMap;

public class Symbol {
    private final char symbol;
    private final int occurrence;
    private Symbol left = null;
    private Symbol right = null;

    public Symbol(char symbol, int occurrence) {
        this.symbol = symbol;
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

    public void huffmanCodes(String accumulated, HashMap<Character, String> codes) {
        if (this.left == null && this.right == null) {
            codes.put(this.symbol, accumulated);
        } else {
            if (this.left != null) {
                this.left.huffmanCodes(accumulated + "0", codes);
            }
            if (this.right != null) {
                this.right.huffmanCodes(accumulated + "1", codes);
            }
        }
    }
}