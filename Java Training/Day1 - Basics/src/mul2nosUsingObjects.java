public class mul2nosUsingObjects {
	public static void main(String[] args) {
		
		Multiplication mul = new Multiplication();
		int[] numbers;
		
		numbers = mul.readData();
		mul.setData(numbers[0], numbers[1]);
		mul.calcData();
		mul.displayData();
		
	}
}

