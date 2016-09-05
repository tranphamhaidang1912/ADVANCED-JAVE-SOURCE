package TransitionMoney;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 05-Sep-2016
 * Class for Email Observer
 */
public class EmailObserver extends Observer {

	public EmailObserver(Account account) {
		this.account = account;
		this.account.attach(this);
	}

	@Override
	public String update() {
		// TODO Auto-generated method stub
		return "Email: Ngan hang AAA kinh chao quy khach. Tai khoan cua quy khach da thay doi.\nSo du hien tai la: " + account.getBalance() + "vnd";
	}

}
