import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.Before;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount(1000.0);
    }

    @Test
    public void testInitialBalance() {
        assertEquals(1000.0, account.getBalance());
    }

    @Test
    public void testdeposit1() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance());
    }

    @Test
    public void testdeposit2() {
        account.deposit(50);
        assertEquals(1050.0, account.getBalance());
    }

    // 1. Verify constructor rejects negative balance
    @Test
    public void testConstructorWithNegativeBalance() {

        Exception exception = assertThrows(
            IllegalArgumentException.class,() -> 
            new BankAccount(-500.0)
        );
        assertEquals("Initial balance cannot be negative",exception.getMessage());
    }

    // 2. Ensure valid deposit increases balance correctly
    @Test
    public void testValidDeposit() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance());
    }

    // 3. Verify invalid deposit values throw exception
    @Test
    public void testDepositZeroAmount() {

        Exception exception = assertThrows( 
            IllegalArgumentException.class,() -> 
            account.deposit(0));
        assertEquals("Deposit amount must be positive",exception.getMessage());
    }

    @Test
    public void testDepositNegativeAmount() {

        Exception exception = assertThrows(
            IllegalArgumentException.class,() -> 
            account.deposit(-100));
        assertEquals("Deposit amount must be positive",exception.getMessage());
    }

    // 4. Verify exact balance withdrawal leaves zero balance
    @Test
    public void testCompleteWithdrawal() {

        account.withdraw(1000.0);
        assertEquals(0.0, account.getBalance());
    }

    // 5. Verify overdrawing throws IllegalStateException
    @Test
    public void testOverdrawAccount() {

        Exception exception = assertThrows(
            IllegalStateException.class,() -> 
            account.withdraw(1500.0));

        assertEquals("Insufficient funds",exception.getMessage());
    }


}