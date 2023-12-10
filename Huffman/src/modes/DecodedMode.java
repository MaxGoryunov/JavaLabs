package modes;

import io.FileInput;
import transformations.Decoded;

import java.nio.file.Files;
import java.nio.file.Paths;

public final class DecodedMode {
    public void decode(String path) throws Exception {
        String message = new Decoded(new FileInput(path)).message();
        Files.write(Paths.get(path + ".out.txt"), message.getBytes());
    }
}
