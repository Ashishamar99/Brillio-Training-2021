public class subUsingObjects {
	public static void main(String[] args) {
		
		Subtraction sub = new Subtraction();
		int[] numbers;
		
		numbers = sub.readData();
		sub.setData(numbers[0], numbers[1]);
		sub.calcData();
		sub.displayData();
		
	}
}

