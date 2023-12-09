package io;

import java.util.HashMap;
import java.util.Map;

public final class FileOutput {
    private String path;
    private LongOutput output;

    public FileOutput(String path, LongOutput output) {
        this.path = path;
        this.output = output;
    }

    public void write(String text, HashMap<Character, String> codes) throws Exception {
        for (Map.Entry<Character, String> entry : codes.entrySet()) {
            String encoding = entry.getValue();
            this.output.write(entry.getKey(), Sizes.CHAR_SIZE.size);
            this.output.write(encoding.length(), Sizes.INT_SIZE.size);
            for (Character ch : encoding.toCharArray()) {
                this.output.write(ch == '1');
            }
        }
        this.output.write(0, Sizes.CHAR_SIZE.size);
        for (Character ch : text.toCharArray()) {
            this.output.write(ch == '1');
        }
    }
}
