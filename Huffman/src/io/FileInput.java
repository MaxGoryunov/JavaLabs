package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public final class FileInput {
    private final LongInput input;
    private int length = 0;

    public FileInput(String name) throws Exception {
        this(new LongInput(new FileInputStream(name)));
    }

    public FileInput(LongInput input) {
        this.input = input;
    }

    public String extension() throws Exception {
        StringBuilder extension = new StringBuilder();
        byte symbol;
        while ((symbol = (byte)this.input.bits(Sizes.CHAR_SIZE.size)) != 0) {
            extension.append((char) symbol);
        }
        return extension.toString();
    }

    public HashMap<String, Byte> ReverseCodes() throws Exception {
        HashMap<String, Byte> codes = new HashMap<>();
        byte symbol;
        this.length = this.input.bits(Sizes.INT_SIZE.size);
        System.out.println("Length = " + this.length);
        this.input.bits(Sizes.CHAR_SIZE.size);
        int codesSize = this.input.bits(Sizes.INT_SIZE.size);
        System.out.println("Total codes = " + codesSize);
        this.input.bits(Sizes.CHAR_SIZE.size);
        int count = 0;
        while (count < codesSize) {
            symbol = (byte)this.input.bits(Sizes.CHAR_SIZE.size);
            //System.out.println("Read byte" + symbol);
            int length = this.input.bits(Sizes.INT_SIZE.size);
            StringBuilder encoding = new StringBuilder();
            for (int i = 0; i < length; ++i) {
                encoding.append(this.input.bit());
            }
            codes.put(encoding.toString(), symbol);
            count++;
        }
        this.input.bits(Sizes.CHAR_SIZE.size);
        return codes;
    }

    public int count() {
        return this.length;
    }

    public int bit() throws Exception {
        return this.input.bit();
    }
}
