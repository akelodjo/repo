public class Alcohol extends Beverage {
    private boolean isWeekend;
    private static final double WEEKEND_PRICE = 0.6;

    public Alcohol(String bevName, Size size, boolean isWeekend) {
        super(bevName, Type.ALCOHOL, size);
        this.isWeekend = isWeekend;
    }
   

    @Override
    public double calcPrice() {
        double price = super.addSizePrice();
        if (isWeekend) price += WEEKEND_PRICE;
      
        return price;
    }
    public boolean isWeekend(){
        return isWeekend;
    }
    @Override
    public String toString() {
        return getBevName() + ", " + getSize() + ", Offered in weekend: " + isWeekend
				+ ", Price: $" + String.format("%.1f", calcPrice());
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Alcohol other = (Alcohol) obj;
        return isWeekend == other.isWeekend;
    }
    
    
   
}