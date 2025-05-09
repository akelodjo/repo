
public class Smoothie extends Beverage{
    //Variables
	private boolean addProtein;
	private int numOfFruits;
	//Constant variables
	private final double EXTRA_PROTEIN = 1.5; 
	private final double EXTRA_FRUIT = 0.5; 

	// constructor
	public Smoothie(String bevname,Size size,int numOfFruits, boolean addProtein) {
		// TODO Auto-generated constructor stub
		super(bevname,Type.SMOOTHIE,size);
		this.numOfFruits = numOfFruits;
		this.addProtein = addProtein;
	}
	// get methods to if protein was added
	public boolean getAddProtein() {
		return this.addProtein;
	}
	// get method to know number of fruits
	public int getNumOfFruits() {
		return this.numOfFruits;
	}
	// set methods to set  protein was added
	public void setAddProtein(boolean a) {
		 this.addProtein =a;
	}
	// set method to set  number of fruits
	public void setNumOfFruits(int a) {
	     this.numOfFruits= a;
	}
	// calc price method toknw te price
	@Override
	public double calcPrice() {
		double price =super.addSizePrice() ;
		if(this.addProtein) {
			price += EXTRA_PROTEIN;
		}
		price += (numOfFruits*EXTRA_FRUIT);
		return price;
	}
	 // tostring method to print to app
	@Override
	public  String toString() {
		return  getBevName() + ", " + getSize() + ", Protein Added: " + addProtein
					+ ", Number of Fruits: " + numOfFruits + ", Price: $"
					+ String.format("%.2f", calcPrice());
		}
	// equal method to verify  two smoothie order are equal
	@Override
	public boolean equals(Object otherSmoothie) {
		if(!super.equals(otherSmoothie)){ return false;}
		Smoothie temp = (Smoothie) otherSmoothie;	
		
	return (super.equals(temp)&& this.addProtein ==temp.addProtein && this.numOfFruits == temp.numOfFruits);
  }

}
