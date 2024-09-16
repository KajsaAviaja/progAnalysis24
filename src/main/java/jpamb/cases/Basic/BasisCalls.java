package jpamb.cases.Basic;

public class BasisCalls {

    public static int foo() {
        return 1;
    }

    public static int bar() {
        return foo() + 1;
    }

    public static int baz() {
        return bar() + 1;
    }

    public static int identity(int a) {
        return a;
    }

    public static int one() {
        int a = 1;
        return identity(a);
    }

    public static int duple(int a) {
        int b = identity(a);
        return a + b;
    }

}
