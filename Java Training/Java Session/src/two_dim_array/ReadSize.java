package two_dim_array;

import java.util.Scanner;

public class ReadSize {
	public static int n = 3;
	public static int m = 3;
	public void takeInput() {
		
		String inpValueForN = "", inpValueForM = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of rows (Press enter for default size) :: ");
		inpValueForM = sc.nextLine();
		
		System.out.println("Enter Number of columns (Press enter for default size) :: ");
		inpValueForN = sc.nextLine();
		
		if(inpValueForM.equals("")) {
			System.out.println("Number of rows = 3");
			n = Integer.parseInt(inpValueForN);
		}
		else if(inpValueForN.equals("")) {
			System.out.println("Number of columns = 3");
			m = Integer.parseInt(inpValueForM);
		}
		else {
			n = Integer.parseInt(inpValueForN);
			m = Integer.parseInt(inpValueForM);
			
			System.out.println("Number of rows = " + m);
			System.out.println("Number of columns = " + n);
			
		}
	}
}
