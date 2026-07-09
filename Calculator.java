public class Calculator {
    public int multiply(int a, int b) {
        System.out.println("DIvakar DHAN MASS EY");
        return a * b;
    }

    public double divide(int a, int b) {

        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }

        return (double) a / b;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

}
