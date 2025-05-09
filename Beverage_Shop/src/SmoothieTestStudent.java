import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SmoothieTestStudent {

    private Smoothie smoothieWithProtein;
    private Smoothie smoothieWithoutProtein;

    @Before
    public void setUp() throws Exception {
        smoothieWithProtein = new Smoothie("Tropical Mix", Size.LARGE, 3, true);
        smoothieWithoutProtein = new Smoothie("Green Detox", Size.MEDIUM, 1, false);
    }

    @After
    public void tearDown() throws Exception {
        smoothieWithProtein = null;
        smoothieWithoutProtein = null;
    }

    @Test
    public void testCalcPrice() {
        double basePrice = smoothieWithProtein.addSizePrice();
        double expected = basePrice + (3 * 0.5) + 1.5;
        assertEquals(expected, smoothieWithProtein.calcPrice(), 0.01);
        
        double basePrice2 = smoothieWithoutProtein.addSizePrice();
        double expected2 = basePrice2 + (1 * 0.5);
        assertEquals(expected2, smoothieWithoutProtein.calcPrice(), 0.01);
    }

    @Test
    public void testGetAddProtein() {
        assertTrue(smoothieWithProtein.getAddProtein());
        assertFalse(smoothieWithoutProtein.getAddProtein());
    }

    @Test
    public void testSmoothie() {
        assertEquals("Tropical Mix", smoothieWithProtein.getBevName());
        assertEquals(Size.LARGE, smoothieWithProtein.getSize());
        assertEquals(Type.SMOOTHIE, smoothieWithProtein.getType());
        assertEquals(3, smoothieWithProtein.getNumOfFruits());
        assertTrue(smoothieWithProtein.getAddProtein());
    }

    @Test
    public void testToString() {
        String output = smoothieWithProtein.toString();
        assertTrue(output.contains("Tropical Mix"));
        assertTrue(output.contains("LARGE"));
        assertTrue(output.contains("Protein Added: true"));
        assertTrue(output.contains("Number of Fruits: 3"));
        assertTrue(output.contains("Price: $"));
    }

    @Test
    public void testEqualsObject() {
        Smoothie copy = new Smoothie("Tropical Mix", Size.LARGE, 3, true);
        assertTrue(smoothieWithProtein.equals(copy));

        Smoothie different1 = new Smoothie("Tropical Mix", Size.LARGE, 2, false);
        Smoothie different2 = new Smoothie("Green Detox", Size.LARGE, 3, true);
        
        assertFalse(smoothieWithProtein.equals(different1));
        assertFalse(smoothieWithProtein.equals(different2));
    }

    @Test
    public void testGetNumOfFruits() {
        assertEquals(3, smoothieWithProtein.getNumOfFruits());
        assertEquals(1, smoothieWithoutProtein.getNumOfFruits());
    }
}