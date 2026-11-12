package BankAccount;

public class BankAccount {

    private String accountHolder;
    private String accountNumber;
    private double balance = 0;

    public BankAccount(
            String accountHolder,
            String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        // we are givint the startimg balance as 0, so that later on wee can implement
        // all the needed cheks when the money will be deposited. also just from a bank
        // point of view, when someone is just opening their account they don't have any
        // money in there from the beggining
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount <= 0 || !Double.isFinite(amount)) {
            throw new IllegalArgumentException("The deposit amount is invalid!");
        }

        this.balance += amount;

    }

    public void withdraw(double amount) {
        if (amount <= 0 || !Double.isFinite(amount)) {
            throw new IllegalArgumentException("The withdraw amount is invalid!");
        } else if (amount > this.balance) {
            throw new IllegalArgumentException("Insufficient ammount!");
        }

        this.balance -= amount;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alex", "12345678");

        account.deposit(500);
        account.withdraw(150);

        System.out.println(account.getBalance());
    }
}