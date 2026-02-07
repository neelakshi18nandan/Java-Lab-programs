final class Bank {   // final class
    final double interestRate = 7.5;   // final variable

    final void displayRate() {          // final method
        System.out.println("Interest Rate = " + interestRate + "%");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.displayRate();

       
    }
}
