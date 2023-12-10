package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

public final class FileInput {
    private final LongInput input;

    public FileInput(String name) throws Exception {
        this(new LongInput(new FileInputStream(name)));
    }

    public FileInput(LongInput input) {
        this.input = input;
    }

    public HashMap<String, Character> reverseCodes() throws Exception {
        HashMap<String, Character> codes = new HashMap<>();
        char symbol;
        while ((symbol = (char)this.input.bits(Sizes.CHAR_SIZE.size)) != 0) {
            int length = this.input.bits(Sizes.INT_SIZE.size);
            StringBuilder encoding = new StringBuilder();
            for (int i = 0; i < length; ++i) {
                encoding.append(this.input.bit());
            }
            codes.put(encoding.toString(), symbol);
        }
        return codes;
    }

    public int bit() throws Exception {
        return this.input.bit();
    }
}
