package Shop;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 29-Aug-2016 8:28:11 AM
 * Class for Order
 */
public class Order {

	private boolean invoice;
	private Date orderDate;
	private String state;
	
	public boolean isInvoice() {
		return invoice;
	}

	public void setInvoice(boolean invoice) {
		this.invoice = invoice;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Order(boolean invoice, Date orderDate, String state) {
		super();
		this.invoice = invoice;
		this.orderDate = orderDate;
		this.state = state;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Calculate total order price
	public double getTotalOrderPrice(ArrayList<OrderDetail> orderDetail, ArrayList<Product> product){
		double totalOrderPrice = 0;
		for (int i = 0; i < orderDetail.size(); i++)
			totalOrderPrice += orderDetail.get(i).getTotalOrderDetailPrice(product.get(i).getPrice());
		return totalOrderPrice;
	}
	
	//Calculate tax
	public double getTax(double totalOrderPrice) {
		if(invoice == true)
			return totalOrderPrice * 0.1;
		return 0;
	}
	
	//Calculate total pay
	public double getTotalPay(double totalOrderPrice, double tax) {
		return totalOrderPrice + tax;
	}
}