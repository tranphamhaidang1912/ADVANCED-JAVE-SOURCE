package Teacher;

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
