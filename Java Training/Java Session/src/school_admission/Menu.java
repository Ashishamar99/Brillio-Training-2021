package school_admission;
import java.util.ArrayList;
import java.util.List;

public class Menu extends studentOperations {
	public static void main(String[] args) {
		List<studentClass> students = new ArrayList<>();

		while (true) {
			System.out.println("Enter your choice \n1. Enroll new student \n2.Print all students\n3. Exit");
			int choice = Read.sc.nextInt();
			switch (choice) {
			case 1:
				try {
					students.add(enrollStudent());
				} catch (invalidAgeException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				break;
			case 2:

					System.out.println(students);

				break;
			case 3:
				System.out.println("Exiting..");
				System.exit(0);
				break;
			default:
				System.out.println("Enter Valid Choice");
			}
		}

	}
}