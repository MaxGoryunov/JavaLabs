import java.util.Arrays;

public class Triple<T extends Number & Comparable<T>> {
    private T key;
    private T value;
    private T another;
    public Triple(T key, T value, T another) {
        this.key = key;
        this.value = value;
        this.another = another;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getAnother() {
        return another;
    }

    public void setAnother(T another) {
        this.another = another;
    }

    public T min() {
        T res = this.key;
        if (this.value.compareTo(res) < 0) {
            res = this.value;
        }
        if (this.another.compareTo(res) < 0) {
            res = this.another;
        }
        return res;
    }

    public T max() {
        T res = this.key;
        if (this.value.compareTo(res) > 0) {
            res = this.value;
        }
        if (this.another.compareTo(res) > 0) {
            res = this.another;
        }
        return res;
    }

    public double mean() {
        return (this.key.doubleValue()
                + this.value.doubleValue()
                + this.another.doubleValue()
        ) / 3;
    }
}
