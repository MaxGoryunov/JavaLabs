package transformations;

import io.FileInput;
import io.LongInput;
import io.SingleInput;

import java.util.HashMap;

public class Decoded {
    private final FileInput input;

    public Decoded(FileInput input) {
        this.input = input;
    }

    public String message() throws Exception {
        HashMap<String, Character> codes = this.input.reverseCodes();
        StringBuilder message = new StringBuilder();
        String current = "";
        int bit;
        while ((bit = this.input.bit()) != -1) {
            current += bit;
            if (codes.containsKey(current)) {
                message.append(codes.get(current));
                current = "";
            }
        }
        return message.toString();
    }
}
