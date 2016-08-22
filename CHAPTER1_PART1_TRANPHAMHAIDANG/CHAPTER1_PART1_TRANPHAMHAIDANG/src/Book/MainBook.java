package Book;

import java.util.Scanner;

import Human.Human;
import Human.Student;
import Human.Teacher;

public class MainBook {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			TextBook[] textBook = new TextBook[100];
			ReferenceBook[] referenceBook = new ReferenceBook[100];
			String choose = "";
			int numberOfTextBook = 0;
			int numberOfReferenceBook = 0;
			do {
				System.out.println("Input information of Book");
				System.out.println("Input id:");
				String id = sc.nextLine();
				System.out.println("Input name:");
				String name = sc.nextLine();
				System.out.println("Input date:");
				String date = sc.nextLine();
				System.out.println("Input manufacturer:");
				String manufacturer = sc.nextLine();
				System.out.println("Price:");
				double price = sc.nextDouble();
				System.out.println("Number:");
				int number = sc.nextInt();
				
				choose = sc.nextLine();
				System.out.println("1/Text book\n2/Reference book");
				choose = sc.nextLine();
				
				if(choose.compareTo("1") == 0)
				{
					System.out.println("Input state:");
					String state = sc.nextLine();
					textBook[numberOfTextBook] = new TextBook(id, name, date, price, number, manufacturer, state);
					numberOfTextBook++;
				}
				else if(choose.compareTo("2") == 0)
				{
					System.out.println("Input tax:");
					double tax = sc.nextDouble();
					referenceBook[numberOfReferenceBook] = new ReferenceBook(id, name, date, price, number, manufacturer, tax);
					numberOfReferenceBook++;
					choose = sc.nextLine();
				}
				else
				{
					System.out.println("Please just choose (1) or (2)");
					continue;
				}
				
				System.out.println("Do you want to add more computer? (y / n)");
				choose = sc.nextLine();
			} while (choose.compareTo("y") == 0);	
			
			double totalPrice = 0;
			double averagePrice = 0;
			
			System.out.println("List of Text book");
			for (int i = 0; i < numberOfTextBook; i++)
			{
				textBook[i].showInformationBook();
				totalPrice += textBook[i].getTotalPriceTextBook();
			}
			System.out.println("Total price of Text book: " + totalPrice);
			
			totalPrice = 0;
			System.out.println("List of Reference book");
			for (int i = 0; i < numberOfReferenceBook; i++)
			{
				referenceBook[i].showInformationBook();
				totalPrice += referenceBook[i].getTotalPriceReferenceBook();
			}
			averagePrice = totalPrice / numberOfReferenceBook;
			System.out.println("Total price of Reference book: " + totalPrice);
			System.out.println("Average price of Reference book: " + averagePrice);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
