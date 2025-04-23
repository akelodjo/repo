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

public class Plot {
	private int x,y,width,depth;

	public Plot(int x,int y,int width,int depth){
		// TODO Auto-generated constructor stub
		this.x =x ;
		this.y=y;
		this.depth =depth;
		this.width=width;
	}
	public Plot(){
		// TODO Auto-generated constructor stub
		this.x =0;
		this.y=0;
		this.depth =1;
		this.width=1;
	}
	public Plot(Plot p1){
		// TODO Auto-generated constructor stub
		this.x =p1.getX();
		this.y=p1.getY();
		this.depth =p1.getDepth();
		this.width=p1.getWidth();
	}
	
	
	//Getter methods for attributes
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	public int getWidth() {
		return this.width;
	}
	public int getDepth() {
		return this.depth;
	}
    //Setters  methods for attributes
	
	public void setX(int a) {
		this.x = a;
	}
	public void setY(int a) {
		this.y=a;
	}
	
	public void setWidth(int a) {
	   this.width =a;
	}
	public void  setDepth(int a) {
		this.depth=a;
	}
	
	//overlaps methods
	public boolean overlaps(Plot obj) {
		if(!(this.x + this.width <= obj.x ||this.x >= obj.x + obj.width ||this.y + this.depth <= obj.y ||this.y >= obj.y + obj.depth)) {
			return true;
		}
		return false;
	}
		
	
		
		public boolean encompasses(Plot obj) {
			if (obj.x >= this.x && 
				obj.y >= this.y && 
				obj.x + obj.width <= this.x + this.width &&
				obj.y + obj.depth <= this.y + this.depth) {
				return true;
			}
		
			
			return false ;
		}
		
		
		
		@Override 
		public String toString() {
			return x +","+ y+"," + width+"," + depth ;
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
}
