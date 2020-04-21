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
public class TransactionTypeTest {
    
    public TransactionTypeTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /*
     * Test of values method, of class TransactionType.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        TransactionType[] expResult = null;
        TransactionType[] result = TransactionType.values();
        assertArrayEquals(expResult, result);
    }

    /*
     * Test of valueOf method, of class TransactionType.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        TransactionType expResult = null;
        TransactionType result = TransactionType.valueOf(string);
        assertEquals(expResult, result);
    }
    
}
