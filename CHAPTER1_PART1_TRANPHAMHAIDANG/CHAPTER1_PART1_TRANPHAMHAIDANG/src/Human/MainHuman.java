package Human;

import java.util.Scanner;

public class MainHuman {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Teacher[] teacher = new Teacher[100];
			Student[] student = new Student[100];
			String choose = "";
			int numberOfTeacher = 0;
			int numberOfStudent = 0;
			do {
				System.out.println("Input information of Human");
				System.out.println("Input full name:");
				String fullName = sc.nextLine();
				System.out.println("Input birth date:");
				String birthDate = sc.nextLine();
				System.out.println("Input address:");
				String address = sc.nextLine();
				System.out.println("Input phone number");
				String phoneNumber = sc.nextLine();
				
				System.out.println("1/Teacher\n2/Student");
				choose = sc.nextLine();
				if(choose.compareTo("1") == 0)
				{
					System.out.println("Input head class:");
					String headClass = sc.nextLine();
					System.out.println("Input wage:");
					double wage = sc.nextDouble();
					System.out.println("Input allowance:");
					double allowance = sc.nextDouble();
					teacher[numberOfTeacher] = new Teacher(fullName, birthDate, address, phoneNumber, headClass, wage, allowance);
					numberOfTeacher++;
				}
				else if(choose.compareTo("2") == 0)
				{
					System.out.println("Class:");
					String studentOfClass = sc.nextLine();
					System.out.println("Input semester 1 score:");
					double semesterScore1 = sc.nextDouble();
					System.out.println("Input semester 2 score:");
					double semesterScore2 = sc.nextDouble();
					student[numberOfStudent] = new Student(fullName, birthDate, address, phoneNumber, studentOfClass, semesterScore1, semesterScore2);
					numberOfStudent++;
				}
				else
				{
					System.out.println("Please just choose (1) or (2)");
					continue;
				}
				
				choose = sc.nextLine();
				System.out.println("Do you want to add more computer? (y / n)");
				choose = sc.nextLine();
			} while (choose.compareTo("y") == 0);	
			
			System.out.println("List of Teacher");
			for (int i = 0; i < numberOfTeacher; i++)
				teacher[i].showInformationHuman();
			
			System.out.println("List of Student");
			for (int i = 0; i < numberOfStudent; i++)
				student[i].showInformationHuman();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
