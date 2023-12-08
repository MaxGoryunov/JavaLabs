package io;

import java.io.InputStream;

public class BitsOf {
    private OneBit bit;

    public BitsOf(InputStream input) {
        this.bit = new OneBit(input);
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
