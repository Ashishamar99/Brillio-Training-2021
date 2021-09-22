import java.util.Calendar;

public class Ganeshchaturti {
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2021, 04, 13); //Set a start date
		float x = 12f*29.49f;
		cal.add(Calendar.DATE, (int) x);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
	}

}
