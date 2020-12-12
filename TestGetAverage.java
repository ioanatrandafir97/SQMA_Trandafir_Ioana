import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestGetAverage {
	
	@Test
	public void testGetAverageReturnsCorrectResult() {
		int[] elements = {10, 20, 30, 40, 50};
		double expectedAverage = 30;
		double actualAverage = Calculator.getAverage(elements);
		assertEquals(expectedAverage, actualAverage, 0.0001);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetAverageWithNullArrayThrowsException() {
		int[] elements = null;
		Calculator.getAverage(elements);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetAverageWithEmptyArrayThrowsException() {
		int[] elements = {};
		Calculator.getAverage(elements);
	}
	
	@Test
	public void testGetAverageWithOneElementReturnsTheElement() {
		int[] elements = {20}; 
		double expectedAverage = 20;
		double actualAverage = Calculator.getAverage(elements);
		assertEquals(expectedAverage, actualAverage, 0.0001);
	}

}
