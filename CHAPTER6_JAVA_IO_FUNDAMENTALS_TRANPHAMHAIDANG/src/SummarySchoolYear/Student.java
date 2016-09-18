package SummarySchoolYear;

import java.text.DecimalFormat;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 16-Sep-2016
 * Class for Student
 */
public class Student {

	private String name;
	private int grade;
	private double semester1;
	private double semester2;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getSemester1() {
		return semester1;
	}

	public void setSemester1(double semester1) {
		this.semester1 = semester1;
	}

	public double getSemester2() {
		return semester2;
	}

	public void setSemester2(double semester2) {
		this.semester2 = semester2;
	}

	public Student(String name, int grade, double semester1, double semester2) {
		super();
		this.name = name;
		this.grade = grade;
		this.semester1 = semester1;
		this.semester2 = semester2;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Calculate average of semester 1 and semester 2
	public double getAvg() {
		double avg = (semester1 + (semester2 * 2)) / 3;
		DecimalFormat df = new DecimalFormat("###.##");
		avg = Double.parseDouble(df.format(avg));
		
		return avg;
	}
	
	//Show student's information
	public void showInformation() {
		System.out.println("Name: " + name);
		System.out.println("Grade: " + grade);
		System.out.println("Semester 1: " + semester1);
		System.out.println("Semester 2: " + semester2);
		System.out.println("Average: " + getAvg());
	}
}
