package tree;

import java.util.HashMap;

public final class Tree {
    private Symbol root;

    public Tree(Symbol root) {
        this.root = root;
    }

    public HashMap<Byte, String> HuffmanCodes(HashMap<Byte, String> codes) {
        this.root.HuffmanCodes("", codes);
        return codes;
    }
}
