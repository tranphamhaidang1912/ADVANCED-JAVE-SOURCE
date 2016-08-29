package Shop;
import java.util.Date;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 29-Aug-2016 8:28:11 AM
 * Class for Credit
 */
public class Credit extends Card implements AuthInterface {

	private Date expirationDate = new Date(2020, 12, 19);
	private double maxDebt;
	private String type;

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public double getMaxDebt() {
		return maxDebt;
	}

	public void setMaxDebt(double maxDebt) {
		this.maxDebt = maxDebt;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Credit(String address, String email, String indentityCardNumber,
			String name, String phoneNumber, String cardID, Date dateCreate,
			Date expirationDate, double maxDebt, String type) {
		super(address, email, indentityCardNumber, name, phoneNumber, cardID,
				dateCreate);
		this.expirationDate = expirationDate;
		this.maxDebt = maxDebt;
		this.type = type;
	}

	public Credit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Credit(String address, String email, String indentityCardNumber,
			String name, String phoneNumber, String cardID, Date dateCreate) {
		super(address, email, indentityCardNumber, name, phoneNumber, cardID,
				dateCreate);
		// TODO Auto-generated constructor stub
	}

	public Credit(String address, String email, String indentityCardNumber,
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