package ManageContractClass;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 6-Sep-2016 8:28:11 AM
 * Class for Teacher
 */
public class Teacher extends Person {

	List<String> listTeachingSubject = new ArrayList<String>();

	public List<String> getListTeachingSubject() {
		return listTeachingSubject;
	}

	public void setListTeachingSubject(List<String> listTeachingSubject) {
		this.listTeachingSubject = listTeachingSubject;
	}

	public Teacher(String fullName, String phoneNumber, String email, List<String> listTeachingSubject) {
		super(fullName, phoneNumber, email);
		this.listTeachingSubject = listTeachingSubject;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String fullName, String phoneNumber, String email) {
		super(fullName, phoneNumber, email);
		// TODO Auto-generated constructor stub
	}
	
	//Show teacher's information
	public void showTeacherInformation() {
		System.out.println("Full name: " + fullName);
		System.out.println("Phone number: " + phoneNumber);
		System.out.println("Email: " + email);
		System.out.println("List teaching subject:");
		for (String string : listTeachingSubject) {
			System.out.println(string);
		}
	}
	
}
