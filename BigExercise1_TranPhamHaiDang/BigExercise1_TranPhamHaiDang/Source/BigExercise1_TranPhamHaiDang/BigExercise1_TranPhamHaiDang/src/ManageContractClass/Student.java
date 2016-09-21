package ManageContractClass;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 6-Sep-2016 8:28:11 AM
 * Class for Student
 */
public class Student extends Person {

	private Date birthDate;
	List<Mark> listMark = new ArrayList<Mark>();

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Student(String fullName, String phoneNumber, String email,
			Date birthDate) {
		super(fullName, phoneNumber, email);
		this.birthDate = birthDate;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String fullName, String phoneNumber, String email) {
		super(fullName, phoneNumber, email);
		// TODO Auto-generated constructor stub
	}
	
	//Show student's information
	public void showStudentInformation() {
		System.out.println("Full name: " + fullName);
		System.out.println("Phone number: " + phoneNumber);
		System.out.println("Email: " + email);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Birth date: " + dateFormat.format(birthDate));
	}
}
