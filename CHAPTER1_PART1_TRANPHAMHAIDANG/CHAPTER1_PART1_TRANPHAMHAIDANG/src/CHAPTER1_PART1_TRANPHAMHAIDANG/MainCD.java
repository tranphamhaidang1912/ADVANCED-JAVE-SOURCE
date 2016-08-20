package CHAPTER1_PART1_TRANPHAMHAIDANG;

import java.util.Scanner;

public class MainCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner sc = new Scanner(System.in);
			String id;
			String name;
			String singer;
			int numOfSongs;
			double price;
			String chosing;
			CD[] cd = new CD[100];
			int numOfCD = 0;
			
			do {
				System.out.println("Input ID:");
				id  = sc.nextLine();
				System.out.println("Input Name:");
				name = sc.nextLine();
				System.out.println("Input Singer:");
				singer = sc.nextLine();
				System.out.println("Input Number Of Songs:");
				numOfSongs = sc.nextInt();
				System.out.println("Input Price:");
				price = sc.nextDouble();
				
				cd[numOfCD] = new CD(id, name, singer, numOfSongs, price);
				numOfCD++;
				
				int totalPirce = 0;
				for (int i = 0; i < numOfCD; i++) {
					cd[i].printCD();
					totalPirce += cd[i].getPrice();
				}
				System.out.println("Total Price = " + totalPirce);
				
				System.out.println("Do you want to add a new CD? (y / n)");
				sc.nextLine();
				chosing = sc.nextLine();
				
			} while (chosing.compareTo("y") == 0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
