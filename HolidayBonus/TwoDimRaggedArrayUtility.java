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
import java.io.*;
import java.util.*;

public class TwoDimRaggedArrayUtility {
	

	public TwoDimRaggedArrayUtility() {
		// TODO Auto-generated constructor stub
		
	}
	//THis method read data from a file and change its content to 2D array 
	
	public static double[][] readFile(File file) throws FileNotFoundException {
	    ArrayList<double[]> dataList = new ArrayList<>();
	    Scanner input = new Scanner(file);

	    while (input.hasNextLine()) {
	        String line = input.nextLine().trim();
	        if (!line.isEmpty()) {
	            String[] parts = line.split(" ");
	            double[] row = new double[parts.length];
	            for (int i = 0; i < parts.length; i++) {
	                row[i] = Double.parseDouble(parts[i]);
	            }
	            dataList.add(row);
	        }
	    }
	    input.close();

	    // Convert ArrayList to 2D array
	    double[][] raggArr = new double[dataList.size()][];
	    for (int i = 0; i < dataList.size(); i++) {
	    	raggArr[i] = dataList.get(i);
	    }

	    return raggArr;
	}


	//This method write to a file using a file and array
	public static void writeToFile(double [][]arr, File file) {
		try {
			PrintWriter writer = new PrintWriter(file);
			for(int i=0 ;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					writer.print(arr[i][j]);
					if (j < arr[i].length - 1) {
	                    writer.print(" ");
	                }
				}
				writer.println();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
     // This methods get the Total data found in the array
	 public static double getTotal(double[][] arr) {
	        double total = 0;
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++) {
	                total += arr[i][j];
	            }
	        }
	        return total;
	    }
	 // This method return the average data found from the array
	 public static double getAverage(double[][] arr) {
	        double total = getTotal(arr);
	        double average =0;
	        int numberOfElements=0;
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++) {
	                numberOfElements++;
	            }
	        }
	        average = total/numberOfElements;
	        return average;
	    }
	 // this method get the total number of data from a row in the data set
	 public static double getRowTotal(double [][] arr,int index) {
		 double RowTotal=0;
		 for(int i =0;i<arr[index].length;i++) {
			 RowTotal += arr[index][i];
		 }
		 return RowTotal;
	 }
	 // This method get the Total data from the column
	 public static double getColumnTotal(double [][] arr,int index) {
		 double ColumnTotal=0;
		 for(int i =0;i<arr.length;i++) {
		       if (index < arr[i].length) {  
                   ColumnTotal += arr[i][index];
        }
		    
		     }
		 return ColumnTotal;
	 }
	 //This method gets the highest data in a Row
	 public static double getHighestInRow(double [][] arr,int index) {
		 double highest =arr[index][0];
		 for(int i=0;i< arr[index].length;i++) {
			 if(highest<arr[index][i]) {
				 highest = arr[index][i];
			 }
		 }
		 return highest;
	 }
	 //This method gets the index of highest data in a Row

	 public static int getHighestInRowIndex(double [][] arr,int RowIndex) {
		 double highest =arr[RowIndex][0];
		 int index =0;
		 for(int i=0;i< arr[RowIndex].length;i++) {
			 if(highest<arr[RowIndex][i]) {
				 highest = arr[RowIndex][i];
				 index = i;
				 
			 }
		 }
		 return index;
	 }
	 //This method gets the lowest data in a Row
	 public static double getLowestInRow(double [][] arr,int index) {
		 double lowest =arr[index][0];
		 for(int i=0;i< arr[index].length;i++) {
			 if(lowest>arr[index][i]) {
				 lowest = arr[index][i];
			 }
		 }
		 return lowest;
	 }
	
	 //This method gets the index of lowest data in a Row
	 public static int getLowestInRowIndex(double [][] arr,int RowIndex) {
		 double lowest =arr[RowIndex][0];
		 int index =0;
		 for(int i=0;i< arr[RowIndex].length;i++) {
			 if(lowest>arr[RowIndex][i]) {
				 lowest = arr[RowIndex][i];
				 index  =i;
			 }
		 }
		 return index;
	 }
	 
	 // this method gives the highest data in a given column
	 public static double getHighestInColumn(double [][]arr,int ColIndex) {
		 double highest= Double.NEGATIVE_INFINITY;
		 for(int i=0;i<arr.length;i++) {
		     if(ColIndex<arr[i].length){
		         if(highest<arr[i][ColIndex]) {
				 highest = arr[i][ColIndex];
			 } 
		     }
			
		 }
		 return highest;
	 }
	 // this method gives the index of  highest data in a given column
	 public static int getHighestInColumnIndex(double [][]arr,int ColIndex) {
		 double highest= Double.NEGATIVE_INFINITY;
		 int index =0;
		 for(int i=0;i<arr.length;i++) {
		     if(ColIndex<arr[i].length){
		         if(highest<arr[i][ColIndex]) {
				 highest = arr[i][ColIndex];
				 index = i;
			 } 
		     }
			
		 }
		 return index;
	 }
	 // this method gives the  lowest data in a given column
	 public static double getLowestInColumn(double [][]arr,int ColIndex) {
		 double Lowest= Double.POSITIVE_INFINITY;
		 for(int i=0;i<arr.length;i++) {
		     if(ColIndex<arr[i].length){
		         if(Lowest>arr[i][ColIndex]) {
				 Lowest = arr[i][ColIndex];
			 } 
		     }
			
		 }
		 return Lowest;
	 }
	 //This method gives the index lowest data in a given column
	 public static int getLowestInColumnIndex(double [][]arr,int ColIndex) {
		 double Lowest= Double.POSITIVE_INFINITY;
		 int index =0;
		 for(int i=0;i<arr.length;i++) {
		     if(ColIndex<arr[i].length){
		         if(Lowest>arr[i][ColIndex]) {
				 Lowest = arr[i][ColIndex];
				 index =i;
			 } 
		     }
			
		 }
		 return index;
	 }
	// This method gives the highest data in the array 
		  public static double getHighestInArray(double [][]arr) {
				 double highest= arr[0][0];
				 for(int i=0;i<arr.length;i++) {
				     for(int j=0 ;j<arr[i].length;j++){
				         if(highest<arr[i][j]) {
						 highest = arr[i][j];
				         } 
				     }
				 }
				     
				 return highest;
			 
		  }
		
	 // This method gives the lowest data in the array 
	  public static double getLowestInArray(double [][]arr) {
			 double Lowest= arr[0][0];
			 for(int i=0;i<arr.length;i++) {
			     for(int j=0 ;j<arr[i].length;j++){
			         if(Lowest>arr[i][j]) {
					 Lowest = arr[i][j];
			         } 
			     }
			 }
			     
			 return Lowest;
		 
	  }
	
	 
}
		 
	 

