package modes;

import io.FileOutput;
import io.LongOutput;
import io.SingleOutput;
import transformations.Encoded;

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EncodedMode {
    public void encode(String path) throws Exception {
        Encoded encoded = new Encoded();
        String message = encoded.encode(
            Files.readString(Paths.get(path))
        );
        new FileOutput("out.txt", new LongOutput(new SingleOutput(new FileOutputStream("out.txt"))))
            .write(message, encoded.codes());
        System.out.println(encoded.codes().toString());
    }
}
