package io;

public enum Sizes {
    CHAR_SIZE(8),
    INT_SIZE(32);

    public final int size;

    Sizes(int size) {
        this.size = size;
    }
}
