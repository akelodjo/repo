import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BevShopTestStudent {

    private BevShop shop;

    @Before
    public void setUp() throws Exception {
        shop = new BevShop();
    }

    @Test
    public void testProcessSmoothieOrder() {
        shop.startNewOrder(14, Day.SUNDAY, "Maria", 22);
        shop.processSmoothieOrder("Tropical", Size.LARGE, 4, true);
        assertEquals(Type.SMOOTHIE, shop.getCurrentOrder().getBeverage(0).getType());
    }

    @Test
    public void testGetMinAgeForAlcohol() {
        assertEquals(21, shop.getMinAgeForAlcohol());
    }

    @Test
    public void testIsValidAge() {
        assertTrue(shop.isValidAge(25));
        assertFalse(shop.isValidAge(17));
    }

    @Test
    public void testTotalMonthlySale() {
        shop.startNewOrder(11, Day.TUESDAY, "Carlos", 24);
        shop.processAlcoholOrder("Vodka", Size.MEDIUM);
        double price = shop.getCurrentOrder().calcOrderTotal();
        assertEquals(price, shop.totalMonthlySale(), 0.01);
    }

    @Test
    public void testGetMaxOrderForAlcohol() {
        assertEquals(3, shop.getMaxOrderForAlcohol());
    }

    @Test
    public void testIsMaxFruit() {
        assertTrue(shop.isMaxFruit(7));
        assertFalse(shop.isMaxFruit(2));
    }

    @Test
    public void testStartNewOrder() {
        shop.startNewOrder(13, Day.FRIDAY, "Sophi", 27);
        assertEquals(1, shop.totalNumOfMonthlyOrders());
        assertEquals("Sophi", shop.getCurrentOrder().getCustomer().getName());
    }

    @Test
    public void testGetOrderAtIndex() {
        shop.startNewOrder(10, Day.MONDAY, "Ethan", 23);
        assertNotNull(shop.getOrderAtIndex(0));
        assertNull(shop.getOrderAtIndex(3));
    }

    @Test
    public void testIsEligibleForMore() {
        shop.startNewOrder(12, Day.WEDNESDAY, "Olivia", 30);
        assertTrue(shop.isEligibleForMore());
        shop.processAlcoholOrder("Gin", Size.SMALL);
        shop.processAlcoholOrder("Rum", Size.LARGE);
        assertTrue(shop.isEligibleForMore());
    }

    @Test
    public void testBevShop() {
        assertEquals(0, shop.totalNumOfMonthlyOrders());
        assertEquals(0, shop.getNumOfAlcoholDrink());
    }

    @Test
    public void testProcessCoffeeOrder() {
        shop.startNewOrder(9, Day.THURSDAY, "Noah", 19);
        shop.processCoffeeOrder("Mocha", Size.MEDIUM, false, true);
        assertEquals(Type.COFFEE, shop.getCurrentOrder().getBeverage(0).getType());
    }

    @Test
    public void testGetCurrentOrder() {
        shop.startNewOrder(15, Day.SATURDAY, "Emma", 21);
        assertNotNull(shop.getCurrentOrder());
        assertEquals("Emma", shop.getCurrentOrder().getCustomer().getName());
    }

    @Test
    public void testGetNumOfAlcoholDrink() {
        shop.startNewOrder(16, Day.MONDAY, "Liam", 29);
        shop.processAlcoholOrder("Whiskey", Size.LARGE);
        assertEquals(1, shop.getNumOfAlcoholDrink()); 
    }

    @Test
    public void testTotalOrderPrice() {
        shop.startNewOrder(17, Day.TUESDAY, "Ava", 26);
        shop.processSmoothieOrder("Berry", Size.SMALL, 3, false);
        double price = shop.getCurrentOrder().calcOrderTotal();
        assertEquals(price, shop.totalOrderPrice(shop.getCurrentOrder().getOrderNo()), 0.01);
    }

    @Test
    public void testIsValidTime() {
        assertTrue(shop.isValidTime(10));
        assertFalse(shop.isValidTime(5));
    }

    @Test
    public void testGetMaxNumOfFruits() {
        assertEquals(5, shop.getMaxNumOfFruits());
    }

    @Test
    public void testFindOrder() {
        shop.startNewOrder(18, Day.WEDNESDAY, "Mia", 28);
        int orderNo = shop.getCurrentOrder().getOrderNo();
        assertEquals(0, shop.findOrder(orderNo));
        assertEquals(-1, shop.findOrder(12345));
    }

    @Test
    public void testTotalNumOfMonthlyOrders() {
        shop.startNewOrder(19, Day.THURSDAY, "James", 31);
        shop.startNewOrder(20, Day.FRIDAY, "Charlotte", 32);
        assertEquals(2, shop.totalNumOfMonthlyOrders());
    }

    @Test
    public void testProcessAlcoholOrder() {
        shop.startNewOrder(21, Day.SATURDAY, "Benjamin", 22);
        shop.processAlcoholOrder("Tequila", Size.SMALL);
        assertEquals(Type.ALCOHOL, shop.getCurrentOrder().getBeverage(0).getType());
    }

    @Test
    public void testToString() {
        shop.startNewOrder(22, Day.SUNDAY, "Amelia", 25);
        shop.processCoffeeOrder("Cappuccino", Size.MEDIUM, true, false);
        String output = shop.toString();
        assertTrue(output.contains("Total Monthly Sale: $"));
        assertTrue(output.contains("Amelia"));
    }
}