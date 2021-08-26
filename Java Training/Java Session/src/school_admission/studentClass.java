package school_admission;

import java.util.Date;

public class studentClass {

	int id;
	String fname;
	Date dob;

	public studentClass(int id, String fname, Date dob) {
		this.id = id;
		this.fname = fname;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "ID=" + id + ", Name=" + fname + ", DOB=" + dob + "\n";
	}


}
