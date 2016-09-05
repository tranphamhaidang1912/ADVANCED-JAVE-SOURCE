package SewingCompany;

import java.util.Scanner;

public class MainSewing {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Choose frock type that you want to sew: TRADITIONAL/ STYLIZED/ CHOENGSAM");
			String frockType = sc.nextLine();
			SewingFactory sewingFactory = new SewingFactory();
			Sewing sewing = sewingFactory.getSewing(frockType);
			sewing.sew();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
