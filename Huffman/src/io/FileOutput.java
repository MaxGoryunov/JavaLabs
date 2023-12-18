package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public final class FileOutput {
    private String path;
    private LongOutput output;

    public FileOutput(String path, LongOutput output) {
        this.path = path;
        this.output = output;
    }

    public void Write(String text, HashMap<Byte, String> codes, int length, String inputFilename) throws Exception {
        byte[] name = inputFilename.getBytes();
        for (byte sym : name) {
            this.output.write(sym, Sizes.CHAR_SIZE.size);
        }
        this.output.write(0, Sizes.CHAR_SIZE.size);
        this.output.write(length, Sizes.INT_SIZE.size);
        this.output.write(0, Sizes.CHAR_SIZE.size);
        this.output.write(codes.size(), Sizes.INT_SIZE.size);
        this.output.write(0, Sizes.CHAR_SIZE.size);
        for (Map.Entry<Byte, String> entry : codes.entrySet()) {
            String encoding = entry.getValue();
            this.output.write(entry.getKey(), Sizes.CHAR_SIZE.size);
            this.output.write(encoding.length(), Sizes.INT_SIZE.size);
            //System.out.println(entry.getKey() + " => " + encoding);
            for (Character ch : encoding.toCharArray()) {
                this.output.write(ch == '1');
            }
        }
        this.output.write(0, Sizes.CHAR_SIZE.size);

        for (Character ch : text.toCharArray()) {
            this.output.write(ch == '1');
        }
        this.output.close();
    }
}
