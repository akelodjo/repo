/*
 * Class: CMSC203 
 * Instructor:Khandan Monshi
 * Description:This is aim of this project is to produce a management comapny app using plot class , property class and management class 
 * which helps the comapny to manage the number of buidiling ina given area covered my the managment company 
 * Due: 4/22/2025
 * Platform/compiler:eclipse/javac
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Armel Daryl Kelodjoue Nguetchouang
*/

public class Property  {
		private String propertyName;
		private String city;
		private double rentAmount;
		private String owner;
		private Plot plot;
	
		public Property(String propertyName, String city, double rentAmount,String owner) {
			// TODO Auto-generated constructor stub
			this.propertyName = propertyName;
			this.city= city;
			this.rentAmount =rentAmount;
			this.owner = owner;
			this.plot =new Plot(0,0,1,1);
			
		} 
		public Property(String propertyName, String city, double rentAmount,String owner,int x,int y,int width,int depth) {
			// TODO Auto-generated constructor stub
			this.propertyName = propertyName;
			this.city= city;
			this.rentAmount =rentAmount;
			this.owner = owner;
			this.plot =new Plot(x,y,width,depth);
			
		}
		public Property(Property pro) {
			// TODO Auto-generated constructor stub
			this.propertyName= pro.propertyName;
			this.city= pro.city;
			this.rentAmount =pro.rentAmount;
			this.owner = pro.owner;
			this.plot =new Plot(pro.plot);
			
		}
		// Getter methods for all the attributes
		public  String getPropertyName() {
			return this.propertyName;
		}
		public  String getCity() {
			return this.city;
		}
		public  double getRentAmount() {
			return this.rentAmount;
		}
		public  String getOwner() {
			return this.owner;
		}
		public  Plot getPlot() {
			return this.plot;
	    }
	// Setter methods for all the attributes
		public  void setPropertyName(String b) {
			this.propertyName=b;
		}
		public  void setCity(String b) {
			this.city=b;
		}
		public  void setRentAmount(double b) {
			 this.rentAmount=b;
		}
		public  void setOwner(String b) {
			this.owner=b;
		}
		public void  setPlot(Plot b) {
			this.plot=b;;
		}
	
	@Override
	public String toString() {
		return propertyName+","+city+","+owner+","+rentAmount;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
