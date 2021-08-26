package school_admission;

public class invalidAgeException extends Exception {
	public invalidAgeException() {
		// TODO Auto-generated constructor stub
		super("Child should be more than 5 years old");
	}
}