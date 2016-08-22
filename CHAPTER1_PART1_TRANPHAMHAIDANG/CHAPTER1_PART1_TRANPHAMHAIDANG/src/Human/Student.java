package Human;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * Class for Student
 */
public class Student extends Human {

	String studentOfClass;
	double semesterScore1;
	double semesterScore2;
	
	public String getStudentOfClass() {
		return studentOfClass;
	}

	public void setStudentOfClass(String studentOfClass) {
		this.studentOfClass = studentOfClass;
	}

	public double getSemesterScore1() {
		return semesterScore1;
	}

	public void setSemesterScore1(double semesterScore1) {
		this.semesterScore1 = semesterScore1;
	}

	public double getSemesterScore2() {
		return semesterScore2;
	}

	public void setSemesterScore2(double semesterScore2) {
		this.semesterScore2 = semesterScore2;
	}
	
	public Student(String fullName, String birthDate, String address,
			String phoneNumber, String studentOfClass, double semesterScore1,
			double semesterScore2) {
		super(fullName, birthDate, address, phoneNumber);
		this.studentOfClass = studentOfClass;
		this.semesterScore1 = semesterScore1;
		this.semesterScore2 = semesterScore2;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String fullName, String birthDate, String address,
			String phoneNumber) {
		super(fullName, birthDate, address, phoneNumber);
		// TODO Auto-generated constructor stub
	}

	//calculate the average score of semester 1 and semester 2
	public double getAverageScore() {
		return (semesterScore1 + semesterScore2) / 2;
	}

	@Override
	public void showInformationHuman() {
		// TODO Auto-generated method stub
		super.showInformationHuman();
		System.out.println("Semester 1 score: " + semesterScore1);
		System.out.println("Semester 2 score: " + semesterScore2);
		System.out.println("Average score: " + getAverageScore());
	}
	
	
}
