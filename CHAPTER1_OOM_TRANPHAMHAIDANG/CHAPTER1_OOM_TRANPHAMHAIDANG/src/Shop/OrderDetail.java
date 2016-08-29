package Shop;

import java.util.ArrayList;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 29-Aug-2016 8:28:11 AM
 * Class for Order Detail
 */
public class OrderDetail {

	private long number;

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public OrderDetail(long number) {
		super();
		this.number = number;
	}

	public OrderDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Calculate total order detail price
	public double getTotalOrderDetailPrice(double price){
		return number * price;
	}
}