package tree;

import org.w3c.dom.Node;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Ordered {
    private final Occurrences occurrences;

    public Ordered(Occurrences occurrences) {
        this.occurrences = occurrences;
    }

    public PriorityQueue<Symbol> value() {
        PriorityQueue<Symbol> queue = new PriorityQueue<>(Comparator.comparingInt(Symbol::occurrence));
        this.occurrences.byteValue().forEach((key, value) -> queue.add(new Symbol(key, value)));
        return queue;
    }
}
