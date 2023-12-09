package io;

import java.io.InputStream;

public class SingleInput {
    private final InputStream input;
    private int current = 0;
    private int position = 0;

    public SingleInput(InputStream input) {
        this.input = input;
    }

    public int value() throws Exception {
        if (this.position == 0) {
            int next = this.input.read();
            if (next == -1) {
                return next;
            }
            this.current = next;
            this.position = 8;
        }
        this.position--;
        return (this.current >> this.position) & 1;
    }
}
