public class Coffee extends Beverage {
	//variables
    private boolean extraShot;
    private boolean extraSyrup;
    // constant variables
    private final double EXTRA_SHOT_PRICE = 0.5;
	private final double EXTRA_SYRUP_PRICE = 0.5;
 // constructor
    public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
        super(bevName, Type.COFFEE, size);
        this.extraShot = extraShot;
        this.extraSyrup = extraSyrup;
    }
 // methods return calcprice
    @Override
    public double calcPrice() {
        double price = super.addSizePrice();
        if (extraShot) price += EXTRA_SHOT_PRICE;
        if (extraSyrup) price += EXTRA_SYRUP_PRICE;
        return price;
    }

    @Override
    public String toString() {
       return getBevName() + ", " + getSize() + ", Extra Shot: " + extraShot 
				+ ", Extra Syrup: " + extraSyrup + ", Price: $" + 
				String.format("%.2f", calcPrice());
    }
    // this method indicate whether an extra shot was added 
    public boolean getExtaShot()
	{
		return extraShot;
	}
	
	//this method indicates whether extra syrup was added
	public boolean getExtraSyrup()
	{
		return extraSyrup;
	}
 // equal method check if two coffee objects are equal nor not
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Coffee other = (Coffee) obj;
        return extraShot == other.extraShot && extraSyrup == other.extraSyrup;
    }
}