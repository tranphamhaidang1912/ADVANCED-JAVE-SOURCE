package ManageContractClass;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 6-Sep-2016 8:28:11 AM
 * Class for Person
 */
public abstract class Person {

	protected String fullName;
	protected String phoneNumber;
	protected String email;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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

	public Person(String fullName, String phoneNumber, String email) {
		super();
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
