package transformations;

import tree.Occurrences;
import tree.Ordered;
import tree.Tree;
import tree.TreeBuilder;

import java.util.HashMap;

public class Encoded {
    private final HashMap<Character, String> codes = new HashMap<>();
    private final HashMap<Byte, String> Codes = new HashMap<>();
    private int length = 0;

    public String encode(byte[] content) {
        new TreeBuilder(new Ordered(new Occurrences(content)))
            .value()
            .HuffmanCodes(this.Codes);
        StringBuilder encoded = new StringBuilder();
        for (Byte b : content) {
            String encoding = this.Codes.get(b);
            encoded.append(encoding);
            this.length += encoding.length();
        }
        //System.out.println(this.Codes);
        return encoded.toString();
    }

    public int length() {
        return this.length;
    }

    public HashMap<Character, String> codes() {
        return this.codes;
    }

    public HashMap<Byte, String> Codes() {
        return this.Codes;
    }
}
