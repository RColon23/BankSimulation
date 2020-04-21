//package
package javaprogram.bankingtestclasses;
//imports
import java.util.SortedSet;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
 * @author Roland Colon III
 */
public class CustomerTest {
    
    public CustomerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /*
     * Test of getBank method, of class Customer.
     */
    @Test
    public void testGetBank() {
        System.out.println("getBank");
        Customer instance = null;
        Bank expResult = null;
        Bank result = instance.getBank();
        assertEquals(expResult, result);
    }

    /*
     * Test of getCustomerId method, of class Customer.
     */
    @Test
    public void testGetCustomerId() {
        System.out.println("getCustomerId");
        Customer instance = null;
        String expResult = "";
        String result = instance.getCustomerId();
        assertEquals(expResult, result);
    }

    /*
     * Test of getLastName method, of class Customer.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Customer instance = null;
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
    }

    /*
     * Test of getFirstName method, of class Customer.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Customer instance = null;
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }

    /*
     * Test of getCustomerAccounts method, of class Customer.
     */
    @Test
    public void testGetCustomerAccounts() {
        System.out.println("getCustomerAccounts");
        Customer instance = null;
        SortedSet<Account> expResult = null;
        SortedSet<Account> result = instance.getCustomerAccounts();
        assertEquals(expResult, result);
    }

    /*
     * Test of ytdFees method, of class Customer.
     */
    @Test
    public void testYtdFees() {
        System.out.println("ytdFees");
        Customer instance = null;
        double expResult = 0.0;
        double result = instance.ytdFees();
        assertEquals(expResult, result, 0.0);
    }

    /*
     * Test of ytdInterest method, of class Customer.
     */
    @Test
    public void testYtdInterest() {
        System.out.println("ytdInterest");
        Customer instance = null;
        double expResult = 0.0;
        double result = instance.ytdInterest();
        assertEquals(expResult, result, 0.0);
    }

    /*
     * Test of addSavingsAccount method, of class Customer.
     */
    @Test
    public void testAddSavingsAccount() {
        System.out.println("addSavingsAccount");
        double initBal = 0.0;
        String desc = "";
        Customer instance = null;
        SavingsAccount expResult = null;
        SavingsAccount result = instance.addSavingsAccount(initBal, desc);
        assertEquals(expResult, result);
    }

    /*
     * Test of removeAccount method, of class Customer.
     */
    @Test
    public void testRemoveAccount() {
        System.out.println("removeAccount");
        String accountId = "";
        Customer instance = null;
        instance.removeAccount(accountId);
    }

    /*
     * Test of getAccount method, of class Customer.
     */
    @Test
    public void testGetAccount() {
        System.out.println("getAccount");
        String accountId = "";
        Customer instance = null;
        Account expResult = null;
        Account result = instance.getAccount(accountId);
        assertEquals(expResult, result);
    }

    /*
     * Test of toString method, of class Customer.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Customer instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /*
     * Test of hashCode method, of class Customer.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Customer instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /*
     * Test of equals method, of class Customer.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Customer instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /*
     * Test of compareTo method, of class Customer.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Customer other = null;
        Customer instance = null;
        int expResult = 0;
        int result = instance.compareTo(other);
        assertEquals(expResult, result);
    }
    
}
