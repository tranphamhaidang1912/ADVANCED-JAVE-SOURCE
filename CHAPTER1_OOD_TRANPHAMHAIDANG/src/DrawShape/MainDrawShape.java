package DrawShape;

import java.util.Scanner;

public class MainDrawShape {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Choose shape that you want to draw: CIRCLE/ RECTANGLE");
			String shapeType = sc.nextLine();
			System.out.println("Do you want to decorate? (y / n)");
			String decorate = sc.nextLine();
			
			RedShapeDecorator redShapeDecorator;
			Shape shape;
			if(shapeType.compareToIgnoreCase("CIRCLE") == 0)
			{
				if(decorate.compareToIgnoreCase("n") == 0)
				{
					shape = new Circle();
					System.out.println(shape.draw());
				}
				else
				{
					redShapeDecorator = new RedShapeDecorator(new Circle());
					System.out.println(redShapeDecorator.draw());
				}
				
			}
			else if(shapeType.compareToIgnoreCase("RECTANGLE") == 0)
			{
				if(decorate.compareToIgnoreCase("n") == 0)
				{
					shape = new Rectangle();
					System.out.println(shape.draw());
				}
				else
				{
					redShapeDecorator = new RedShapeDecorator(new Rectangle());
					System.out.println(redShapeDecorator.draw());
				}
			}		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
