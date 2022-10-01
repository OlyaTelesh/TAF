public class Calculator {
    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Sorry, we can't / by zero");
        } else {
            return a/b;
        }
    }

    public double div(double i, double j) {
        if (j == 0) {
            throw new ArithmeticException("Sorry, we can't / by zero");
        } else {
            return i/j;
        }
    }
}
