package DrawShape;

import java.util.Scanner;

public class MainDrawShape {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Choose shape that you want to draw: CIRCLE/ RECTANGLE");
			String shapeType = sc.nextLine();
			
			RedShapeDecorator redShapeDecorator = new RedShapeDecorator();
			if(shapeType.compareToIgnoreCase("CIRCLE") == 0)
			{
				redShapeDecorator = new RedShapeDecorator(new Circle());
			}
			else if(shapeType.compareToIgnoreCase("RECTANGLE") == 0)
			{
				redShapeDecorator = new RedShapeDecorator(new Rectangle());		
			}
			
			System.out.println(redShapeDecorator.draw());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
