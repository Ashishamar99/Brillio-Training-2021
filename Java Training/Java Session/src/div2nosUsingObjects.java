public class div2nosUsingObjects {
	public static void main(String[] args) {
		
		Division div = new Division();
		int[] numbers;
		
		numbers = div.readData();
		div.setData(numbers[0], numbers[1]);
		div.calcData();
		div.displayData();
		
	}
}

