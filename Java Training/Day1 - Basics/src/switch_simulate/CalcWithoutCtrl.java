package switch_simulate;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Scanner;

public class CalcWithoutCtrl {
public static void main(String[] args) throws Exception {
	HashMap <Integer, String> choices = new HashMap<Integer, String>();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a and b :: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	System.out.println("Enter 1 for add, 2 for sub, 3 for mul and 4 for div:: ");
	int n = sc.nextInt();
	
//	String add = "add(" + a + "," + b + ")";
//	String mul = "mul(" + a + "," + b + ")";
//	String sub = "sub(" + a + "," + b + ")";
//	String div = "div(" + a + "," + b + ")";
	
	String add = "add";
	String mul = "mul";
	String sub = "sub";
	String div = "div";
	
	choices.put(1, add);
	choices.put(2, sub);
	choices.put(3, mul);
	choices.put(4, div);
	
	Method method = CalcRes.class.getDeclaredMethod(choices.get(n));
	method.setAccessible(true);
	method.invoke(a, b);
}
}