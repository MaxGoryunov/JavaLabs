package io;

import java.io.Closeable;
import java.io.IOException;

public final class LongOutput implements Closeable {
    private final SingleOutput output;

    public LongOutput(SingleOutput output) {
        this.output = output;
    }

    public void write(boolean bit) throws Exception {
        this.output.write(bit);
    }

    public void write(int bit, int count) throws Exception {
        for (int i = count - 1; i >= 0; --i) {
            this.output.write(((bit >> i) & 1) == 1);
        }
    }

    public int position() {
        return this.output.position();
    }

    @Override
    public void close() throws IOException {
        this.output.close();
    }
}
