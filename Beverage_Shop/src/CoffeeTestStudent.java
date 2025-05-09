import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CoffeeTestStudent {

    private Coffee coffee1;
    private Coffee coffee2;
    private Coffee coffee3;
    
    @Before
    public void setUp() throws Exception {
        coffee1 = new Coffee("Mocha", Size.LARGE, false, true);
        coffee2 = new Coffee("Mocha", Size.LARGE, false, true);
        coffee3 = new Coffee("Mocha", Size.SMALL, true, false);
    }

    @After
    public void tearDown() throws Exception {
        coffee1 = null;
        coffee2 = null;
        coffee3 = null;
    }

    @Test
    public void testCalcPrice() {
        double basePrice = coffee1.addSizePrice();
        double expectedPrice = basePrice + 0.5; 
        assertEquals(expectedPrice, coffee1.calcPrice(), 0.001);
        
        double smallPrice = coffee3.addSizePrice();
        double expectedSmallPrice = smallPrice + 0.5; 
        assertEquals(expectedSmallPrice, coffee3.calcPrice(), 0.001);
    }

    @Test
    public void testGetExtraSyrup() {
        assertTrue(coffee1.getExtraSyrup());
        assertFalse(coffee3.getExtraSyrup());
    }

    @Test
    public void testCoffee() {
        assertEquals("Mocha", coffee1.getBevName());
        assertEquals(Size.LARGE, coffee1.getSize());
        assertFalse(coffee1.getExtaShot());
        assertTrue(coffee1.getExtraSyrup());
    }

    @Test
    public void testToString() {
        String expected = "Mocha, LARGE, Extra Shot: false, Extra Syrup: true, Price: $"
                + String.format("%.2f", coffee1.calcPrice());
        assertEquals(expected, coffee1.toString());
    }

    @Test
    public void testEqualsObject() {
        assertTrue(coffee1.equals(coffee2));
        assertFalse(coffee1.equals(coffee3));
        
        Coffee coffee4 = new Coffee("Espresso", Size.LARGE, false, true);
        assertFalse(coffee1.equals(coffee4));
    }

    @Test
    public void testGetExtaShot() {
        assertFalse(coffee1.getExtaShot());
        assertTrue(coffee3.getExtaShot());
    }
}