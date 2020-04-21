//package
package javaprogram.bankingtestclasses;
//imports
import java.time.LocalDateTime;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
 * @author Roland Colon III
 */
public class TransactionTest {
    
    public TransactionTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /*
     * Test of getId method, of class Transaction.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Transaction instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /*
     * Test of getTimestamp method, of class Transaction.
     */
    @Test
    public void testGetTimestamp() {
        System.out.println("getTimestamp");
        Transaction instance = null;
        LocalDateTime expResult = null;
        LocalDateTime result = instance.getTimestamp();
        assertEquals(expResult, result);
    }

    /*
     * Test of getType method, of class Transaction.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Transaction instance = null;
        TransactionType expResult = null;
        TransactionType result = instance.getType();
        assertEquals(expResult, result);
    }

    /*
     * Test of getAmount method, of class Transaction.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Transaction instance = null;
        double expResult = 0.0;
        double result = instance.getAmount();
        assertEquals(expResult, result, 0.0);
    }

    /*
     * Test of getDescription method, of class Transaction.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Transaction instance = null;
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }

    /*
     * Test of toString method, of class Transaction.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Transaction instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /*
     * Test of hashCode method, of class Transaction.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Transaction instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /*
     * Test of equals method, of class Transaction.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Transaction instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /*
     * Test of compareTo method, of class Transaction.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Transaction other = null;
        Transaction instance = null;
        int expResult = 0;
        int result = instance.compareTo(other);
        assertEquals(expResult, result);
    }
    
}
