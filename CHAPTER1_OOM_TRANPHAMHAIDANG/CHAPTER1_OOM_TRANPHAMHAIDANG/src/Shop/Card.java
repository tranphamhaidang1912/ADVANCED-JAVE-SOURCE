package Shop;
import java.util.Date;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 29-Aug-2016 8:28:11 AM
 * Class for Card
 */
public class Card extends Information {

	private String cardID;
	private Date dateCreate;

	public String getCardID() {
		return cardID;
	}

	public void setCardID(String cardID) {
		this.cardID = cardID;
	}

	public Date getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}

	public Card(String address, String email, String indentityCardNumber,
			String name, String phoneNumber, String cardID, Date dateCreate) {
		super(address, email, indentityCardNumber, name, phoneNumber);
		this.cardID = cardID;
		this.dateCreate = dateCreate;
	}

	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Card(String address, String email, String indentityCardNumber,
			String name, String phoneNumber) {
		super(address, email, indentityCardNumber, name, phoneNumber);
		// TODO Auto-generated constructor stub
	}
}