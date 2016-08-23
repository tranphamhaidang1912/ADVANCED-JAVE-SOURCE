package Transport;

import java.util.Scanner;

import Instrument.NonStringedInstrument;
import Instrument.StringedInstrument;

public class MainTransport {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Car[] car = new Car[100];
			Ship[] ship = new Ship[100];
			int numberOfCar = 0;
			int numberOfShip = 0;
			String choose = "";
			do {
				System.out.println("Input information of Transport");
				System.out.println("Input id:");
				String id = sc.nextLine();
				System.out.println("Input owner:");
				String owner = sc.nextLine();
				System.out.println("Input color:");
				String color = sc.nextLine();
				System.out.println("Input manufacturer:");
				String manufacturer = sc.nextLine();
				System.out.println("Input distance:");
				double distance = sc.nextDouble();
				System.out.println("Input time:");
				double time = sc.nextDouble();
				System.out.println("Input number liter of fuel");
				double numberLiterFuel = sc.nextDouble();
				sc.nextLine();
				System.out.println("1/Car\n2/Ship");
				choose = sc.nextLine();
				
				if(choose.compareTo("1") == 0)
				{
					System.out.println("Input gear type:");
					String gearType = sc.nextLine();
					System.out.println("Input car type:");
					String carType = sc.nextLine();
					car[numberOfCar] = new Car(distance, time, numberLiterFuel, id, owner, color, manufacturer, gearType, carType);
					numberOfCar++;
				}
				else if(choose.compareTo("2") == 0)
				{
					System.out.println("Input weight:");
					double weight = sc.nextDouble();
					System.out.println("Input capacity:");
					double capacity = sc.nextDouble();
					System.out.println("Input downstream speed:");
					double downstreamSpeed = sc.nextDouble();
					System.out.println("Input upstream speed:");
					double upstreamSpeed = sc.nextDouble();
					System.out.println("Input fuel consumption start:");
					double fuelConsumptionStart = sc.nextDouble();
					System.out.println("Input fuel type:");
					String fuelType = sc.nextLine();
					ship[numberOfShip] = new Ship(distance, time, numberLiterFuel, id, owner, color, manufacturer);
					numberOfShip++;
				}
				else
				{
					System.out.println("Please just choose (1) or (2)");
					continue;
				}
				
				System.out.println("Do you want to add more computer? (y / n)");
				choose = sc.nextLine();
			} while (choose.compareTo("y") == 0);
			
			System.out.println("List of Car");
			for (int i = 0; i < numberOfCar; i++)
				car[i].showInformationTransport();
			
			System.out.println("List of Ship");
			for (int i = 0; i < numberOfShip; i++)
				ship[i].showInformationTransport();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
