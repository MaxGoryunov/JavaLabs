package transformations;

import io.FileInput;
import io.LongInput;
import io.SingleInput;

import java.util.HashMap;

public class Decoded {
    private final FileInput input;
    private HashMap<String, Byte> reversed;

    public Decoded(FileInput input) {
        this.input = input;
        this.reversed = new HashMap<>();
    }

    public byte[] message() throws Exception {
        this.reversed = this.input.ReverseCodes();
//        StringBuilder message = new StringBuilder();
//        byte[] message = {};
        String current = "";
        //System.out.println("here");
        //System.out.println(this.reversed);
        int bit;
        int bound = this.input.count();
        int count = 0;
        byte[] message = new byte[bound];
        while (((bit = this.input.bit()) != -1) && (count < bound)) {
            current += bit;
            if (this.reversed.containsKey(current)) {
//                message.append(this.reversed.get(current));
                message[count] = this.reversed.get(current);
                current = "";
                count++;
                //System.out.println(count);
            }
        }
        System.out.println(current);
        return message;
//        return message.toString();
    }

    public String extension() throws Exception {
        return this.input.extension();
    }

    public HashMap<String, Byte> reversedCodes() {
        return this.reversed;
    }
}
