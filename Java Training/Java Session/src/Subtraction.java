public class Subtraction {
	int n1, n2, n3;
	
	public int[] readData() {
		
		System.out.print("Enter 2 nos:: ");
		n1 = Read.sc.nextInt();
		n2 = Read.sc.nextInt();
		
		int[] numbers = {n1, n2};
		return numbers;
	}
	
	public void setData(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public void calcData() {
		n3 = n1 - n2;
	}
	
	public void displayData() {
		System.out.println("N1 = " + n1 + "\nN2 = " + n2 + "\nN1 + N2 = " + n3);
	}
}
