package lambda_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LambdaDemo {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {4, 5,6,8,2,4,10,15}));
		int x = (int) arr.stream().filter(i -> i%2==0).count();
		List <Integer> evens = arr.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(evens);
	}
}
