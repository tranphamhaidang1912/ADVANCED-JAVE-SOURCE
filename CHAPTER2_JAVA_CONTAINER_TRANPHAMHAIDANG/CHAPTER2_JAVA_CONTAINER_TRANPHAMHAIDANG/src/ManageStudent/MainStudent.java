package ManageStudent;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

import ManageDictionary.WordEnglish;

public class MainStudent {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, Student> listStudent = new TreeMap<>();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		int choose = 0;
		
		try {
			do {
				System.out.println("1/Show list student\n2/Add new student\n3/Search student\n4/Delete student\n5/Exit");
				choose = sc.nextInt();
				System.out.println();
				
				switch (choose) {
				case 1:
					System.out.println("LIST STUDENT\n");
					if(listStudent.isEmpty() == true)
						System.out.println("List is empty!");
					else {
						Arrays.sort(listStudent.values().toArray());
						for (Object key : listStudent.keySet()) {
							Student student = (Student) listStudent.get(key);
							student.showInformation();
							System.out.println();
						}
					}
					break;
				case 2:
					sc.nextLine();
					System.out.println("INPUT STUDENT'S INFORMATION\n");
					System.out.println("Input id:");
					String id = sc.nextLine();
					System.out.println("Input name:");
					String name = sc.nextLine();
					System.out.println("Input birth date:");
					String birthDate = sc.nextLine();
					System.out.println("Input phone number:");
					String phoneNumber = sc.nextLine();
					System.out.println("Input email:");
					String email = sc.nextLine();
					System.out.println("Input address:");
					String address = sc.nextLine();
				
					listStudent.put(id, new Student(id, name, dateFormat.parse(birthDate), phoneNumber, email, address));
					break;
				case 3:
					sc.nextLine();
					System.out.println("Input student's id:");
					String studentIdSearch = sc.nextLine();
					
					Student student = listStudent.get(studentIdSearch);
					
					if(student != null)
						student.showInformation();
					else
						System.out.println("Student is not found!");
					break;
				case 4:
					sc.nextLine();
					System.out.println("Input student's id:");
					String studentIdDelete = sc.nextLine();
					
					if(listStudent.remove(studentIdDelete) != null)
						System.out.println("Student is deleted!");
						
					else
						System.out.println("Student is not found!");
					break;
				default:
					break;
				}
				System.out.println();
			} while (choose != 5);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
