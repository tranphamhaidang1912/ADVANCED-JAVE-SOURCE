package Gift;

import java.util.Scanner;

public class MainGift {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Input information of Gift");
			System.out.println("Input shape:");
			String shape = sc.nextLine();
			System.out.println("Input color:");
			String color = sc.nextLine();
			System.out.println("Input name:");
			String name = sc.nextLine();
			System.out.println("Input weight:");
			double weight = sc.nextDouble();
			
			GiftBox.Gift gift = new GiftBox(shape, color).new Gift(name, weight);
			System.out.println("Information of Gift");
			gift.showInformationGift();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
