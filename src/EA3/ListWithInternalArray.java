package EA3;

public class ListWithInternalArray {
    private Object[] list;

    // Fügt das übergebene Element an der angegebenen Position ein. 
    // Die nachfolgenden Elemente verschieben sich nach hinten.
    public void add(Object elem, int index) { 
        Object[] newList = this.list == null ? new Object[1] : new Object[this.list.length + 1];
        int offset = 0;

        for (int i = 0; i < newList.length; i++) {
            if (i == index) {
                newList[i] = elem;
                offset = -1; 
            }
            else {
                newList[i] = this.list[i + offset];
            }
        }

        this.list = newList;
    }

    // Liefert eine Referenz auf das Element an der angegebenen Position.
    public Object getElementAt(int index) { 
        return this.list[index];    
    }
    
    // Liefert eine Referenz auf das Element an der angegebenen Position und entfernt es 
    // gleichzeitig aus der Liste.  Nachfolgende Elemente werden ggf. nach vorne verschoben.
    public Object removeElementAt(int index) { 
        Object elem = this.list[index];
        Object newList[] = new Object[this.list.length - 1];
        int offset = 0;

        for (int i = 0; i < this.list.length; i++) {
            if (i == index) {
                offset = -1;
            }
            else {
                newList[i + offset] = this.list[i];
            }
        }

        this.list = newList;
        return elem;
    }
    
    // Liefert die Anzahl der Elemente in der Liste
    public int getSize() { 
        if (this.list == null) {
            return 0;
        }
        return this.list.length;
    }
}
