package transformations;

import io.FileInput;
import io.LongInput;
import io.SingleInput;

import java.util.HashMap;

public class Decoded {
    private final FileInput input;
    private HashMap<String, Character> reversed;

    public Decoded(FileInput input) {
        this.input = input;
        this.reversed = new HashMap<>();
    }

    public String message() throws Exception {
        this.reversed = this.input.reverseCodes();
        StringBuilder message = new StringBuilder();
        String current = "";
        int bit;
        while ((bit = this.input.bit()) != -1) {
            current += bit;
            if (this.reversed.containsKey(current)) {
                message.append(this.reversed.get(current));
                current = "";
            }
        }
        return message.toString();
    }

    public HashMap<String, Character> reversedCodes() {
        return this.reversed;
    }
}
