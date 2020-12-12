import static org.junit.Assert.*;

import org.junit.Test;

public class TestGetFrequencyOfMaxNumberInArray {

	@Test
	public void testGetFrequencyOfMaxNumberInArrayReturnsCorrectResultForOneOccurence() {
		int[] elements = {5, 10, 20, 7};
		int expectedFrequency = 1;
		int actualFrequency = Calculator.getFrequencyOfMaxNumberInArray(elements);
		assertEquals(expectedFrequency, actualFrequency);
	}
	
	@Test
	public void testGetFrequencyOfMaxNumberInArrayReturnsCorrectResultForMultipleOccurences() {
		int[] elements = {5, 10, 20, 7, 20, 15};
		int expectedFrequency = 2;
		int actualFrequency = Calculator.getFrequencyOfMaxNumberInArray(elements);
		assertEquals(expectedFrequency, actualFrequency);
	}
	
	@Test
	public void testGetFrequencyOfMaxNumberInArrayReturnsCorrectResultForNegativeValues() {
		int[] elements =  {-15, -24, -32, -12, -8, -23, -8};
		int expectedFrequency = 2;
		int actualFrequency = Calculator.getFrequencyOfMaxNumberInArray(elements);
		assertEquals(expectedFrequency, actualFrequency);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetFrequencyOfMaxNumberInNullArrayThrowsException() {
		int[] elements = null;
		Calculator.getFrequencyOfMaxNumberInArray(elements);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetFrequencyOfMaxNumberInEmptyArrayThrowsException() {
		int[] elements = {};
		Calculator.getFrequencyOfMaxNumberInArray(elements);
	}

}
