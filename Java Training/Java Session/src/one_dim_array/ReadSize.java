package one_dim_array;

import java.util.Scanner;

public class ReadSize {
	public static int n = 10;
	public void takeInput() {
		
		String inpValue = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size (Press enter for default size) :: ");
		inpValue = sc.nextLine();
		if(inpValue.equals("")) {
			System.out.println("Size of Array = 10");
		}
		else {
			n = Integer.parseInt(inpValue);
			System.out.println("Size of Array = " + n);
		}
	}
}
