package ManagePet;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 07-Sep-2016
 * Abstract class for Pet
 */
public abstract class Pet {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pet(String name) {
		super();
		this.name = name;
	}

	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
