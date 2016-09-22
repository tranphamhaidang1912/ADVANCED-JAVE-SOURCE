package ManageProduct;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 17-Sep-2016 Class for Category
 */
public class Category {
	private int id;
	private String name;
	private String description;

	public Category(int id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

}
