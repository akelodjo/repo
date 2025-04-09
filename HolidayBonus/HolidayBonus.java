/*
 * Class: CMSC203 
 * Instructor:
 * Description: The program makes use to two class Holidaybonus and TwoDimRagged Array
 * to find the exact bonus each working employees get in 5 different District
 * based on the Amount of sales
 * Due: 04/08/2025
 * Platform/compiler:eclipse/javac
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Armel Daryl Kelodjoue Nguetchouang
*/

public class HolidayBonus extends TwoDimRaggedArrayUtility {
	private final static double highestSales=5000;
	private final static double lowestSales=1000;
	private final static double other=2000;

	public HolidayBonus() {
		// TODO Auto-generated constructor stub
	}

	public static double [] calculateHolidayBonus(double [][]arr){
	  
		  double [] newArr = new double[arr.length];
		  
		  for(int i=0;i<arr.length;i++) {
			  
				 for(int j=0;j<arr[i].length;j++) {
					 if(j<arr[i].length) {
						 if(arr[i][j]==getHighestInColumn(arr,j)) {
							 
							 newArr[i] += highestSales;
							  
						  }else if (arr[i][j]==getLowestInColumn(arr,j)) {
							  
							  newArr[i] +=  lowestSales;
						  }else {
							   
							  newArr[i] += other;
						  } 
 
					 }
									   
				 }
				
			  
			  
		  }
		  
		  return newArr;
	  }
		
	public static double calculateTotalHolidayBonus(double [][]arr){
		double total =0;
		double newArr[]= calculateHolidayBonus(arr);
		for(int i=0;i<newArr.length;i++) {
			total +=newArr[i];
		}
		
		
		return total;
		
	}


}
