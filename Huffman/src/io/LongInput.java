package io;

import java.io.InputStream;

public class LongInput {
    private final SingleInput bit;

    public LongInput(InputStream input) {
        this.bit = new SingleInput(input);
    }

    public int bit() throws Exception {
        return this.bit.value();
    }

    public int bits(int count) throws Exception {
        int res = 0;
        for (int i = 0; i < count; ++i) {
            int bit = this.bit.value();
            if (bit == -1) {
                return bit;
            }
            res = (res << 1) | bit;
        }
        return res;
    }
}
