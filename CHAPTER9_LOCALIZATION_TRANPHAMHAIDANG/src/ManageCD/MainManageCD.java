package ManageCD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class MainManageCD {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("1/English\n2/Vietnamese");
			int choose = sc.nextInt();
			sc.nextLine();
			
			String language = "";
			String country = "";
			String path = "";
			switch (choose) {
			case 1:
				language = "en";
				country = "US";
				path = "ManageCD/resource_en_US";
				break;
			case 2:
				language = "vi";
				country = "VN";
				path = "ManageCD/resource_vi_VN";
				break;
			default:
				break;
			}

			Locale currentLocal = new Locale(language, country);
			getResources(path, currentLocal);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}
	
	public static void getResources(String path, Locale currentLocal) {
		
		ResourceBundle message = ResourceBundle.getBundle(path, currentLocal);
		
		List<CD> listCD = new ArrayList<CD>();
		String choose;
		do {
			System.out.println(message.getString("inputCDInformation") + "\n");
			System.out.println(message.getString("inputID") + ":");
			String id = sc.nextLine();
			System.out.println(message.getString("inputName") + ":");
			String name = sc.nextLine();
			System.out.println(message.getString("inputSinger") + ":");
			String singer = sc.nextLine();
			System.out.println(message.getString("inputNumOfSongs") + ":");
			int numOfSongs = sc.nextInt();
			System.out.println(message.getString("inputPrice") + ":");
			double price = sc.nextDouble();
			System.out.println();
			
			listCD.add(new CD(id, name, singer, numOfSongs, price));
			Collections.sort(listCD);
			
			System.out.println(message.getString("listCD") + "\n");
			double sumPirce = 0;
			for (CD cd : listCD) {
				cd.showInformation();
				sumPirce += cd.getPrice();
				System.out.println();
			}
			System.out.println("Total price: " + sumPirce + "\n");
			
			sc.nextLine();
			System.out.println(message.getString("addNewCD"));
			choose = sc.nextLine();
			System.out.println();
			
		} while (choose.compareToIgnoreCase("y") == 0 || choose.compareToIgnoreCase("có") == 0);
	}
}
