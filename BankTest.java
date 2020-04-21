//package
package javaprogram.bankingtestclasses;
//imports
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.SortedSet;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
 * @author Roland Colon III
 */
public class BankTest {
    
    public BankTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /*
     * Test of main method, of class Bank.
     */
    //initializes tasks ex:persistence
    //persistence is not implemented in project
    //testing this method may be skipped for now
    @Test
    public void testMain() {
        PrintStream savedOutputStream = System.out;
        ByteArrayOutputStream baos = new
        ByteArrayOutputStream();
        PrintStream pw = new PrintStream(baos);
        System.setOut(pw);
        System.setOut(savedOutputStream);
        pw.flush();
        System.setOut(savedOutputStream);
        pw.flush();
        String actualOutput = baos.toString();
        System.out.println("main");
        String[] args = null;
        Bank.main(args);
    }

    /*
     * Test of getInsufficientFundsPenalty method, of class Bank.
     */
    //returns insuffucuentFundsPenalty
    @Test
    public void testGetInsufficientFundsPenalty() {
        System.out.println("getInsufficientFundsPenalty");
        Bank instance = null;
        double expResult = 0.0;
        double result = instance.getInsufficientFundsPenalty();
        assertEquals(expResult, result, 0.0);
    }

    /*
     * Test of setInsufficientFundsPenalty method, of class Bank.
     */
    //paramater double insuffieceintFundsPenalty
    @Test
    public void testSetInsufficientFundsPenalty() {
        System.out.println("setInsufficientFundsPenalty");
        double insufficientFundsPenalty = 0.0;
        Bank instance = null;
        instance.setInsufficientFundsPenalty(insufficientFundsPenalty);
    }

    /*
     * Test of getNAME method, of class Bank.
     */
    //returns the name of the bank (String)
    @Test
    public void testGetNAME() {
        System.out.println("getNAME");
        Bank instance = null;
        String expResult = "";
        String result = instance.getNAME();
        assertEquals(expResult, result);
    }

    /*
     * Test of addAccountWizard method, of class Bank.
     */
    //adds a new bank account
    @Test
    public void testAddAccountWizard() {
        System.out.println("addAccountWizard");
        Bank instance = null;
        instance.addAccountWizard();
    }

    /**
     * Test of getAllAccounts method, of class Bank.
     */
    @Test
    public void testGetAllAccounts() {
        System.out.println("getAllAccounts");
        Bank instance = null;
        SortedSet<Account> expResult = null;
        SortedSet<Account> result = instance.getAllAccounts();
        assertEquals(expResult, result);
    }

    /**
     * Test of addCustomerWizard method, of class Bank.
     */
    @Test
    public void testAddCustomerWizard() {
        System.out.println("addCustomerWizard");
        Bank instance = null;
        instance.addCustomerWizard();
    }

    /*
     * Test of addCustomer method, of class Bank.
     */
    // adds a new customer to the bank, returns customer ID (string lastName, String firstName)
    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        String lastName = "";
        String firstName = "";
        Bank instance = null;
        String expResult = "";
        String result = instance.addCustomer(lastName, firstName);
        assertEquals(expResult, result);
    }

    /*
     * Test of removeCustomer method, of class Bank.
     */
    //marks customer as non-current
    //parameter is customer ID (string)
    @Test
    public void testRemoveCustomer() {
        System.out.println("removeCustomer");
        String customerId = "";
        Bank instance = null;
        instance.removeCustomer(customerId);
    }

    /*
     * Test of getAllCustomers method, of class Bank.
     */
    //makes a set of all curent customers using ID to sort them
    @Test
    public void testGetAllCustomers() {
        System.out.println("getAllCustomers");
        Bank instance = null;
        SortedSet<Customer> expResult = null;
        SortedSet<Customer> result = instance.getAllCustomers();
        assertEquals(expResult, result);
    }

    /*
     * Test of getCustomer method, of class Bank.
     */
    //retrieves an exact customer by entering ID
    @Test
    public void testGetCustomer_String() {
        System.out.println("getCustomer");
        String customerId = "";
        Bank instance = null;
        Customer expResult = null;
        Customer result = instance.getCustomer(customerId);
        assertEquals(expResult, result);
    }

    /*
     * Test of getCustomer method, of class Bank.
     */
    //parameters (String lastName, String firstName)
    @Test
    public void testGetCustomer_String_String() {
        System.out.println("getCustomer");
        String lastName = "";
        String firstName = "";
        Bank instance = null;
        List<Customer> expResult = null;
        List<Customer> result = instance.getCustomer(lastName, firstName);
        assertEquals(expResult, result);
    }

    /**
     * Test of getCustomersAccounts method, of class Bank.
     */
    //makes a list of customer accounts using customer ID
    @Test
    public void testGetCustomersAccounts() {
        System.out.println("getCustomersAccounts");
        String customerId = "";
        Bank instance = null;
        List<Account> expResult = null;
        List<Account> result = instance.getCustomersAccounts(customerId);
        assertEquals(expResult, result);
    }
    
}
