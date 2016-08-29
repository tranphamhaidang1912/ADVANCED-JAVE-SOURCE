package Shop;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class MainShop {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ArrayList<Product> product = new ArrayList<Product>(5);
			ArrayList<OrderDetail> orderDetail = new ArrayList<OrderDetail>(5);
			String[] state = {"Ordered", "Paid", "Received"};
			
			product.add(new Product("Apple", 10000));
			product.add(new Product("Orange", 20000));
			product.add(new Product("Banana", 30000));
			product.add(new Product("Cherry", 40000));
			product.add(new Product("Lemon", 50000));
			product.add(new Product("Pepsi", 60000));
			product.add(new Product("Mirinda", 70000));
			product.add(new Product("7 Up", 80000));
			product.add(new Product("Sting", 90000));
			product.add(new Product("C2", 100000));
			
			int chooseProduct = 0;
			int number = 0;
			String chooseContinue = "";
			do {
				System.out.println("List Product");
				System.out.println("STT\tProduct Name\tPrice");
				for (int i = 0; i < product.size(); i++)
					System.out.println(i + 1 + "\t" + product.get(i).getName() + "\t\t" + product.get(i).getPrice());
				
				System.out.print("Choose Produt: ");
				chooseProduct = sc.nextInt();
				System.out.print("Input Number: ");
				number = sc.nextInt();
				orderDetail.add(new OrderDetail(number));
				
				sc.nextLine();
				System.out.println("Do you want to choose more? (y / n)");
				chooseContinue = sc.nextLine();
			} while (chooseContinue.compareTo("y") == 0);
			
			System.out.println("Do you have member card? (y / n)");
			String chooseMemberCard = sc.nextLine();
			
			Customer customer = new Customer("611/60", "tranphamhaidang1912@gmail.com", "025494661", "Tran Pham Hai Dang", "01658261080", "123456");
			if(chooseMemberCard.compareTo("n") == 0)
			{
				System.out.println("Please input Customer Information");
				System.out.print("Input Name: ");
				String name = sc.nextLine();
				System.out.println("Input Indentity Card Number: ");
				String indentityCardNumber = sc.nextLine();
				System.out.println("Input Phone Number: ");
				String phoneNumber = sc.nextLine();
				System.out.println("Input Email: ");
				String email = sc.nextLine();
				System.out.println("Input Address: ");
				String address = sc.nextLine();
				
				customer = new Customer(address, email, indentityCardNumber, name, phoneNumber);
			}
			
			System.out.println("Do you want to invoice? (y / n)");
			String chooseInvoice = sc.nextLine();
			
			Order order = new Order(true, new Date(), state[0]);
			if(chooseInvoice.compareTo("n") == 0)
				order = new Order(false, new Date(), state[0]);
			
			showCustomerInformation(customer);
			showOrderInformation(order);
			showOrderDetail(order, orderDetail, product);
			
			System.out.println("1/Order\n2/Order and Pay");
			int chooseOrder = sc.nextInt();
			
			if(chooseOrder == 1)
				System.out.println("Order Successfully!");
			else if(chooseOrder == 2)
			{
				System.out.println("1/ATM\n2/Credit");
				int choosePayment = sc.nextInt();
				
				if(choosePayment == 1)
				{
					double totalOrderPrice = order.getTotalOrderPrice(orderDetail, product);
					double tax = order.getTax(totalOrderPrice);
					double totalPay = order.getTotalPay(totalOrderPrice, tax);
					
					ATM atm = new ATM();
					if(atm.getBalance() >= totalPay)
					{
						System.out.println("Order & Pay Successfully!");
						order.setState(state[1]);
					}
					else
						System.out.println("The Balance Is Not Enough To Pay!");
				}
				else if(choosePayment == 2)
				{
					Date date = new Date();
					Credit credit = new Credit();
					if(date.before(credit.getExpirationDate()) == true)
					{
						System.out.println("Order & Pay Successfully!");
						order.setState(state[1]);
					}
					else 
						System.out.println("The Credit Is Expired!");
				}
			}	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}
	
	//Show Customer Information
	public static void showCustomerInformation(Customer customer) {
		System.out.println("---Customer Information---");
		System.out.println("Customer ID: " + customer.getCustomerID());
		System.out.println("Name: " + customer.getName());
		System.out.println("Indentity Card Number: " + customer.getIndentityCardNumber());
		System.out.println("Phone Number: " + customer.getPhoneNumber());
		System.out.println("Email: " + customer.getEmail());
		System.out.println("Address: " + customer.getAddress());
	}
	
	//Show Order Information
	public static void showOrderInformation(Order order) {
		System.out.println("---Order Information---");
		System.out.println("Order Date: " + order.getOrderDate());
		System.out.println("State: " + order.getState());
		System.out.print("Invoice: ");
		if(order.isInvoice() == true)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	
	//Show Order Detail
	public static void showOrderDetail(Order order, ArrayList<OrderDetail> orderDetail, ArrayList<Product> product) {
		System.out.println("---Order Detail---");
		System.out.println("STT\tProduct Name\tPrice\t  Number  Total Product Price");
		for (int i = 0; i < orderDetail.size(); i++) {
			System.out.println(i + 1 + "\t" + product.get(i).getName() + "\t\t" + product.get(i).getPrice() 
					+ "\t  " + orderDetail.get(i).getNumber() + "\t  " + orderDetail.get(i).getTotalOrderDetailPrice(product.get(i).getPrice()));
		}
	
		double totalOrderPrice = order.getTotalOrderPrice(orderDetail, product);
		System.out.println("Total\t\t\t\t\t  " + totalOrderPrice);
		double tax = order.getTax(totalOrderPrice);
		System.out.println("Tax\t\t\t\t\t  " + tax);
		double totalPay = order.getTotalPay(totalOrderPrice, tax);
		System.out.println("Total Pay\t\t\t\t  " + totalPay);
	}
}
