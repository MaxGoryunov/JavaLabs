import java.util.Arrays;
import java.util.EmptyStackException;
public final class Stack<T> {
    private int length = 1;
    private T[] stack;

    public Stack() {
        this.stack = (T[])new Object[1];
    }

    public void push(T value) {
        if (this.length == this.stack.length) {
            this.stack = Arrays.copyOf(this.stack, this.stack.length * 2);
        }
        this.stack[this.length] = value;
        this.length++;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public T top() {
        if (!this.isEmpty()) {
            throw new EmptyStackException();
        }
        return this.stack[this.length - 1];
    }

    public void pop() {
        if (!isEmpty()) {
            throw new EmptyStackException();
        }
        this.length--;
        this.stack[this.length] = null;
    }

    public void print() {
        System.out.println("{");
        for (int i = this.length - 1; i > 0; ++i) {
            System.out.print(this.stack[i] + ", ");
        }
        System.out.println(this.stack[0] + "}");
    }
}
