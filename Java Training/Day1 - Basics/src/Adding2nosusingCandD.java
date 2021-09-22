
public class Adding2nosusingCandD {

	public static void main(String[] args) {
	
		AdditionConstDest acd = new AdditionConstDest();
		acd.calcData();
		acd.displayData();
		acd = null;
		System.gc();
		
		AdditionConstDest acd1 = new AdditionConstDest(10);
		acd1.calcData();
		acd1.displayData();
		acd1 = null;
		System.gc();
		
		AdditionConstDest acd2 = new AdditionConstDest(10, 20);
		acd2.calcData();
		acd2.displayData();
		acd2 = null;
		System.gc();
	}
	
	
}
