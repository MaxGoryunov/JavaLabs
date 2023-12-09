package tree;

import java.util.HashMap;

public final class Tree {
    private Symbol root;

    public static Tree fromText(String text) {

    }

    public Tree(Symbol root) {
        this.root = root;
    }

    public void huffmanCodes(HashMap<Character, String> codes) {
        this.root.huffmanCodes("", codes);
    }
}
