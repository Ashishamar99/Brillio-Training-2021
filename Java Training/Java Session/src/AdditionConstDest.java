
public class AdditionConstDest {
	int n1, n2, n3;
	
	public AdditionConstDest() {
		System.out.println("In 0 Parameterised Constructor");
		System.out.print("Enter 2 nos:: ");
		n1 = Read.sc.nextInt();
		n2 = Read.sc.nextInt();
	}
	
	public AdditionConstDest(int a) {
		System.out.println("In single Parameterised Constructor");
		this.n1 = a;
		this.n2 = a;
	}
	
	public AdditionConstDest(int a, int b) {
		System.out.println("In 2 Parameterised Constructor");
		this.n1 = a;
		this.n2 = b;
	}
	
	public void finalize() {
		System.out.println("In Destructor");
	}
	
	public void calcData() {
		n3 = n1 + n2;
	}
	
	public void displayData() {
		System.out.println("N1 = " + n1 + "\nN2 = " + n2 + "\nN1 + N2 = " + n3);
	}
	
}
