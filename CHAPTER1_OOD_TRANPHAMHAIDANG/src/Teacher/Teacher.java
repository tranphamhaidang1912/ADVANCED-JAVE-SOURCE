package Teacher;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 01-Sep-2016
 * Class for Teacher
 */
public class Teacher {

	private static Teacher instance = new Teacher();

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static Teacher getIntance() {
		return instance;
	}
	
	public String shareDocument() {
		return "Reference Document:\n- Chapter 1\n- Chapter 2\n- Chapter 3\n- Chapter 4\n";
	}
}
