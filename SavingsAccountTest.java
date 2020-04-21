//package
package javaprogram.bankingtestclasses;
//imports
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
 * @author Roland Colon III
 */
public class SavingsAccountTest {
    
    public SavingsAccountTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /*
     * Test of deposit method, of class SavingsAccount.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        double amount = 0.0;
        SavingsAccount instance = null;
        instance.deposit(amount);
    }

    /*
     * Test of withdraw method, of class SavingsAccount.
     */
    @Test
    public void testWithdraw() {
        System.out.println("withdraw");
        double amount = 0.0;
        SavingsAccount instance = null;
        instance.withdraw(amount);
    }

    /*
     * Test of addInterestTransaction method, of class SavingsAccount.
     */
    @Test
    public void testAddInterestTransaction() {
        System.out.println("addInterestTransaction");
        double rate = 0.0;
        SavingsAccount instance = null;
        instance.addInterestTransaction(rate);
    }

    /*
     * Test of getDefaultInterestRate method, of class SavingsAccount.
     */
    @Test
    public void testGetDefaultInterestRate() {
        System.out.println("getDefaultInterestRate");
        double expResult = 0.0;
        double result = SavingsAccount.getDefaultInterestRate();
        assertEquals(expResult, result, 0.0);
    }

    /*
     * Test of setDefaultInterestRate method, of class SavingsAccount.
     */
    @Test
    public void testSetDefaultInterestRate() {
        System.out.println("setDefaultInterestRate");
        double interestRate = 0.0;
        SavingsAccount.setDefaultInterestRate(interestRate);
    }
    
}
