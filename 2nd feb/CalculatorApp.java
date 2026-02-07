abstract class Calculator {
    abstract void add(int a, int b);
    abstract void subtract(int a, int b);
    abstract void multiply(int a, int b);
    abstract void divide(int a, int b);
}

class SimpleCalculator extends Calculator {

    void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    void subtract(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }

    void multiply(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }

    void divide(int a, int b) {
        if (b != 0)
            System.out.println("Division = " + (a / b));
        else
            System.out.println("Cannot divide by zero");
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calc = new SimpleCalculator();

        calc.add(10, 5);
        calc.subtract(10, 5);
        calc.multiply(10, 5);
        calc.divide(10, 5);
    }
}
