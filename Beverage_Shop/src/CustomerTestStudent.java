import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CustomerTestStudent {

    private Customer customer1;
    private Customer customer2;

    @Before
    public void setUp() throws Exception {
        customer1 = new Customer("John", 30);
        customer2 = new Customer(customer1); 
    }

    @After
    public void tearDown() throws Exception {
        customer1 = null;
        customer2 = null;
    }

    @Test
    public void testSetAge() {
        customer1.setAge(35);
        assertEquals(35, customer1.getAge());
    }

    @Test
    public void testCustomerCustomer() {
        assertNotSame(customer1, customer2); 
        assertEquals("John", customer2.getName());
        assertEquals(30, customer2.getAge());
    }

    @Test
    public void testGetName() {
        assertEquals("John", customer1.getName());
    }

    @Test
    public void testToString() {
        String expected = "Customer Name: John, Age: 30";
        assertEquals(expected, customer1.toString());
    }

    @Test
    public void testSetName() {
        customer1.setName("Sarah");
        assertEquals("Sarah", customer1.getName());
    }

    @Test
    public void testCustomerStringInt() {
        assertEquals("John", customer1.getName());
        assertEquals(30, customer1.getAge());
    }

    @Test
    public void testGetAge() {
        assertEquals(30, customer1.getAge());
    }
}