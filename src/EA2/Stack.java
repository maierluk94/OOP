package EA2;

public class Stack {
    Entry header = new Entry("", null);

    void push(String value) {
        Entry newEntry = new Entry(value, header.next);
        header.next = newEntry;
    }

    String peek() {
        if (isEmpty()) throw new java.util.NoSuchElementException();
        return header.next.value;
    }

    String pop() {
        if (isEmpty()) throw new java.util.NoSuchElementException();
        Entry popEntry = header.next;
        header.next = popEntry.next;
        return popEntry.value;
    }

    boolean isEmpty() {
        return (header.next == null);
    }
}

class Entry {
    String value;
    Entry next;

    Entry(String value, Entry next) {
        this.value = value;
        this.next = next;
    }
}