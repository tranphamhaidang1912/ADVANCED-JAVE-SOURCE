package ObjectStream;

public class Student extends Person {

	private double mark1;
	private double mark2;

	public double getMark1() {
		return mark1;
	}

	public void setMark1(double mark1) {
		this.mark1 = mark1;
	}

	public double getMark2() {
		return mark2;
	}

	public void setMark2(double mark2) {
		this.mark2 = mark2;
	}

	public Student(String name, int age, double mark1, double mark2) {
		super(name, age);
		this.mark1 = mark1;
		this.mark2 = mark2;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	//Calculate average
	public double getAverage() {
		return (mark1 + mark2) / 2;
	}
	
	//Show student's information
	public void showInformation() {
		System.out.println(name + "\t age = " + age + "\t mark 1 = " + mark1 + " & mark 2 = " + mark2 + "\t avg = " + getAverage());
	}
}
