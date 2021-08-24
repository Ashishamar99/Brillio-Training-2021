package one_dim_array;

public class Display extends Read{
	
	public void displayHorizontal() {
		System.out.println("Displaying the Array Horizontally");
		
		for(int i=0; i<n; i++) {
			System.out.print(numbers[i] + "\t");
		}
	}
	
	public void displayVertical() {
		System.out.println("\nDisplaying the Array Verically");
		
		for(int i=0; i<n; i++) {
			System.out.println(numbers[i]);
		}
	}

}
