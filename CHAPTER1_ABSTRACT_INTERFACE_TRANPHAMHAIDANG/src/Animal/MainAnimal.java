package Animal;

import java.util.Scanner;

import Transport.Car;
import Transport.Ship;

public class MainAnimal {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Bird[] bird = new Bird[100];
			Fish[] fish = new Fish[100];
			Tiger[] tiger = new Tiger[100];
			Boa[] boa = new Boa[100];
			int numberOfBird = 0;
			int numberOfFish = 0;
			int numberOfTiger = 0;
			int numberOfBoa = 0;
			String choose = "";
			do {
				System.out.println("Input information of Animal");
				System.out.println("Input name:");
				String name = sc.nextLine();
				System.out.println("Input main food:");
				String mainFood = sc.nextLine();
				
				System.out.println("1/Bird\n2/Fish\n3/Tiger\n4/Boa");
				choose = sc.nextLine();
				
				if(choose.compareTo("1") == 0)
				{
					bird[numberOfBird] = new Bird(name, mainFood);
					numberOfBird++;
				}
				else if(choose.compareTo("2") == 0)
				{
					fish[numberOfFish] = new Fish(name, mainFood);
					numberOfFish++;
				}
				else if(choose.compareTo("3") == 0)
				{
					tiger[numberOfTiger] = new Tiger(name, mainFood);
					numberOfTiger++;
				}
				else if(choose.compareTo("4") == 0)
				{
					boa[numberOfBoa] = new Boa(name, mainFood);
					numberOfBoa++;
				}
				else
				{
					System.out.println("Please just choose (1) or (2) or (3) or (4)");
					continue;
				}
				
				System.out.println("Do you want to add more computer? (y / n)");
				choose = sc.nextLine();
			} while (choose.compareTo("y") == 0);
			
			System.out.println("List of Bird");
			for (int i = 0; i < numberOfBird; i++)
				bird[i].showInformationAnimal();
			
			System.out.println("List of Fish");
			for (int i = 0; i < numberOfFish; i++)
				fish[i].showInformationAnimal();
			
			System.out.println("List of Tiger");
			for (int i = 0; i < numberOfTiger; i++)
				tiger[i].showInformationAnimal();
			
			System.out.println("List of Boa");
			for (int i = 0; i < numberOfBoa; i++)
				boa[i].showInformationAnimal();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
