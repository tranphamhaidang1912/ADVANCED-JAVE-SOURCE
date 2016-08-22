package Computer;

import java.util.Scanner;

public class MainComputer {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Desktop[] desktop = new Desktop[100];
			Laptop[] laptop = new Laptop[100];
			String choose = "";
			int numberOfDesktop = 0;
			int numberOfLaptop = 0;
			do {
				System.out.println("Input information of computer");
				System.out.println("Input id:");
				String id = sc.nextLine();
				System.out.println("Input price:");
				double price = sc.nextDouble();
				sc.nextLine();
				System.out.println("Input Manufacturer:");
				String manufacturer = sc.nextLine();
				System.out.println("Input number:");
				int number = sc.nextInt();
				
				sc.nextLine();
				System.out.println("1/Desktop\n2/Laptop");
				choose = sc.nextLine();
				if(choose.compareTo("1") == 0)
				{
					System.out.println("Input CPU:");
					String cPU = sc.nextLine();
					System.out.println("Input RAM:");
					String rAM = sc.nextLine();
					desktop[numberOfDesktop] = new Desktop(id, price, manufacturer, number, cPU, rAM);
					numberOfDesktop++;
				}
				else if(choose.compareTo("2") == 0)
				{
					System.out.println("Input weight:");
					String weight = sc.nextLine();
					System.out.println("Input time of PIN:");
					String timeOfPIN = sc.nextLine();
					System.out.println("Input size of screen:");
					String sizeOfScreen = sc.nextLine();
					laptop[numberOfLaptop] = new Laptop(id, price, manufacturer, number, weight, timeOfPIN, sizeOfScreen);
					numberOfLaptop++;
				}
				else
				{
					System.out.println("Please just choose (1) or (2)");
					continue;
				}
				
				System.out.println("Do you want to add more computer? (y / n)");
				choose = sc.nextLine();
			} while (choose.compareTo("y") == 0);	
			
			System.out.println("List of Desktop");
			for (int i = 0; i < numberOfDesktop; i++)
				desktop[i].showInformationComputer();
			
			System.out.println("List of Laptop");
			for (int i = 0; i < numberOfLaptop; i++)
				laptop[i].showInformationComputer();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
