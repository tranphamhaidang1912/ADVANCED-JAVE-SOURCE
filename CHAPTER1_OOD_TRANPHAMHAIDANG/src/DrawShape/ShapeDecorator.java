package DrawShape;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 05-Sep-2016
 * Abstract class for Shape Decorator
 */
public abstract class ShapeDecorator implements Shape {

	protected Shape shape;

	public ShapeDecorator(Shape shape) {
		super();
		this.shape = shape;
	}

	public ShapeDecorator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return shape.draw();
	}
	
}
