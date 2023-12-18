package modes;

import io.FileInput;
import transformations.Decoded;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public final class DecodedMode {
    private final String path;
    private String destination = "";
    private final Decoded decoded;

    public DecodedMode(String path) throws Exception {
        this.path = path;
        this.decoded = new Decoded(new FileInput(this.path));
    }
    private String destination() throws Exception {
        this.destination = this.path.substring(0, this.path.lastIndexOf('.')) + ".res." + this.decoded.extension();
        return this.destination;
    }

    public String Destination() {
        return this.destination;
    }


    public HashMap<String, Byte> reversedCodes() {
        return this.decoded.reversedCodes();
    }

    public void decode() throws Exception {
        //String extension = this.decoded.extension();
//        String message = this.decoded.message();
        Files.write(Paths.get(this.destination()), this.decoded.message());
    }
}
