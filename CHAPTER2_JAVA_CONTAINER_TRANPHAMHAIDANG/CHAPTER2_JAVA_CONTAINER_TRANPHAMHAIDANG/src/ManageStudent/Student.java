package ManageStudent;

import java.text.SimpleDateFormat;
import java.util.Date;

import ManageDictionary.WordEnglish;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 07-Sep-2016 Class for Student
 */
public class Student implements Comparable<Student> {

	private String id;
	private String name;
	private Date birthDate;
	private String phoneNumber;
	private String email;
	private String address;
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(String id, String name, Date birthDate, String phoneNumber,
			String email, String address) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
	}

	public Student(String id) {
		super();
		this.id = id;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Show word student's information
	public void showInformation() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Birth date: " + dateFormat.format(birthDate));
		System.out.println("Phone number: " + phoneNumber);
		System.out.println("Email: " + email);
		System.out.println("Address: " + address);
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.name.compareToIgnoreCase(o.name);
	}

	@Override
	public boolean equals(Object o) {
		Student student = (Student) o;
		return this.id.equalsIgnoreCase(student.id);
	}

}
