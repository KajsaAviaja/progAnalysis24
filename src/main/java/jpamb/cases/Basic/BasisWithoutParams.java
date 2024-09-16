package jpamb.cases.Basic;

public class BasisWithoutParams {

    public static int getOne() {
        return 1;
    }

    public static int plus() {
        return 1 + 2;
    }

    public static int minus() {
        return 1 - 2;
    }

    public static int multiply() {
        return 2 * 3;
    }

    public static int divide() {
        return 4 / 8;
    }

    public static int modulo() {
        return 5 % 42;
    }

    public static int conditional() {
        int a = 1;
        int b = 2;
        if (a > b) {
            return 1;
        } else {
            return 2;
        }
    }

    public static int conditional2() {
        int a = 1;
        int b = 2;
        if (a >= b) {
            return 1;
        } else {
            return 2;
        }
    }

    public static int conditional3() {
        int a = 1;
        int b = 2;
        if (a < b) {
            return 1;
        } else {
            return 2;
        }
    }

    public static int conditional4() {
        int a = 1;
        int b = 2;
        if (a <= b) {
            return 1;
        } else {
            return 2;
        }
    }

    public static int conditional5() {
        int a = 1;
        int b = 2;
        if (a == b) {
            return 1;
        } else {
            return 2;
        }
    }

    public static int conditional6() {
        int a = 1;
        int b = 2;
        if (a != b) {
            return 1;
        } else {
            return 2;
        }
    }

}
