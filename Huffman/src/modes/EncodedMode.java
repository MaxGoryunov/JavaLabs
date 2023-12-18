package modes;

import io.FileOutput;
import io.LongOutput;
import io.SingleOutput;
import transformations.Encoded;

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EncodedMode {
    private final String path;
    private final String destination;

    public EncodedMode(String path, String destination) {
        this.path = path;
        this.destination = destination;
    }

    public void encode() throws Exception {
        Encoded encoded = new Encoded();
//        String source = Files.readString(Paths.get(this.path));
        byte[] source = Files.readAllBytes(Paths.get(this.path));
        String message = encoded.encode(
            source
        );
        //System.out.println("length = " + source.length);
        new FileOutput(this.destination, new LongOutput(new SingleOutput(new FileOutputStream(this.destination))))
            .Write(
                message,
                encoded.Codes(),
                source.length,
                this.path.substring(this.path.lastIndexOf('.') + 1)
            );
        //System.out.println(encoded.codes().toString());
    }
}
