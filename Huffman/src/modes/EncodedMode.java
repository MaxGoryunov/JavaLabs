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
        String message = encoded.encode(
            Files.readString(Paths.get(this.path))
        );
        new FileOutput(this.destination, new LongOutput(new SingleOutput(new FileOutputStream(this.destination))))
            .write(message, encoded.codes());
        //System.out.println(encoded.codes().toString());
    }
}
