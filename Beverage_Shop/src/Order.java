import java.util.ArrayList;
import java.util.Random;

public class Order implements OrderInterface, Comparable<Order> {
	//variables
    private int orderNo, orderTime;
    private Day orderDay;
    private Customer customer;
    private ArrayList<Beverage> beverages;
    //contructor
    public Order(int orderTime, Day orderDay, Customer c1) {
        this.beverages = new ArrayList<Beverage>();
        this.orderTime = orderTime;
        this.orderNo = generateOrder();
        this.orderDay = orderDay;
        this.customer = new Customer(c1); // Assuming Customer has a proper copy constructor
    }
    // method to generate other number
    public int generateOrder() {
        Random rand = new Random();
        int num = 10000 + rand.nextInt(80001);
        return num;
    }
    
    // override compareTo methods
    @Override
    public int compareTo(Order o) {
        return Integer.compare(this.orderNo, o.orderNo);
    }
    // method to return if it weekend
    @Override
    public boolean isWeekend() {
        return orderDay == Day.SUNDAY || orderDay == Day.SATURDAY;
    }
    // method to get certain beverage for the list of beverages
    @Override
    public Beverage getBeverage(int itemNo) {
        if(itemNo >= 0 && itemNo < beverages.size()) {
            return beverages.get(itemNo);
        }
        return null;
    }
    // methods to add a new beverage which type Cooffe
    @Override
    public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
        beverages.add(new Coffee(bevName, size, extraShot, extraSyrup));
    }
    // methods to add a new beverage which type Alcohol

    @Override
    public void addNewBeverage(String bevName, Size size) {
        beverages.add(new Alcohol(bevName, size, this.isWeekend()));
    }
    // methods to add a new beverage which type smoothie

    @Override
    public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
        beverages.add(new Smoothie(bevName, size, numOfFruits, addProtein));
    }
    // method returns the total oder
    @Override
    public double calcOrderTotal() {
        double total = 0.0;
        for(Beverage b1 : beverages) {
            total += b1.calcPrice();
        }
        return total;
    }
    // methods get the customers
    public Customer getCustomer() {
        return new Customer(customer);
    }
    // methods find the number of beverage for given type
    @Override
    public int findNumOfBeveType(Type type) {
        int count = 0;
        for(Beverage b1 : beverages) {
            if(b1.getType() == type) {
                count++;
            }
        }
        return count;
    }
     // method returns the number of items in beverage list
    public int getTotalItems() {
        return beverages.size();
    }
     // method return orderno
    //Gets the order number
    public int getOrderNo() {
        return orderNo;
    }

    // the methods return order time.
    public int getOrderTime() {
        return orderTime;
    }

    //the method return order day.
    public Day getOrderDay() {
        return orderDay;
    }
       
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Order Number: ").append(orderNo)
              .append(", Time: ").append(orderTime)
              .append(", Day: ").append(orderDay)
              .append(", Customer: ").append(customer.getName())
              .append(", Age: ").append(customer.getAge())
              .append("\nBeverages:\n");

        for(Beverage b : beverages) {
            result.append(b.toString()).append("\n");
        }
        result.append("Order Total: $").append(String.format("%.2f", calcOrderTotal()));
        return result.toString();
    }
}