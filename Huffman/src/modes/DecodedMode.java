package modes;

import io.FileInput;
import transformations.Decoded;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public final class DecodedMode {
    private final String path;
    private final Decoded decoded;

    public DecodedMode(String path) throws Exception {
        this.path = path;
        this.decoded = new Decoded(new FileInput(this.path));
    }
    public String destination() {
        return this.path + ".restored.txt";
    }

    public HashMap<String, Character> reversedCodes() {
        return this.decoded.reversedCodes();
    }

    public void decode() throws Exception {
        String message = this.decoded.message();
        Files.write(Paths.get(this.destination()), message.getBytes());
    }
}
