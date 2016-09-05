package TransitionMoney;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 05-Sep-2016
 * Abstract class for Observer
 */
public abstract class Observer {

	protected Account account;
	public abstract String update();
}
