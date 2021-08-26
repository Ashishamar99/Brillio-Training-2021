package school_admission;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class studentOperations{

	public static studentClass enrollStudent() throws invalidAgeException {
		System.out.println("Enter ID, Name, DOB('dd-MM-yyyy') of student to enroll:");
		int id = Read.sc.nextInt();
		String name = Read.sc.next();
		String dob = Read.sc.nextLine();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date d_o_b = null;
		try {
			d_o_b = formatter.parse(dob);
			Instant instant = d_o_b.toInstant();
		    ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
		    LocalDate givenDate = zone.toLocalDate();
		     //Calculating the difference between given date to current date.
		    Period period = Period.between(givenDate, LocalDate.now());
			if(period.getYears() < 5) {
				throw new invalidAgeException();
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		studentClass student = new studentClass(id, name, d_o_b);
		return student;
	}

//	public void printAll(studentClass students[]) {
//		
//		for (studentClass studentClass : students) {
//			System.out.println(students);
//		}
//	}


}