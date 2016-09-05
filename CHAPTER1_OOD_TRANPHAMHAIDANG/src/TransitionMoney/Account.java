package TransitionMoney;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 05-Sep-2016
 * Class for Account
 */
public class Account {

	private List<Observer> observers = new ArrayList<>();
	private double balance = 10000000;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyAllObservers() {
		for(Observer observer : observers)
			observer.update();
	}
}
