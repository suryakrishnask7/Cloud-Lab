public class Main {
    public static void main(String[] args) {
        System.out.println("This is a simple calculator program.");
        Calculator calculator = new Calculator();

        int sum = calculator.add(5, 3);
        int difference = calculator.subtract(10, 4);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        
    }
}