package EA2;

public class Foo {
    private static int i = 3;

    final Object s;

    private Foo(int i, String s) {
        this.i = i;
        this.s = s;
    }

    Foo(Foo f) {
        this.i = f.i;
        this.s = f.s;
    }

    int m() {
        String s = "Hallo";
        System.out.println(s);
        return 42;
    }

    int m(int a) {
        return i;
    }

    static void x() {
        System.out.println(i);
    }
}