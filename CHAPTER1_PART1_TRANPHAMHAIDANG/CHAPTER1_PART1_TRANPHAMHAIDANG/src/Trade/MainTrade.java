package Trade;

import java.util.Scanner;

public class MainTrade {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			GoldTrade[] goldTrade = new GoldTrade[100];
			MoneyTrade[] moneyTrade = new MoneyTrade[100];
			String choose = "";
			int numberOfGoldTrade = 0;
			int numberOfMoneyTrade = 0;
			do {
				System.out.println("Input information of Trade");
				System.out.println("Input id:");
				String id = sc.nextLine();
				System.out.println("Input date:");
				String date = sc.nextLine();
				System.out.println("Input number:");
				int number = sc.nextInt();
				
				choose = sc.nextLine();
				System.out.println("1/Gold trade\n2/Money trade");
				choose = sc.nextLine();
				
				if(choose.compareTo("1") == 0)
				{
					System.out.println("Input gold type:");
					String goldType = sc.nextLine();
					goldTrade[numberOfGoldTrade] = new GoldTrade(id, date, number, goldType);
					numberOfGoldTrade++;
				}
				else if(choose.compareTo("2") == 0)
				{
					System.out.println("Input money type:");
					String moneyType = sc.nextLine();
					System.out.println("Input trade type:");
					String tradeType = sc.nextLine();
					moneyTrade[numberOfMoneyTrade] = new MoneyTrade(id, date, number, moneyType, tradeType);
					numberOfMoneyTrade++;
				}
				else
				{
					System.out.println("Please just choose (1) or (2)");
					continue;
				}
				
				System.out.println("Do you want to add more computer? (y / n)");
				choose = sc.nextLine();
			} while (choose.compareTo("y") == 0);
			
			int totalNumberOfGold = 0;
			int totalNumberOfMoney = 0;
			double totalPrice = 0;
			double averagePrice = 0;
			
			System.out.println("List of Gold trade");
			for (int i = 0; i < numberOfGoldTrade; i++) 
			{
				goldTrade[i].showInformationTrade();
				totalNumberOfGold += goldTrade[i].getNumber();
				totalPrice += goldTrade[i].getTotalPrice();
			}
			averagePrice = totalPrice / numberOfGoldTrade;
			System.out.println("Total number of Gold: " + totalNumberOfGold);
			System.out.println("Average price of Gold: " + String.format("%.0f", averagePrice));
			
			totalPrice = 0;
			System.out.println("List of Money trade");
			for (int i = 0; i < numberOfMoneyTrade; i++) 
			{
				moneyTrade[i].showInformationTrade();
				totalNumberOfMoney += moneyTrade[i].getNumber();
				totalPrice += moneyTrade[i].getTotalPrice();
			}
			averagePrice = totalPrice / numberOfMoneyTrade;
			System.out.println("Total number of Money: " + totalNumberOfMoney);
			System.out.println("Average price of Money: " + String.format("%.0f", averagePrice));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
