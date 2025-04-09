
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class represents GFA test cases for a TwoDimRaggedArrayUtility object.
 * 
 * @author Farnaz Eivazi
 * @version 7/13/2022
 * 
 */
public class TwoDimRaggedArrayUtilityStudentTest {
	private double[][] dataSet1 = {{1,2,3},{4,5},{6,7,8,9}};
	private double[][] dataSet2 = {{7,2,9,4},{5},{8,1,3},{11,6,7,2}};
	private double[][] dataSet3 = {{7.2,2.5,9.3,4.8},{5.9},{8.1,1.7,3.3},{11.6,6.9,7.3,2.7}};
	private double[][] dataSet4 = {{-2.5,-5.3,6.1},{-4.4,8.2},{2.3,-7.5},{-4.2,7.3,-5.9,2.6}};
	private double[][] district3 = {{1.65,4.50,2.36,7.45,3.44,6.23},
	                               {2.22,-3.24,-1.66,-5.48,3.46},
	                               {4.23,2.29,5.29},
	                               {2.76,3.76,4.29,5.48,3.43},
	                               {3.38,3.65,3.76},
	                               {2.46,3.34,2.38,8.26,5.34}};
	private double[][] district4 = {{1253.65,4.50,2154.36,7532.45,3388.44},
	                               {2876.22,-3.24,1954.66},
	                               {4896.23,2.29,5499.29},
	                               {2256.76,3.76,4286.29,5438.48,3794.43},
	                               {3184.38,3654.65,3455.76,6387.23,4265.77,4592.45},
	                               {2657.46,3265.34,2256.38,8935.26,5287.34,6598.23}};
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
//	@Test
//	public void testReadme() {
//		assert
//	}
	@Test
	public void testGetTotal() {
		assertEquals(45.0, TwoDimRaggedArrayUtility.getTotal(dataSet1), .001);
		assertEquals(65.0, TwoDimRaggedArrayUtility.getTotal(dataSet2), .001);
		assertEquals(71.3, TwoDimRaggedArrayUtility.getTotal(dataSet3), .001);
		assertEquals(-3.3, TwoDimRaggedArrayUtility.getTotal(dataSet4), .001);
	}
	
	@Test
	public void testGetAverage() {
		assertEquals(5.0, TwoDimRaggedArrayUtility.getAverage(dataSet1), .001);
		assertEquals(5.416, TwoDimRaggedArrayUtility.getAverage(dataSet2), .001);
		assertEquals(5.9416, TwoDimRaggedArrayUtility.getAverage(dataSet3), .001);
		assertEquals(-0.3, TwoDimRaggedArrayUtility.getAverage(dataSet4), .001);
	}
	
	@Test
	public void testGetRowTotal() {
		assertEquals(6.0, TwoDimRaggedArrayUtility.getRowTotal(dataSet1, 0), .001);
		assertEquals(26.0, TwoDimRaggedArrayUtility.getRowTotal(dataSet2, 3), .001);
		assertEquals(5.9, TwoDimRaggedArrayUtility.getRowTotal(dataSet3, 1), .001);
		assertEquals(-5.2, TwoDimRaggedArrayUtility.getRowTotal(dataSet4, 2), .001);
	}
	
	@Test
	public void testGetHighestInRow() {
		assertEquals(3.0, TwoDimRaggedArrayUtility.getHighestInRow(dataSet1, 0), .001);
		assertEquals(11.0, TwoDimRaggedArrayUtility.getHighestInRow(dataSet2, 3), .001);
		assertEquals(9.3, TwoDimRaggedArrayUtility.getHighestInRow(dataSet3, 0), .001);
		assertEquals(8.2, TwoDimRaggedArrayUtility.getHighestInRow(dataSet4, 1), .001);
	}
	
	@Test
	public void testGetHighestInRowIndex() {
		assertEquals(2, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1, 0));
		assertEquals(0, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet2, 3));
		assertEquals(2, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet3, 0));
		assertEquals(1, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet4, 1));
	}
	
	@Test
	public void testGetLowestInRow() {
		assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInRow(dataSet1, 0), .001);
		assertEquals(5.0, TwoDimRaggedArrayUtility.getLowestInRow(dataSet2, 1), .001);
		assertEquals(1.7, TwoDimRaggedArrayUtility.getLowestInRow(dataSet3, 2), .001);
		assertEquals(-7.5, TwoDimRaggedArrayUtility.getLowestInRow(dataSet4, 2), .001);
	}
	
	@Test
	public void testGetLowestInRowIndex() {
		assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet1, 0));
		assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet2, 1));
		assertEquals(1, TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet3, 2));
		assertEquals(1, TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet4, 2));
	}
	
	@Test
	public void testGetColumnTotal() {
		assertEquals(11.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 0), .001);
		assertEquals(9.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet2, 1), .001);
		assertEquals(19.9, TwoDimRaggedArrayUtility.getColumnTotal(dataSet3, 2), .001);
		assertEquals(-8.8, TwoDimRaggedArrayUtility.getColumnTotal(dataSet4, 0), .001);
	}
	
	@Test
	public void testGetHighestInColumn() {
		assertEquals(6.0, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1, 0), .001);
		assertEquals(6.0, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet2, 1), .001);
		assertEquals(9.3, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet3, 2), .001);
		assertEquals(8.2, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet4, 1), .001);
	}
	
	@Test
	public void testGetHighestInColumnIndex() {
		assertEquals(2, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1, 0));
		assertEquals(3, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet2, 1));
		assertEquals(0, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet3, 2));
		assertEquals(1, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet4, 1));
	}
	
	@Test
	public void testGetLowestInColumn() {
		assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1, 0), .001);
		assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet2, 1), .001);
		assertEquals(3.3, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet3, 2), .001);
		assertEquals(-7.5, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet4, 1), .001);
	}
	
	@Test
	public void testGetLowestInColumnIndex() {
		assertEquals(0, TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1, 0));
		assertEquals(2, TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet2, 1));
		assertEquals(2, TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet3, 2));
		assertEquals(2, TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet4, 1));
	}
	
	@Test
	public void testGetHighestInArray() {
		assertEquals(9.0, TwoDimRaggedArrayUtility.getHighestInArray(dataSet1), .001);
		assertEquals(11.0, TwoDimRaggedArrayUtility.getHighestInArray(dataSet2), .001);
		assertEquals(11.6, TwoDimRaggedArrayUtility.getHighestInArray(dataSet3), .001);
		assertEquals(8.2, TwoDimRaggedArrayUtility.getHighestInArray(dataSet4), .001);
	}
	
	@Test
	public void testGetLowestInArray() {
		assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInArray(dataSet1), .001);
		assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInArray(dataSet2), .001);
		assertEquals(1.7, TwoDimRaggedArrayUtility.getLowestInArray(dataSet3), .001);
		assertEquals(-7.5, TwoDimRaggedArrayUtility.getLowestInArray(dataSet4), .001);
	}
	
	    
	    @Test
	    public void testCalculateHolidayBonus() {
	        double[] expected = {3000, 4000, 20000};
	        double[] actual = HolidayBonus.calculateHolidayBonus(dataSet1);
	        for(int i = 0; i < actual.length; i++) {
	            assertEquals(expected[i], actual[i], 0);
	        }
	    }
	    
	    @Test
	    public void testCalculateTotalHolidayBonus() {
	        assertEquals(22000, HolidayBonus.calculateTotalHolidayBonus(dataSet1), 0);
	    }
	
}
