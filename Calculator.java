
public class Calculator {
	
	public static int getFrequencyOfMaxNumberInArray(int[] elements) {
		if (elements == null || elements.length == 0) {
			throw new IllegalArgumentException("The array of elements is empty!");
		}
		int frequency = 1;
		int max = elements[0];
		for (int i=1; i<elements.length; i++) {
			if (elements[i] > max) {
				max = elements[i];
				frequency = 1;
			}
			else if (elements[i] == max) {
				frequency++;
			}
		}
		return frequency;
	}
	
	public static double getAverage(int[] elements) {
		if(elements == null || elements.length == 0) {
			throw new IllegalArgumentException("The array of elements is empty!");
		}
		double sum = 0;
		for(int i=0; i<elements.length; i++) {
			sum += elements[i];
		}
		return sum/elements.length;	
	}
	
}
