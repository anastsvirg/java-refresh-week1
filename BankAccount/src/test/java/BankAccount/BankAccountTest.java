package BankAccount;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    @Test
    void depositShouldIncreaseBalance() {

        BankAccount account = new BankAccount("Alex", "12345678");

        account.deposit(500);

        assertEquals(500.0, account.getBalance());
    }

    @Test
    void withdrawShouldDecreaseBalance() {
        BankAccount account = new BankAccount("Alex", "12345678");
        // it's better to create a new account all the time, so we would have a mock up
        // acc specifically made for a test than doing all the checkings with already
        // existing one

        account.deposit(500);
        account.withdraw(150);

        assertEquals(350.0, account.getBalance());
    }

    @Test
    void depositShouldRejectNegativeAmount() {
        BankAccount account = new BankAccount("Alex", "12345678");

        assertThrows(
                IllegalArgumentException.class,
                () -> account.deposit(-100));
        assertEquals(0.0, account.getBalance());

        // we put account.deposit inside assertThrows because we need to catch an
        // exception while we are trying to run our program and not to check the end
        // result of our method
    }

    @Test
    void withdrawShouldRejectInsufficientFunds() {
        BankAccount account = new BankAccount("Alex", "12345678");
        account.deposit(200);
        assertThrows(
                IllegalArgumentException.class,
                () -> account.withdraw(500));
        assertEquals(200, account.getBalance());

    }
}