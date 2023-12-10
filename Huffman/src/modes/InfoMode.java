package modes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public final class InfoMode {
    private void printCompressionInfo(String source, String destination) throws Exception {
        long before = Files.size(Paths.get(source));
        long after = Files.size(Paths.get(destination));
        System.out.println("Source file size: " + before);
        System.out.println("Destination file size: " + after);
        System.out.println("Compression: " + (double)before / after);
    }

    private void printTree(HashMap<String, Character> reversed) {
        System.out.println("Huffman tree");
        reversed.forEach((encoding, symbol) -> {
            System.out.println(symbol + " <=>" + encoding);
        });
    }

    public void info(String path) throws Exception {
        DecodedMode decoded = new DecodedMode(path);
        decoded.decode();
        this.printCompressionInfo(path, decoded.destination());
        this.printTree(decoded.reversedCodes());
    }
}
