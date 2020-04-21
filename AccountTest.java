//package
package javaprogram.bankingtestclasses;
//imports
import java.time.LocalDateTime;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
 * @author Roland Colon III
 */
public class AccountTest {
    
    public AccountTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /*
     * Test of deposit method, of class Account.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        double amount = 0.0;
        Account instance = null;
        instance.deposit(amount);
    }

    /*
     * Test of withdraw method, of class Account.
     */
    @Test
    public void testWithdraw() {
        System.out.println("withdraw");
        double amount = 0.0;
        Account instance = null;
        instance.withdraw(amount);
    }

    /*
     * Test of transfer method, of class Account.
     */
    @Test
    public void testTransfer() {
        System.out.println("transfer");
        Account fromAccount = null;
        Account toAccount = null;
        double amount = 0.0;
        Account.transfer(fromAccount, toAccount, amount);
    }

    /*
     * Test of getAccountDescription method, of class Account.
     */
    @Test
    public void testGetAccountDescription() {
        System.out.println("getAccountDescription");
        Account instance = null;
        String expResult = "";
        String result = instance.getAccountDescription();
        assertEquals(expResult, result);
    }

    /*
     * Test of setAccountDescription method, of class Account.
     */
    @Test
    public void testSetAccountDescription() {
        System.out.println("setAccountDescription");
        String accountDescription = "";
        Account instance = null;
        instance.setAccountDescription(accountDescription);
    }

    /*
     * Test of getBalance method, of class Account.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        Account instance = null;
        double expResult = 0.0;
        double result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
    }

    /*
     * Test of getTransactions method, of class Account.
     */
    @Test
    public void testGetTransactions() {
        System.out.println("getTransactions");
        Account instance = null;
        List<Transaction> expResult = null;
        List<Transaction> result = instance.getTransactions();
        assertEquals(expResult, result);
    }

    /*
     * Test of getTransaction method, of class Account.
     */
    @Test
    public void testGetTransaction() {
        System.out.println("getTransaction");
        int transactionId = 0;
        Account instance = null;
        Transaction expResult = null;
        Transaction result = instance.getTransaction(transactionId);
        assertEquals(expResult, result);
    }

    /*
     * Test of getAccountId method, of class Account.
     */
    @Test
    public void testGetAccountId() {
        System.out.println("getAccountId");
        Account instance = null;
        String expResult = "";
        String result = instance.getAccountId();
        assertEquals(expResult, result);
    }

    /*
     * Test of getCustomerId method, of class Account.
     */
    @Test
    public void testGetCustomerId() {
        System.out.println("getCustomerId");
        Account instance = null;
        String expResult = "";
        String result = instance.getCustomerId();
        assertEquals(expResult, result);
    }

    /*
     * Test of getAccountCreationDate method, of class Account.
     */
    @Test
    public void testGetAccountCreationDate() {
        System.out.println("getAccountCreationDate");
        Account instance = null;
        LocalDateTime expResult = null;
        LocalDateTime result = instance.getAccountCreationDate();
        assertEquals(expResult, result);
    }

    /*
     * Test of hashCode method, of class Account.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Account instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /*
     * Test of equals method, of class Account.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Account instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /*
     * Test of compareTo method, of class Account.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Account other = null;
        Account instance = null;
        int expResult = 0;
        int result = instance.compareTo(other);
        assertEquals(expResult, result);
    }

    /*
     * Test of toString method, of class Account.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Account instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    public class AccountImpl extends Account {

        public AccountImpl() {
            super(null, 0.0, "");
        }

        public void deposit(double amount) {
        }

        public void withdraw(double amount) {
        }
    }
    
}
