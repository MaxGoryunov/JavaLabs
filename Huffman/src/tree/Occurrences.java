package tree;

import java.util.HashMap;

public class Occurrences {
    private String source;

    public Occurrences(String source) {
        this.source = source;
    }

    public HashMap<Character, Integer> value() {
        HashMap<Character, Integer> ocs = new HashMap<>();
        for (Character ch : this.source.toCharArray()) {
            ocs.put(ch, ocs.getOrDefault(ch, 0) + 1);
        }
        return ocs;
    }
}
