public class BevShopDriverApp {
    public static void main(String[] args) {
        System.out.println("The current order in process can have at most 3 alcoholic beverages.");
        System.out.println("The minimum age to order alcohol drink is 21");
        
        
        BevShop bevShop = new BevShop();
        
      
        System.out.println("\nStart please a new order:");
        System.out.println("Your Total Order for now is 0.0");
        
     
        System.out.println("Would you please enter your name John");
        System.out.println("Would you please enter your age 23");
        Customer customer1 = new Customer("John", 23);
        
        if (customer1.getAge() >= 21) {
            System.out.println("Your age is above 20 and you are eligible to order alcohol");
        }
        
        bevShop.startNewOrder(8, Day.MONDAY, customer1.getName(), customer1.getAge());
        
        
        System.out.println("\nWould you please add an alcohol drink");
        bevShop.processAlcoholOrder("Vodka", Size.SMALL);
        System.out.println("The current order of drinks is " + bevShop.getCurrentOrder().getTotalItems());
        System.out.println("The Total price on the Order is " + bevShop.getCurrentOrder().calcOrderTotal());
        
        System.out.println("\nYour current alcohol drink order is less than 4");
        System.out.println("Would you please add a second alcohol drink");
        bevShop.processAlcoholOrder("Whiskey", Size.MEDIUM);
        System.out.println("The current order of drinks is " + bevShop.getCurrentOrder().getTotalItems());
        System.out.println("The Total Price on the Order: " + bevShop.getCurrentOrder().calcOrderTotal());
        
        System.out.println("\nYour current alcohol drink order is less than 4");
        System.out.println("Add third alcohol drink");
        bevShop.processAlcoholOrder("Beer", Size.LARGE);
        System.out.println("The current order of drinks is " + bevShop.getCurrentOrder().getTotalItems());
        System.out.println("The Total Price on the Order: " + bevShop.getCurrentOrder().calcOrderTotal());
        
        System.out.println("\nYou have a maximum alcohol drinks for this order");
        
       
        System.out.println("\nWould you please add a COFFEE to your order: ");
        bevShop.processCoffeeOrder("Latte", Size.MEDIUM, true, true);
        System.out.println("Total items on your order is " + bevShop.getCurrentOrder().getTotalItems());
        System.out.println("The Total Price on the Order: " + bevShop.getCurrentOrder().calcOrderTotal());
        
        System.out.println("\n#------------------------------------#");
        
    
        System.out.println("\nWould you please start a new order");
        System.out.println("Would you please enter your name: Ray");
        System.out.println("Would you please enter your age: 18");
        Customer customer2 = new Customer("Ray", 18);
        
        bevShop.startNewOrder(12, Day.FRIDAY, customer2.getName(), customer2.getAge());
        System.out.println("The Total Price on the Order: " + bevShop.getCurrentOrder().calcOrderTotal());
        
      
        System.out.println("\nWould you please add a SMOOTHIE to order");
        bevShop.processSmoothieOrder("Berry Blast", Size.LARGE, 3, true);
        System.out.println("The Total Price on the Order: " + bevShop.getCurrentOrder().calcOrderTotal());
        
        System.out.println("\nWould you please add a SMOOTHIE to order");
        bevShop.processSmoothieOrder("Tropical", Size.MEDIUM, 2, false);
        
        System.out.println("\nWould you please add a COFFEE to order");
        bevShop.processCoffeeOrder("Espresso", Size.SMALL, false, false);
        System.out.println("The Total Price on the Order: " + bevShop.getCurrentOrder().calcOrderTotal());
        
      
        System.out.println("\nWould you please add a drink ");
        if (customer2.getAge() < 21) {
            System.out.println("Your Age is not appropriate for alcohol drink!!");
        }
        
        System.out.println("The current order of drinks is " + bevShop.getCurrentOrder().getTotalItems());
        System.out.println("The Total price on the Order: " + bevShop.getCurrentOrder().calcOrderTotal());
        
        
        int totalFruits = 0;
        Order currentOrder = bevShop.getCurrentOrder();
        for (int i = 0; i < currentOrder.getTotalItems(); i++) {
            Beverage b = currentOrder.getBeverage(i);
            if (b instanceof Smoothie) {
                totalFruits += ((Smoothie)b).getNumOfFruits();
            }
        }
        System.out.println("The total number of fruits is " + totalFruits);
        if (totalFruits >= 5) {
            System.out.println("You reached a Maximum number of fruits");
        }
        
      
        System.out.println("\nTotal price on the second Order: " + bevShop.getOrderAtIndex(1).calcOrderTotal());
        System.out.println("Total amount for all Orders: " + bevShop.totalMonthlySale());
        
        System.out.println("\n\nProgrammer Name: Armel Kelodjoue\nDUE DATE: 5/8/2025");
    }


    
}