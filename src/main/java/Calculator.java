public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (a == 0) {
            throw new IllegalArgumentException("Делить на ноль нельзя");
        }
        return a / b;

    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver(int a, int b, int c, int d) {
        //(a+b)-(c*d)
        int sum = add(a,b);
        int mult = times(c, d);
        int res = dif(sum, mult);
        return res;

    }
}

