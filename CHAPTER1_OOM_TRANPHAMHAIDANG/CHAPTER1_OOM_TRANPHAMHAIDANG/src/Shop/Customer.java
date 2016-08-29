package Shop;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 29-Aug-2016 8:28:11 AM
 * Class for Customer
 */
public class Customer extends Information {

	private String customerID;

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public Customer(String address, String email, String indentityCardNumber,
			String name, String phoneNumber, String customerID) {
		super(address, email, indentityCardNumber, name, phoneNumber);
		this.customerID = customerID;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String address, String email, String indentityCardNumber,
			String name, String phoneNumber) {
		super(address, email, indentityCardNumber, name, phoneNumber);
		// TODO Auto-generated constructor stub
	}
}