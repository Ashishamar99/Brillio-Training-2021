package one_dim_array;

import java.util.Arrays;

public class Sort extends Display {
	public void sortArray() {
		System.out.println("\nBefore Sorting...");
		displayHorizontal();
		
		Arrays.sort(numbers);
		
		System.out.println("\nAfter Sorting...");
		displayHorizontal();
		
	}

}
