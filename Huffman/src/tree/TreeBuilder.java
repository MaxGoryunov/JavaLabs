package tree;

import java.util.PriorityQueue;

public class TreeBuilder {
    private final Ordered symbols;

    public TreeBuilder(final Ordered symbols) {
        this.symbols = symbols;
    }

    public Tree value() {
        PriorityQueue<Symbol> queue = this.symbols.value();
        while (queue.size() > 1) {
            queue.add(
                new Symbol('_', 0)
                        .withLeft(queue.poll())
                        .withRight(queue.poll())
            );
        }
        return new Tree(queue.poll());
    }
}
