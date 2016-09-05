package TransitionMoney;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 05-Sep-2016
 * Class for Mobi Observer
 */
public class MobiObserver extends Observer {

	
	public MobiObserver(Account account) {
		this.account = account;
		this.account.attach(this);
	}

	@Override
	public String update() {
		// TODO Auto-generated method stub
		return "Mobi: Xin chao. Tai khoan cua quy khach da thay doi.\nSo du hien tai la: " + account.getBalance() + "vnd";
	}

}
