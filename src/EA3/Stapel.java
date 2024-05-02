package EA3;

public class Stapel extends ListWithInternalArray {
    // legt ein Element auf den Stapel
    public void push(Object element) { 
        this.add(element, this.getSize());
    }

    // liefert eine Referenz auf das oberste Element des Stapel
    public Object peek() { 
        return this.getElementAt(this.getSize() - 1);   
    }

    // liefert eine Referenz auf das oberste Element des Stapel. 
    // Gleichzeitig wird das Element vom Stapel entfernt
    public Object pop() { 
        return this.removeElementAt(this.getSize() - 1);
    }
    
    // gibt an, ob der Stapel leer ist
    public boolean isEmpty() { 
        return this.getSize() == 0;
    }
}
