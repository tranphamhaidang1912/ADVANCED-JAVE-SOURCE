package Shape;

import java.util.Scanner;

public class MainShape {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Choose shape that you want to draw: CIRCLE/ SQUARE/ RECTANGLE");
		String shapeType = sc.nextLine();
		
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape = shapeFactory.getShape(shapeType);
		shape.draw();
	}

}
