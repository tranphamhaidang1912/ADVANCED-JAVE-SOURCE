package ManageContact;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 15-Sep-2016
 * Class for Contact
 */
public class Contact implements Comparable<Contact> {

	private String name;
	private String phoneNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Contact(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public Contact(String name) {
		super();
		this.name = name;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Show contact's information
	public void showInformation() {
		System.out.println("Name: " + name);
		System.out.println("Phone number: " + phoneNumber);
	}

	@Override
	public int compareTo(Contact o) {
		// TODO Auto-generated method stub
		return this.name.compareToIgnoreCase(o.name);
	}
	
	public boolean equals (Object o) {
		return this.name.equalsIgnoreCase(((Contact) o).name);
	}
}
