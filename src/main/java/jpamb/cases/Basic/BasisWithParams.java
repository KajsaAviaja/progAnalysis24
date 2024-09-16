package jpamb.cases.Basic;

public class BasisWithParams {

    public static int identity(int a) {
        return a;
    }

    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int modulo(int a, int b) {
        return a % b;
    }

    public static int callPlus(int a, int b) {
        return plus(a, b);
    }

    public static int conditional(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int conditional2(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public static int conditional3(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int conditional4(int a, int b) {
        if (a <= b) {
            return a;
        } else {
            return b;
        }
    }

    public static int conditional5(int a, int b) {
        if (a == b) {
            return a;
        } else {
            return b;
        }
    }

    public static int conditional6(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }

    public static int conditional7(int a, int b) {
        if (a > b) {
            return a;
        }
        if (a < b) {
            return b;
        }
        return 0;
    }

}
