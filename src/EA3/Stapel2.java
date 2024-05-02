package EA3;

public class Stapel2 {
    private ListWithInternalArray list = new ListWithInternalArray();

    // legt ein Element auf den Stapel
    public void push(Object element) { 
        this.list.add(element, this.list.getSize());
    }

    // liefert eine Referenz auf das oberste Element des Stapel
    public Object peek() { 
        return this.list.getElementAt(this.list.getSize() - 1);   
    }

    // liefert eine Referenz auf das oberste Element des Stapel. 
    // Gleichzeitig wird das Element vom Stapel entfernt
    public Object pop() { 
        return this.list.removeElementAt(this.list.getSize() - 1);
    }
    
    // gibt an, ob der Stapel leer ist
    public boolean isEmpty() { 
        return this.list.getSize() == 0;
    }
}
