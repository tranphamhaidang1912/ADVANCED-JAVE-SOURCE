package DrawShape;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 05-Sep-2016
 * Class for Red Shape Decorator
 */
public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RedShapeDecorator(Shape shape) {
		super(shape);
		// TODO Auto-generated constructor stub
	}
	
	private String setRedBorder(Shape shape) {
		return "Border Color: Red";
	}
	
	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return this.shape.draw() + " and " + setRedBorder(shape);
	}
	
}
