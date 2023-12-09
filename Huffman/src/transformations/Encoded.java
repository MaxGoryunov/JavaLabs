package transformations;

import tree.Occurrences;
import tree.Ordered;
import tree.Tree;
import tree.TreeBuilder;

import java.util.HashMap;

public class Encoded {
    private final HashMap<Character, String> codes = new HashMap<>();

    public String encode(String content) {
        new TreeBuilder(new Ordered(new Occurrences(content)))
            .value()
            .huffmanCodes(this.codes);
        StringBuilder encoded = new StringBuilder();
        for (Character ch : content.toCharArray()) {
            encoded.append(this.codes.get(ch));
        }
        return encoded.toString();
    }

    public HashMap<Character, String> codes() {
        return this.codes;
    }
}
