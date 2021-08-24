package planets_and_days;

import java.util.Scanner;

public class PlanetsDemo {
	public static void main(String[] args) {
		Planets obj;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a day between monday to sunday:: ");
		
		String day = sc.next();
		obj = Planets.valueOf(day);

		System.out.println(obj);
		System.out.println(obj.color);
		System.out.println(obj.name);
	}
}
