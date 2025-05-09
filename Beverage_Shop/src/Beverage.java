
public abstract class Beverage {
    protected String bevName;
    private Type type;
    protected Size size;
    private static final double BASE_PRICE = 2.0;
    private static final double SIZE_PRICE = 0.5;
    //contructor for beverage object
    public Beverage(String bevName, Type type, Size size) {
        this.bevName = bevName;
        this.type = type;
        this.size = size;
    }

    /* 
    Calculates the new price by adding the size
    to the base price
    
    */
    public double addSizePrice() {
        double price = BASE_PRICE;
        switch(size) {
            case MEDIUM: price += SIZE_PRICE; break;
            case LARGE: price += 2 * SIZE_PRICE; break;
            default: break;
        }
        return price;
    }
    public double getBasePrice() {
		return BASE_PRICE;
		
	}
	
	//Gets the beverage type
	public Type getType()
	{
		return type;
	}
	
	//Gets the name of the beverage
	public String getBevName()
	{
		return bevName;
	}
	
	//Gets the size of the beverage
	public Size getSize()
	{
		return size;
	}
	 
    // Abstract method to calculate the beverage price
    public abstract double calcPrice();

    @Override
    public String toString() {
        return bevName + "," + size;
    }
    // check if beverage is equal to another beverage
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Beverage)) return false;
        Beverage other = (Beverage) obj;
        return bevName.equals(other.bevName) && 
               type == other.type && 
               size == other.size;
    }
}