
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class represents GFA test cases for a HolidayBonus object.
 * 
 * @author Farnaz Eivazi
 * @version 7/13/2022
 * 
 */
public class HolidayBonusStudentTest {

	private double[][] dataSet1 = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8 } };
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
	private double[][] district5 = {
		    {12536.54, 45665.05, 21543.66, 75324.57, 33884.48, 65982.39},
		    {28762.21, 35762.42, 19546.63},
		    {48962.34, 28552.95, 23863.66, 54992.97},
		    {22567.63, 36237.64, 42862.95, 54384.86, 37944.37},
		    {31843.86, 36546.57, 34557.68, 63872.39, 42657.70, 45924.51},
		    {26574.65, 32653.46, 22563.87, 89352.68, 52873.49}
		};
	
		

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculateHolidayBonusA() {
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(dataSet1);
			assertEquals(3000.0, result[0], .001);
			assertEquals(4000.0, result[1], .001);
			assertEquals(15000.0, result[2], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}

	}
	  @Test
	    public void testCalculateTotalHolidayBonus() {
	        assertEquals(22000, HolidayBonus.calculateTotalHolidayBonus(dataSet1), 0);
	    }
	
	   
	    @Test
	    public void testCalculateHolidayBonus_dataSet2() {
	        double[] expected = {14000.0, 1000.0, 4000.0, 13000.0};
	        double[] actual = HolidayBonus.calculateHolidayBonus(dataSet2);
	        assertArrayEquals(expected, actual, 0);
	    }
	    
	  
	    
	    @Test
	    public void testCalculateTotalHolidayBonus_dataSet2() {
	        assertEquals(32000, HolidayBonus.calculateTotalHolidayBonus(dataSet2), 0);
	    }

	    @Test
	    public void testCalculateHolidayBonus_dataSet3() {
	        double[] expected = {14000.0, 1000.0, 4000.0, 13000.0};
	        double[] actual = HolidayBonus.calculateHolidayBonus(dataSet3);
	        assertArrayEquals(expected, actual, 0);
	    }
	    
	    @Test
	    public void testCalculateTotalHolidayBonus_dataSet3() {
	        assertEquals(32000, HolidayBonus.calculateTotalHolidayBonus(dataSet3), 0);
	    }

	    @Test
	    public void testCalculateHolidayBonus_dataSet4() {
	        double[] expected = {9000.0, 6000.0, 6000.0, 10000.0};
	        double[] actual = HolidayBonus.calculateHolidayBonus(dataSet4);
	        assertArrayEquals(expected, actual, 0);
	    }
	    
	    @Test
	    public void testCalculateTotalHolidayBonus_dataSet4() {
	        assertEquals(31000, HolidayBonus.calculateTotalHolidayBonus(dataSet4), 0);
	    }

	    @Test
	    public void testCalculateHolidayBonus_district3() {
	        double[] expected = {17000.0, 7000.0, 12000.0, 9000.0, 6000.0, 16000.0};
	        double[] actual = HolidayBonus.calculateHolidayBonus(district3);
	        assertArrayEquals(expected, actual, 0);
	    }
	    
	    @Test
	    public void testCalculateTotalHolidayBonus_district3() {
	        assertEquals(67000, HolidayBonus.calculateTotalHolidayBonus(district3), 0);
	    }

	    @Test
	    public void testCalculateHolidayBonus_district4() {
	        double[] expected = {8000.0, 4000.0, 12000.0, 9000.0, 14000.0, 21000.0};
	        double[] actual = HolidayBonus.calculateHolidayBonus(district4);
	        assertArrayEquals(expected, actual, 0);
	    }
	    
	    @Test
	    public void testCalculateTotalHolidayBonus_district4() {
	        assertEquals(68000, HolidayBonus.calculateTotalHolidayBonus(district4), 0);
	    }

	    @Test
	    public void testCalculateHolidayBonus_district5() {
	        double[] expected = {16000.0, 5000.0, 10000.0, 12000.0, 11000.0, 16000.0};
	        double[] actual = HolidayBonus.calculateHolidayBonus(district5);
	        assertArrayEquals(expected, actual, 0);
	    }
	    
	    @Test
	    public void testCalculateTotalHolidayBonus_district5() {
	        assertEquals(70000, HolidayBonus.calculateTotalHolidayBonus(district5), 0);
	    } 
	   
}
