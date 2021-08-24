package one_dim_array;

import java.util.Scanner;

public class Read extends Create{
	public static int searchItem = 0;
	Scanner sc = new Scanner(System.in);
	public void readData() {
		System.out.println("Enter the elements of the array:: ");
		for(int i=0; i<n; i++) {
			numbers[i] = sc.nextInt();
		}
	}
	
	public void readSearchElement() {
		System.out.println("Enter Search Element:: ");
		searchItem = sc.nextInt();
		
	}
}
