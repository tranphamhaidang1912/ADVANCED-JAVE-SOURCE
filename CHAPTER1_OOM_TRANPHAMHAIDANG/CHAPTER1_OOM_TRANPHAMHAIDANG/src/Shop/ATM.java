package Shop;

import java.util.Date;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 29-Aug-2016 8:28:11 AM
 * Class for ATM
 */
public class ATM extends Card implements AuthInterface {

	private double balance = 10000000;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public ATM(String address, String email, String indentityCardNumber,
			String name, String phoneNumber, String cardID, Date dateCreate,
			double balance) {
		super(address, email, indentityCardNumber, name, phoneNumber, cardID,
				dateCreate);
		this.balance = balance;
	}

	public ATM() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ATM(String address, String email, String indentityCardNumber,
			String name, String phoneNumber, String cardID, Date dateCreate) {
		super(address, email, indentityCardNumber, name, phoneNumber, cardID,
				dateCreate);
		// TODO Auto-generated constructor stub
	}

	public ATM(String address, String email, String indentityCardNumber,
			String name, String phoneNumber) {
		super(address, email, indentityCardNumber, name, phoneNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getAuthMethod() {
		// TODO Auto-generated method stub
		return null;
	}
}