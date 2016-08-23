package Shape;

import java.util.Scanner;

public class MainShape {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String choose = "";
			do {
				System.out.println("1/Circle\n2/Rectangle\n3/Square");
				choose = sc.nextLine();
				
				if(choose.compareTo("1") == 0)
				{
					Circle circle = new Circle();
					circle.setR(3);
					System.out.println("Perimeter of Circle: " + circle.perimeter());
					System.out.println("Area of Circle: " + circle.area());
				}
				else if(choose.compareTo("2") == 0)
				{
					Rectangle rectangle = new Rectangle();
					rectangle.setLength(5);
					rectangle.setWidth(4);
					System.out.println("Perimeter of Rectangle: " + rectangle.perimeter());
					System.out.println("Area of Rectangle: " + rectangle.area());
				}
				else if(choose.compareTo("3") == 0)
				{
					Square square = new Square();
					square.setEdge(6);
					System.out.println("Perimeter of Square: " + square.perimeter());
					System.out.println("Area of Square: " + square.area());
				}
				else
				{
					System.out.println("Please just choose (1) or (2) or (3)");
					continue;
				}
			} while (choose.compareTo("1") != 0 && choose.compareTo("2") != 0 && choose.compareTo("3") != 0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
