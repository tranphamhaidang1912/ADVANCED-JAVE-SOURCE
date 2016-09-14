package SummarySchoolYear;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class MainSummarySchoolYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> listStudent = new ArrayList<>();
		readFile(listStudent);
		
		int numOfGrade10Student = 0;
		double avgOfGrade10 = 0;
		
		System.out.println("List students of grade 10:");
		for (Student student : listStudent) {
			if(student.getGrade() == 10)
			{
				student.showInformation();
				numOfGrade10Student++;
				avgOfGrade10 += student.getAvg();
				System.out.println();
			}
		}
		avgOfGrade10 /= numOfGrade10Student;
		
		int numOfGrade11Student = 0;
		double avgOfGrade11 = 0;
		
		System.out.println("List students of grade 11:");
		for (Student student : listStudent) {
			if(student.getGrade() == 11)
			{
				student.showInformation();
				numOfGrade11Student++;
				avgOfGrade11 += student.getAvg();
				System.out.println();
			}
		}
		avgOfGrade11 /= numOfGrade11Student;
		
		int numOfGrade12Student = 0;
		double avgOfGrade12 = 0;
		
		System.out.println("List students of grade 12:");
		for (Student student : listStudent) {
			if(student.getGrade() == 12)
			{
				student.showInformation();
				numOfGrade12Student++;
				avgOfGrade12 += student.getAvg();
				System.out.println();
			}
		}
		avgOfGrade12 /= numOfGrade12Student;
		
		int numOfGoodStudent = 0;
		int numOfHardStudent = 0;
		int numOfMediumStudent = 0;
		int numOfBadStudent = 0;
		
		for (Student student : listStudent) {
			if(student.getAvg() >= 8)
				numOfGoodStudent++;
			else if(student.getAvg() >= 7)
				numOfHardStudent++;
			else if(student.getAvg() >= 5)
				numOfMediumStudent++;
			else
				numOfBadStudent++;
		}
		
		System.out.println("Number of good students: " + numOfGoodStudent);
		System.out.println("Number of hard students: " + numOfHardStudent);
		System.out.println("Number of medium students: " + numOfMediumStudent);
		System.out.println("Number of bad students: " + numOfBadStudent);
		System.out.println();
		
		System.out.println("Number of grade 10 students: " + numOfGrade10Student);
		System.out.println("Average of grade 10: " + String.format("%.2f", avgOfGrade10));
		System.out.println();
		
		System.out.println("Number of grade 11 students: " + numOfGrade11Student);
		System.out.println("Average of grade 11: " + String.format("%.2f", avgOfGrade11));
		System.out.println();
		
		System.out.println("Number of grade 12 students: " + numOfGrade12Student);
		System.out.println("Average of grade 12: " + String.format("%.2f", avgOfGrade12));
		System.out.println();
	}

	public static void readFile(List<Student> listStudent) {

		String name = "";
		int grade = 0;
		double semester1 = 0;
		double semester2 = 0;
		
		try (DataInputStream in = new DataInputStream(new BufferedInputStream(
				new FileInputStream("src/SummarySchoolYear/tongketnamhoc.txt")))) {

			while (true) {
				name = in.readUTF();
				grade = in.readInt();
				semester1 = in.readDouble();
				semester2 = in.readDouble();
				
				listStudent.add(new Student(name, grade, semester1, semester2));
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}
}
