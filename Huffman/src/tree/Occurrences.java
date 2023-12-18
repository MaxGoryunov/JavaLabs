package tree;

import java.util.HashMap;

public class Occurrences {
    private String source;
    private byte[] bytes;

    public Occurrences(String source) {
        this.source = source;
    }

    public Occurrences(byte[] bytes) {
        this.bytes = bytes;
    }

    public HashMap<Byte, Integer> byteValue() {
        HashMap<Byte, Integer> ocs = new HashMap<>();
        for (Byte b : this.bytes) {
            ocs.put(b, ocs.getOrDefault(b, 0) + 1);
        }
        return ocs;
    }
}
