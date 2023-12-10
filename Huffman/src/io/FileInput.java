package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

public final class FileInput {
    private LongInput input;

    public FileInput(String name) throws Exception {
        this(new LongInput(new FileInputStream(name)));
    }

    public FileInput(LongInput input) {
        this.input = input;
    }

    public HashMap<Character, String> codes() throws Exception {
        HashMap<Character, String> codes = new HashMap<>();
        char symbol;
        while ((symbol = (char)this.input.bits(Sizes.CHAR_SIZE.size)) != 0) {
            int length = this.input.bits(Sizes.INT_SIZE.size);
            StringBuilder encoding = new StringBuilder();
            for (int i = 0; i < length; ++i) {
                encoding.append(this.input.bit());
            }
            codes.put(symbol, encoding.toString());
        }
        return codes;
    }
}
