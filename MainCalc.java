import java.util.Scanner;

class Calculation {
    int a, b;

    Calculation(int x, int y) {
        a = x;
        b = y;
    }

    void sum() {
        System.out.println("Sum = " + (a + b));
    }

    void sub() {
        System.out.println("Subtraction = " + (a - b));
    }

    void div() {
        System.out.println("Division = " + (a / b));
    }
}

public class MainCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        Calculation c = new Calculation(x, y);

        System.out.println("1.Sum  2.Subtraction  3.Division");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1: c.sum(); break;
            case 2: c.sub(); break;
            case 3: c.div(); break;
            default: System.out.println("Invalid choice");
        }
    }
}
