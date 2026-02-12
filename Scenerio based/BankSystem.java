import java.util.ArrayList;
import java.util.List;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Error: Insufficient funds for withdrawal of $" + amount);
        }
        balance -= amount;
        System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
    }

    public void transfer(Account targetAccount, double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Error: Insufficient funds for transfer.");
        }
        this.withdraw(amount);
        targetAccount.deposit(amount);
        System.out.println("Transferred $" + amount + " to " + targetAccount.accountHolderName);
    }

    public void displayAccountDetails() {
        System.out.println("Account: " + accountNumber + " | Holder: " + accountHolderName + " | Balance: $" + balance);
    }

    public String getAccountNumber() { return accountNumber; }
}

class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void createAccount(String accNum, String name, double initial) {
        accounts.add(new Account(accNum, name, initial));
        System.out.println("Account created for " + name);
    }

    public Account getAccount(String accNum) {
        for (Account a : accounts) {
            if (a.getAccountNumber().equals(accNum)) return a;
        }
        return null;
    }

    public void displayAllAccounts() {
        System.out.println("\n--- All Bank Accounts ---");
        for (Account a : accounts) a.displayAccountDetails();
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Bank myBank = new Bank();
        myBank.createAccount("101", "Alice", 1000.0);
        myBank.createAccount("102", "Bob", 500.0);

        Account alice = myBank.getAccount("101");
        Account bob = myBank.getAccount("102");

        try {
            alice.deposit(200);
            alice.transfer(bob, 300);
            bob.withdraw(1000); // This will trigger the exception
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        myBank.displayAllAccounts();
    }
}