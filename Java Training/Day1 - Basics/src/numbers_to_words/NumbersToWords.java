package numbers_to_words;
import java.util.*;

public class NumbersToWords {

public static void main(String[] args) {
	
	final String[] twodigits = {"", " Ten", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", " Seventy", " Eighty", " Ninety"};  
	final String[] onedigit = {"", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten", " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen"};
	final String hundred = " Hundred ";
	final String thousand = " Thousand";

	System.out.println("Enter n:: ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int rem;
	String res = "";
	
	while(n!=0) {
		
		rem = n%10;
		if(n < 20) {
			res += onedigit[n];
			break;
		}
		else if(n>=20 && n<=99) {
			rem = n%10;
			n=n/10;
			res += twodigits[n] + onedigit[rem];
			break;
		}
		
		else if(n>=100 && n<=999) {
			
			rem = n/100;
			n=n%100;
			
			if(n!=0)
				res += onedigit[rem] + hundred + "and";
			else
				res += onedigit[rem] + hundred;
			continue;
		}
		
		else if(n>=1000 && n<=9999) {
					
					rem = n/1000;
					n=n%1000;
					res += onedigit[rem] + thousand;
					continue;
					
				}
		n = n/10;
		
	}
	
	System.out.println(res);
}

}
