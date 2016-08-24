package Gift;

/*
 * Author: Tran Pham Hai Dang
 * Date: 24/08/2016
 * Version: 1.0
 * Class for Gift Box
 */
public class GiftBox {

	public String shape;
	public String color;
	final int price = 10000;

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public GiftBox(String shape, String color) {
		super();
		this.shape = shape;
		this.color = color;
	}

	public GiftBox() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	/*
	 * Author: Tran Pham Hai Dang
	 * Date: 24/08/2016
	 * Version: 1.0
	 * Class for Gift
	 */
	public class Gift {
		public String name;
		public double weight;
		final int FEE = 200;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getWeight() {
			return weight;
		}

		public void setWeight(double weight) {
			this.weight = weight;
		}

		public int getFEE() {
			return FEE;
		}

		public Gift(String name, double weight) {
			super();
			this.name = name;
			this.weight = weight;
		}

		public Gift() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		//Calculate fee of gift
		public double calFee() {
			return weight * FEE + GiftBox.this.price;
		}

		//Show information of Gift
		public void showInformationGift() {
			// TODO Auto-generated method stub
			System.out.println("Shape: " + shape);
			System.out.println("Color: " + color);
			System.out.println("Name: " + name);
			System.out.println("Weight: " + weight);
			System.out.println("Fee: " + calFee());
		}	
	}
}
