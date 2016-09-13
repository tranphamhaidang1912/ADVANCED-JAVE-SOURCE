package ObjectStream;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class MainObjectStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> listStudent = new ArrayList<Student>(10);
		listStudent.add(new Student("Dang", 22, 9, 10));
		listStudent.add(new Student("Dien", 22, 8, 9));
		listStudent.add(new Student("Tuan", 22, 7, 8));
		listStudent.add(new Student("Hoa", 22, 6, 7));
		listStudent.add(new Student("Nhut", 22, 5, 6));
		listStudent.add(new Student("Nha", 22, 5, 7));
		listStudent.add(new Student("Thuan", 22, 6, 8));
		listStudent.add(new Student("Quan", 22, 7, 9));
		listStudent.add(new Student("Tien", 22, 8, 10));
		listStudent.add(new Student("Minh", 22, 10, 8));
		
		System.out.println("List of students:");
		listStudent.forEach(student -> student.showInformation());
		System.out.println();
		
		System.out.println("Number of students have age >= 18: " + listStudent.stream().filter(student -> student.getAge() >= 18).count());
		System.out.println("Number of students have first name start 'H': " + listStudent.stream().filter(student -> student.getName().startsWith("H")).count());
		System.out.println("First student have first name start 'H':");
		Student studentFirstNameH = listStudent.stream().filter(student -> student.getName().startsWith("H")).findFirst().get();
		studentFirstNameH.showInformation();
		System.out.println();
		
		DoubleSummaryStatistics stats = listStudent.stream().mapToDouble(student -> student.getAverage())
				.summaryStatistics();
		System.out.println("Max avg mark in list student: " + stats.getMax());
		System.out.println("Min avg mark in list student: " + stats.getMin());
		System.out.println("Sum of all avg marks in list student: " + stats.getSum());
		System.out.println("Average of all avg marks in list student: "
				+ stats.getAverage());
		System.out.println();
		
		System.out.println("List of very good students:");
		listStudent.stream().filter(student -> student.getAverage() >= 8).forEach(student -> student.showInformation());
	}

}
