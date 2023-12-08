package tree;

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
}
