package EA2;
import EA2.Stack;

public class StackTest {
    public static void main(String[] args) {
        System.out.println("isEmpty() Test: " + (testIsEmpty() ? "Erfolgreich." : "Fehlgeschlagen."));
        System.out.println("push() und pop() Test: " + (testPushPop() ? "Erfolgreich." : "Fehlgeschlagen."));
        System.out.println("peek() Test: " + (testPeek() ? "Erfolgreich." : "Fehlgeschlagen."));
    }

    static boolean testIsEmpty() {
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        s2.push("Test");
        return s1.isEmpty() & !s2.isEmpty();
    }

    static boolean testPushPop() {
        Stack s = new Stack();
        s.push("1");
        s.push("2");
        s.push("3");
        return (s.pop() == "3") & (s.pop() == "2") & (s.pop() == "1");
    }

    static boolean testPeek() {
        Stack s = new Stack();
        s.push("Don't look at me!");
        s.push("Look at me!");
        return s.peek() == "Look at me!";
    }
}
