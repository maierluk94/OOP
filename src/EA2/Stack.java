package EA2;

public class Stack {
    Entry header = new Entry("", null);

    public void push(String value) {
        Entry newEntry = new Entry(value, header.next);
        header.next = newEntry;
    }

    public String peek() {
        if (this.isEmpty()) throw new java.util.NoSuchElementException();
        return header.next.value;
    }

    public String pop() {
        if (this.isEmpty()) throw new java.util.NoSuchElementException();
        Entry popEntry = header.next;
        header.next = popEntry.next;
        return popEntry.value;
    }

    public boolean isEmpty() {
        return (header.next == null);
    }

    public String toString() {
        String s = "";
        int counter = 1;
        Entry currentEntry = header.next;
        if (currentEntry == null) return "Der Stack ist leer.";
        while (currentEntry != null) {
            s += String.format("Position %d: %s\n", counter, currentEntry.value);
            counter++;
            currentEntry = currentEntry.next;
        }
        return s.substring(0, s.length() - 1);
    }

    private static class Entry {
        String value;
        Entry next;
    
        Entry(String value, Entry next) {
            this.value = value;
            this.next = next;
        }
    }
}

