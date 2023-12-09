package io;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;

public class SingleOutput implements Closeable {
    private final OutputStream output;
    private int position = 0;
    private int current = 0;

    public SingleOutput(OutputStream output) {
        this.output = output;
    }

    public void write(boolean bit) throws Exception {
        this.current = (this.current << 1) | (bit ? 1 : 0);
        this.position++;

        if (this.position == 8) {
            this.output.write(this.current);
            this.current = 0;
            this.position = 0;
        }
    }

    @Override
    public void close() throws IOException {
        try {
            while (this.position > 0) {
                this.write(false);
                this.position--;
            }
        } catch (Exception e) {
            throw new IOException(e);
        } finally {
            this.output.close();
        }

    }
}
