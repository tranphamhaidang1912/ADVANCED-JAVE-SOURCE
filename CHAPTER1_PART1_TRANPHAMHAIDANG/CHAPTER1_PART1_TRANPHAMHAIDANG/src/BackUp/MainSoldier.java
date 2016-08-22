package BackUp;

import java.util.Scanner;

public class MainSoldier {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("Input information of Infantryman");
			Infantryman infantryman = new Infantryman();
			infantryman.inputInformationSoldier();
			System.out.println("Input information of Trooper");
			Trooper trooper = new Trooper();
			trooper.inputInformationSoldier();
			
			String choose = "";
			int powerIntryman = 1;
			int powerTrooper = 1;
			do {
				System.out.println("1/Infantryman fights\n2/Trooper fights");
				choose = sc.nextLine();
				
				if(choose.compareTo("1") == 0)
					powerTrooper = trooper.fight();
				else if(choose.compareTo("2") == 0)
					powerIntryman = infantryman.fight();
				else
				{
					System.out.println("Please just choose (1) or (2)");
					continue;
				}
				System.out.println("Power of Infantryman: " + infantryman.getPower());
				System.out.println("Power of Trooper: " + trooper.getPower());
					
			} while (powerIntryman > 0 && powerTrooper > 0);
			
			if(powerTrooper <= 0)
				System.out.println("Intryman wins");
			else if(powerIntryman <= 0)
				System.out.println("Trooper wins");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}
	
}
