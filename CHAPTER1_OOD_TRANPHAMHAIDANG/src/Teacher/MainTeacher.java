package Teacher;

public class MainTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Teacher teacher = Teacher.getIntance();
			System.out.println(teacher.shareDocument());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
