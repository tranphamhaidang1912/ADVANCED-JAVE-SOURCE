package ManageCD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainCD {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<CD> listCD = new ArrayList<CD>();
		String choose;
		try {
			do {
				System.out.println("INPUT CD'S INFORMATION\n");
				System.out.println("Input id:");
				String id = sc.nextLine();
				System.out.println("Input name:");
				String name = sc.nextLine();
				System.out.println("Input singer:");
				String singer = sc.nextLine();
				System.out.println("Input number of songs:");
				int numOfSongs = sc.nextInt();
				System.out.println("Input price:");
				double price = sc.nextDouble();
				System.out.println();
				
				listCD.add(new CD(id, name, singer, numOfSongs, price));
				Collections.sort(listCD);
				
				System.out.println("LIST CD\n");
				double sumPirce = 0;
				for (CD cd : listCD) {
					cd.showInformation();
					sumPirce += cd.getPrice();
					System.out.println();
				}
				System.out.println("Total price: " + sumPirce + "\n");
				
				sc.nextLine();
				System.out.println("Do you want to add more CD? (y / n)");
				choose = sc.nextLine();
				System.out.println();
				
			} while (choose.compareToIgnoreCase("y") == 0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
