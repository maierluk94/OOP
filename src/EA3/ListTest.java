package EA3;

public class ListTest {
    public static void main(String[] args) {
        ListWithInternalArray test = new ListWithInternalArray();
        test.add(1, 0);
        test.add(2, 1);
        test.add(3, 2);

        System.out.println(test.removeElementAt(1));

        for (int i = 0; i < test.getSize(); i++) {
            System.out.println(test.getElementAt(i));
        }

        System.out.println("");

        Stapel2 stapel = new Stapel2();
        stapel.push(0);
        stapel.push(1);
        stapel.push(2);
        stapel.push(3);

        
        System.out.println(stapel.peek());
        System.out.println(stapel.pop());
    }
}
