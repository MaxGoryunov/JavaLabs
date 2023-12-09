package tree;

import java.util.HashMap;

public final class Tree {
    private Symbol root;

    public Tree(Symbol root) {
        this.root = root;
    }

    public HashMap<Character, String> huffmanCodes(HashMap<Character, String> codes) {
        this.root.huffmanCodes("", codes);
        return codes;
    }
}
