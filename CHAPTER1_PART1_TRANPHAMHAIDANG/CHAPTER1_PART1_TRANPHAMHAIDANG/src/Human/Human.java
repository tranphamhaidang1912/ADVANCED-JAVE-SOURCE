package Human;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * Class for Human
 */
public class Human {

	String fullName;
	String birthDate;
	String address;
	String phoneNumber;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Human(String fullName, String birthDate, String address,
			String phoneNumber) {
		super();
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Show the information of Human 
	public void showInformationHuman() {
		System.out.println("Full name: " + fullName);
		System.out.println("Birth Date: " + birthDate);
		System.out.println("Address: " + address);
		System.out.println("Phone number: " + phoneNumber);
	}
}
