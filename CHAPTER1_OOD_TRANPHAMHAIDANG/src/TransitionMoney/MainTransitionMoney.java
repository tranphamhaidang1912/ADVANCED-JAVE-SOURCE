package TransitionMoney;

import java.util.Scanner;

public class MainTransitionMoney {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Choose transition method: WITHDRAW/ TRANSFER");
			String transitionMethod = sc.nextLine();
			
			Account account = new Account();
			
			if(transitionMethod.compareToIgnoreCase("WITHDRAW") == 0)
			{	
				double amountWithdraw = 0;
				do {
					System.out.println("Input amount withdraw:");
					amountWithdraw = sc.nextDouble();
					
					if(amountWithdraw > account.getBalance())
						System.out.println("The balance in the account is not enough, please input again!");
				} while (amountWithdraw > account.getBalance());
				
				System.out.println("Withdraw successfully!");
			}
			else if(transitionMethod.compareToIgnoreCase("TRANSFER") == 0)
			{	
				double amountTransfer = 0;
				do {
					System.out.println("Input amount transfer:");
					amountTransfer = sc.nextDouble();
					
					if(amountTransfer > account.getBalance())
						System.out.println("The balance in the account is not enough, please input again!");
				} while (amountTransfer > account.getBalance());
				
				System.out.println("Transfer successfully!");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
