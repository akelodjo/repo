import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AlcoholTestStudent {

    private Alcohol weekdayAlcohol;
    private Alcohol weekendAlcohol;

    @Before
    public void setUp() throws Exception {
        weekdayAlcohol = new Alcohol("Wine", Size.LARGE, false);
        weekendAlcohol = new Alcohol("Wine", Size.LARGE, true);
    }

    @After
    public void tearDown() throws Exception {
        weekdayAlcohol = null;
        weekendAlcohol = null;
    }

    @Test
    public void testToString() {
        String expected = "Wine, LARGE, Offered in weekend: false, Price: $3.0";
        assertEquals(expected, weekdayAlcohol.toString());

        String expectedWeekend = "Wine, LARGE, Offered in weekend: true, Price: $3.6";
        assertEquals(expectedWeekend, weekendAlcohol.toString());
    }

    @Test
    public void testCalcPrice() {
        double basePrice = 3.0; 
        double weekendFee = 0.6;

        assertEquals(basePrice, weekdayAlcohol.calcPrice(), 0.001);
        assertEquals(basePrice + weekendFee, weekendAlcohol.calcPrice(), 0.001);
    }

    @Test
    public void testIsWeekend() {
        assertFalse(weekdayAlcohol.isWeekend());
        assertTrue(weekendAlcohol.isWeekend());
    }

    @Test
    public void testEqualsObject() {
        Alcohol copy = new Alcohol("Wine", Size.LARGE, false);
        Alcohol different = new Alcohol("Vodka", Size.SMALL, true);
        
        assertTrue(weekdayAlcohol.equals(copy));
        assertFalse(weekdayAlcohol.equals(different));
        assertFalse(weekdayAlcohol.equals(weekendAlcohol));
    }

    @Test
    public void testAlcohol() {
        assertEquals("Wine", weekdayAlcohol.getBevName());
        assertEquals(Type.ALCOHOL, weekdayAlcohol.getType());
        assertEquals(Size.LARGE, weekdayAlcohol.getSize());
        assertFalse(weekdayAlcohol.isWeekend());

        assertEquals("Wine", weekendAlcohol.getBevName());
        assertTrue(weekendAlcohol.isWeekend());
    }
}