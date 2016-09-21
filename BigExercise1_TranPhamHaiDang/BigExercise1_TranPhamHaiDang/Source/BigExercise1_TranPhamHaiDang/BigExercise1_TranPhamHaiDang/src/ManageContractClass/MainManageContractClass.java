package ManageContractClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MainManageContractClass {

	private static Scanner sc = new Scanner(System.in);
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		// PREPARE DATABASE
		List<Class> listClass = new ArrayList<Class>();
		createDatabase(listClass);

		// USER INTERFACE
		int chooseClass = 0;
		do {
			System.out.println("LIST CLASS:");
			for (int i = 0; i < listClass.size(); i++)
				System.out.println((i + 1) + "/ " + listClass.get(i).getClassName());
			System.out.print("Choose class: ");
			chooseClass = sc.nextInt();
			System.out.println();

			int chooseFunction = 0;
			do {
				System.out.println(
						"1/ Show class's information\n2/ Show list subject\n3/ Add new subject\n4/ Show list student\n5/ Add new student\n6/ Attendance & type mark for student\n7/ Show list teacher\n8/ Add new teacher\n9/ Exit");
				System.out.print("Choose function: ");
				chooseFunction = sc.nextInt();
				System.out.println();

				switch (chooseFunction) {
				case 1:
					System.out.println("CLASS'S INFORMATION:");
					listClass.get(chooseClass - 1).showClassInformation();
					System.out.println();
					break;
				case 2:
					System.out.println("LIST SUBJECT:");
					for (Subject subject : listClass.get(chooseClass - 1).listSubject) {
						subject.showSubjectInformation();

						System.out.println();
					}
					break;
				case 3:
					sc.nextLine();
					System.out.println("INPUT SUBJECT'S INFORMATION:");
					System.out.println("Input subject's name:");
					String subjectName = sc.nextLine();
					System.out.println("Input subject's teacher:");
					String subjectTeacher = sc.nextLine();
					System.out.println("Input number session:");
					int numberSession = sc.nextInt();
					sc.nextLine();
					System.out.println("Input start date:");
					String startDate = sc.nextLine();
					System.out.println("Input end date:");
					String endDate = sc.nextLine();

					listClass.get(chooseClass - 1).listSubject.add(new Subject(subjectName, subjectTeacher,
							numberSession, dateFormat.parse(startDate), dateFormat.parse(endDate)));
					break;
				case 4:
					System.out.println("LIST STUDENT:");
					for (Student student : listClass.get(chooseClass - 1).listStudent) {
						student.showStudentInformation();
						System.out.println("SUBJECT SUMMARY:");
						for (Subject subject : listClass.get(chooseClass - 1).listSubject) {
							System.out.println("Subject name: " + subject.getSubjectName());
							for (Mark mark : student.listMark) {
								if (mark.getSubjectName().compareToIgnoreCase(subject.getSubjectName()) == 0) {
									System.out.println("Average exercise mark: "
											+ String.format("%.2f", mark.getAverageExerciseMark()));
									System.out.println("Average positive mark: "
											+ String.format("%.2f", mark.getAveragePositiveMark()));
									System.out.println("Average attendance mark: "
											+ String.format("%.2f", mark.getAverageAttendanceMark()));
									System.out.println("Average personal mark: "
											+ String.format("%.2f", mark.getAveragePersonalMark()));
									System.out.println("Multiplechoice mark: "
											+ String.format("%.2f", mark.getMultipleChoiceMark()));
									System.out.println("Essay mark: " + String.format("%.2f", mark.getEssayMark()));
									System.out.println("Average mark: " + String.format("%.2f", mark.getAverageMark()));
									break;
								}
							}
							System.out.println();
						}
						System.out.println();
					}
					break;
				case 5:
					sc.nextLine();
					System.out.println("INPUT STUDENT'S INFORMATION:");
					System.out.println("Input student's full name:");
					String studentFullName = sc.nextLine();
					System.out.println("Input student's phone number:");
					String studentPhoneNumber = sc.nextLine();
					System.out.println("Input student's email:");
					String studentEmail = sc.nextLine();
					System.out.println("Input student's birth date:");
					String birthDate = sc.nextLine();

					listClass.get(chooseClass - 1).listStudent.add(new Student(studentFullName, studentPhoneNumber,
							studentEmail, dateFormat.parse(birthDate)));
					break;
				case 6:
					System.out.println("LIST STUDENT:");
					for (Student student : listClass.get(chooseClass - 1).listStudent) {
						System.out.println(student.getFullName());
					}
					System.out.println();

					sc.nextLine();
					System.out.println("Input student's full name need to attendance:");
					String studentFullNameSearch = sc.nextLine();
					System.out.println();

					for (Subject subject : listClass.get(chooseClass - 1).listSubject) {
						System.out.println(subject.getSubjectName());
					}
					System.out.println();

					System.out.println("Input subject's name need to attendance:");
					String subjectNameSearch = sc.nextLine();

					int numberAttendanceDay = 0;
					for (Subject subject : listClass.get(chooseClass - 1).listSubject) {
						if (subject.getSubjectName().compareToIgnoreCase(subjectNameSearch) == 0) {
							numberAttendanceDay = subject.numberSession / 8;
							break;
						}
					}

					for (int i = 1; i <= numberAttendanceDay; i++) {
						String answer = "";
						double exerciseMark = 0;
						double positiveMark = 0;
						System.out.println("Attendance day " + i + ":");
						
						System.out.println("Present morning? (yes / no)");
						answer = sc.nextLine();
						setAttendancePerDay(listClass, chooseClass, (i - 1), studentFullNameSearch, subjectNameSearch, answer, 1);
						System.out.println("Absence morning? (yes / no)");
						answer = sc.nextLine();
						setAttendancePerDay(listClass, chooseClass, (i - 1), studentFullNameSearch, subjectNameSearch, answer, 2);
						System.out.println("Late morning? (yes / no)");
						answer = sc.nextLine();
						setAttendancePerDay(listClass, chooseClass, (i - 1), studentFullNameSearch, subjectNameSearch, answer, 3);
						System.out.println("Early morning? (yes / no)");
						answer = sc.nextLine();
						setAttendancePerDay(listClass, chooseClass, (i - 1), studentFullNameSearch, subjectNameSearch, answer, 4);
						
						System.out.println("Present afternoon? (yes / no)");
						answer = sc.nextLine();
						setAttendancePerDay(listClass, chooseClass, (i - 1), studentFullNameSearch, subjectNameSearch, answer, 5);
						System.out.println("Absence afternoon? (yes / no)");
						answer = sc.nextLine();
						setAttendancePerDay(listClass, chooseClass, (i - 1), studentFullNameSearch, subjectNameSearch, answer, 6);
						System.out.println("Late afternoon? (yes / no)");
						answer = sc.nextLine();
						setAttendancePerDay(listClass, chooseClass, (i - 1), studentFullNameSearch, subjectNameSearch, answer, 7);
						System.out.println("Early afternoon? (yes / no)");
						answer = sc.nextLine();
						setAttendancePerDay(listClass, chooseClass, (i - 1), studentFullNameSearch, subjectNameSearch, answer, 8);
						
						System.out.println("Input exercise mark:");
						exerciseMark = sc.nextDouble();
						System.out.println("Input positive mark:");
						positiveMark = sc.nextDouble();
						sc.nextLine();
						
						setMarkPerDay(listClass, chooseClass, (i - 1), studentFullNameSearch, subjectNameSearch, exerciseMark, positiveMark);
					}
					
					System.out.println("Input multiple choice mark:");
					double multipleChoiceMark = sc.nextDouble();
					System.out.println("Input essay mark:");
					double essayMark = sc.nextDouble();
					
					setMarkFinal(listClass, chooseClass, studentFullNameSearch, subjectNameSearch, multipleChoiceMark, essayMark);
					
					System.out.println();
					break;
				case 7:
					System.out.println("LIST TEACHER:");
					for (Teacher teacher : listClass.get(chooseClass - 1).listTeacher) {
						teacher.showTeacherInformation();
						System.out.println();
					}
					break;
				case 8:
					sc.nextLine();
					System.out.println("INPUT TEACHER'S INFORMATION:");
					System.out.println("Input teacher's full name:");
					String teacherFullName = sc.nextLine();
					System.out.println("Input teacher's phone number:");
					String teacherPhoneNumber = sc.nextLine();
					System.out.println("Input teacher's email:");
					String teacherEmail = sc.nextLine();
					System.out.println("Input teacher's list teaching subject:");
					String teachingSubject = sc.nextLine();

					String[] temp = teachingSubject.split(",");
					List<String> listTeachingSubject = new ArrayList<>();
					for (int i = 0; i < temp.length; i++) {
						listTeachingSubject.add(temp[i]);
					}

					listClass.get(chooseClass - 1).listTeacher
							.add(new Teacher(teacherFullName, teacherPhoneNumber, teacherEmail, listTeachingSubject));
					break;
				default:
					break;
				}
			} while (chooseFunction != 9);

		} while (chooseClass != (listClass.size() - 1));

	}

	// Create database
	public static void createDatabase(List<Class> listClass) throws ParseException {

		// Create class 1
		listClass.add(new Class("1", "GCS - TRA", "Khuc Thuy Phuong", dateFormat.parse("1/1/2016"),
				dateFormat.parse("1/2/2016"), 48));

		// Create subjects for class 1
		listClass.get(0).listSubject.add(new Subject("Advance Java", "Khuc Thuy Phuong", 32,
				dateFormat.parse("1/1/2016"), dateFormat.parse("21/1/2016")));
		listClass.get(0).listSubject.add(new Subject("Soft Skill", "Nguyen Thi Hanh", 16, dateFormat.parse("22/1/2016"),
				dateFormat.parse("1/2/2016")));

		// Create students for class 1
		listClass.get(0).listStudent.add(new Student("Tran Pham Hai Dang", "01658261080",
				"tranphamhaidang1912@gmail.com", dateFormat.parse("19/12/1994")));
		listClass.get(0).listStudent.add(new Student("Bui Truong Minh Tuan", "01658123456",
				"buitruongminhtuan@gmail.com", dateFormat.parse("5/6/1994")));
		listClass.get(0).listStudent.add(
				new Student("Huynh Tan Hoa", "01123456789", "huynhtanhoa@gmail.com", dateFormat.parse("7/8/1994")));

		// Create mark for each student in class 1
		List<Attendance> listAttendance = new ArrayList<Attendance>();
		listAttendance.add(new Attendance());
		listAttendance.add(new Attendance());
		listAttendance.add(new Attendance());
		listAttendance.add(new Attendance());

		List<Double> listExerciseMark = new ArrayList<>();
		listExerciseMark.add(new Double(10));
		listExerciseMark.add(new Double(10));
		listExerciseMark.add(new Double(10));
		listExerciseMark.add(new Double(10));

		List<Double> listPositiveMark = new ArrayList<>();
		listPositiveMark.add(new Double(9));
		listPositiveMark.add(new Double(9));
		listPositiveMark.add(new Double(9));
		listPositiveMark.add(new Double(9));

		listClass.get(0).listStudent.get(0).listMark
				.add(new Mark("Advance Java", listAttendance, listExerciseMark, listPositiveMark, 9, 10));
		listClass.get(0).listStudent.get(1).listMark
				.add(new Mark("Advance Java", listAttendance, listExerciseMark, listPositiveMark, 8, 9));
		listClass.get(0).listStudent.get(2).listMark
				.add(new Mark("Advance Java", listAttendance, listExerciseMark, listPositiveMark, 7, 8));

		listAttendance = new ArrayList<Attendance>();
		listAttendance.add(new Attendance());
		listAttendance.add(new Attendance());
		listAttendance.add(new Attendance());
		listAttendance.add(new Attendance());

		listExerciseMark = new ArrayList<>();
		listExerciseMark.add(new Double(9));
		listExerciseMark.add(new Double(9));
		listExerciseMark.add(new Double(9));
		listExerciseMark.add(new Double(9));

		listPositiveMark = new ArrayList<>();
		listPositiveMark.add(new Double(10));
		listPositiveMark.add(new Double(10));
		listPositiveMark.add(new Double(10));
		listPositiveMark.add(new Double(10));

		listClass.get(0).listStudent.get(0).listMark
				.add(new Mark("Soft Skill", listAttendance, listExerciseMark, listPositiveMark, 10, 9));
		listClass.get(0).listStudent.get(1).listMark
				.add(new Mark("Soft Skill", listAttendance, listExerciseMark, listPositiveMark, 9, 8));
		listClass.get(0).listStudent.get(2).listMark
				.add(new Mark("Soft Skill", listAttendance, listExerciseMark, listPositiveMark, 8, 7));

		// Create teachers for class 1
		List<String> listTeachingSubject = new ArrayList<>();
		listTeachingSubject.add("Advance Java");
		listTeachingSubject.add("Analyze & Design UML");

		listClass.get(0).listTeacher
				.add(new Teacher("Khuc Thuy Phuong", "01222334455", "ktphuong@gmail.com", listTeachingSubject));

		listTeachingSubject = new ArrayList<>();
		listTeachingSubject.add("Soft Skill");

		listClass.get(0).listTeacher
				.add(new Teacher("Nguyen Thi Hanh", "01266778899", "nthanh@gmail.com", listTeachingSubject));

		// Create class 2
		listClass.add(new Class("2", "HCMUS", "Nguyen Thi Hanh", dateFormat.parse("3/3/2016"),
				dateFormat.parse("3/4/2016"), 48));

		// Create subjects for class 2
		listClass.get(1).listSubject.add(new Subject("Analyze & Design UML", "Khuc Thuy Phuong", 32,
				dateFormat.parse("3/3/2016"), dateFormat.parse("24/3/2016")));
		listClass.get(1).listSubject.add(new Subject("Writing Skill", "Pham Ngoc Quynh Nhu", 16,
				dateFormat.parse("25/3/2016"), dateFormat.parse("3/4/2016")));

		// Create students for class 2
		listClass.get(1).listStudent.add(new Student("Tran Pham Hai Dang", "01658261080",
				"tranphamhaidang1912@gmail.com", dateFormat.parse("19/12/1994")));
		listClass.get(1).listStudent.add(new Student("Bui Truong Minh Tuan", "01658123456",
				"buitruongminhtuan@gmail.com", dateFormat.parse("5/6/1994")));
		listClass.get(1).listStudent.add(
				new Student("Huynh Tan Hoa", "01123456789", "huynhtanhoa@gmail.com", dateFormat.parse("7/8/1994")));

		// Create mark for each student in class 2
		listAttendance = new ArrayList<Attendance>();
		listAttendance.add(new Attendance());
		listAttendance.add(new Attendance());
		listAttendance.add(new Attendance());
		listAttendance.add(new Attendance());

		listExerciseMark = new ArrayList<>();
		listExerciseMark.add(new Double(7));
		listExerciseMark.add(new Double(7));
		listExerciseMark.add(new Double(7));
		listExerciseMark.add(new Double(7));

		listPositiveMark = new ArrayList<>();
		listPositiveMark.add(new Double(8));
		listPositiveMark.add(new Double(8));
		listPositiveMark.add(new Double(8));
		listPositiveMark.add(new Double(8));

		listClass.get(1).listStudent.get(0).listMark
				.add(new Mark("Analyze & Design UML", listAttendance, listExerciseMark, listPositiveMark, 8, 7));
		listClass.get(1).listStudent.get(1).listMark
				.add(new Mark("Analyze & Design UML", listAttendance, listExerciseMark, listPositiveMark, 7, 6));
		listClass.get(1).listStudent.get(2).listMark
				.add(new Mark("Analyze & Design UML", listAttendance, listExerciseMark, listPositiveMark, 6, 5));

		listAttendance = new ArrayList<Attendance>();
		listAttendance.add(new Attendance());
		listAttendance.add(new Attendance());
		listAttendance.add(new Attendance());
		listAttendance.add(new Attendance());

		listExerciseMark = new ArrayList<>();
		listExerciseMark.add(new Double(8));
		listExerciseMark.add(new Double(8));
		listExerciseMark.add(new Double(8));
		listExerciseMark.add(new Double(8));

		listPositiveMark = new ArrayList<>();
		listPositiveMark.add(new Double(7));
		listPositiveMark.add(new Double(7));
		listPositiveMark.add(new Double(7));
		listPositiveMark.add(new Double(7));

		listClass.get(1).listStudent.get(0).listMark
				.add(new Mark("Writing Skill", listAttendance, listExerciseMark, listPositiveMark, 7, 8));
		listClass.get(1).listStudent.get(1).listMark
				.add(new Mark("Writing Skill", listAttendance, listExerciseMark, listPositiveMark, 8, 9));
		listClass.get(1).listStudent.get(2).listMark
				.add(new Mark("Writing Skill", listAttendance, listExerciseMark, listPositiveMark, 9, 10));

		// Create teachers for class 2
		listTeachingSubject = new ArrayList<>();
		listTeachingSubject.add("Advance Java");
		listTeachingSubject.add("Analyze & Design UML");

		listClass.get(1).listTeacher
				.add(new Teacher("Khuc Thuy Phuong", "01222334455", "ktphuong@gmail.com", listTeachingSubject));

		listTeachingSubject = new ArrayList<>();
		listTeachingSubject.add("Writing Skill");

		listClass.get(1).listTeacher
				.add(new Teacher("Pham Ngoc Quynh Nhu", "01200112233", "pnqnhu@gmail.com", listTeachingSubject));
	}

	//Set attendance per day
	public static void setAttendancePerDay(List<Class> listClass, int chooseClass, int index, String studentFullNameSearch,
			String subjectNameSearch, String answer, int flag) {
		for (Student student : listClass.get(chooseClass - 1).listStudent) {
			if (student.getFullName().compareToIgnoreCase(studentFullNameSearch) == 0) {
				for (Mark mark : student.listMark) {
					if (mark.getSubjectName().compareToIgnoreCase(subjectNameSearch) == 0) {
						if (answer.compareToIgnoreCase("yes") == 0) {
							if (flag == 1)
								mark.listAttendance.get(index).setPresentMorning(true);
							else if (flag == 2)
								mark.listAttendance.get(index).setAbsenceMorning(true);
							else if (flag == 3)
								mark.listAttendance.get(index).setLateMorning(true);
							else if (flag == 4)
								mark.listAttendance.get(index).setEarlyMorning(true);
							else if (flag == 5)
								mark.listAttendance.get(index).setPresentAfternoon(true);
							else if (flag == 6)
								mark.listAttendance.get(index).setAbsenceAfternoon(true);
							else if (flag == 7)
								mark.listAttendance.get(index).setLateAfternoon(true);
							else
								mark.listAttendance.get(index).setEarlyAfternoon(true);
						} else {
							if (flag == 1)
								mark.listAttendance.get(index).setPresentMorning(false);
							else if (flag == 2)
								mark.listAttendance.get(index).setAbsenceMorning(false);
							else if (flag == 3)
								mark.listAttendance.get(index).setLateMorning(false);
							else if (flag == 4)
								mark.listAttendance.get(index).setEarlyMorning(false);
							else if (flag == 5)
								mark.listAttendance.get(index).setPresentAfternoon(false);
							else if (flag == 6)
								mark.listAttendance.get(index).setAbsenceAfternoon(false);
							else if (flag == 7)
								mark.listAttendance.get(index).setLateAfternoon(false);
							else
								mark.listAttendance.get(index).setEarlyAfternoon(false);
						}
					}
				}
			}
		}
	}
	
	//Set mark per day
	public static void setMarkPerDay(List<Class> listClass, int chooseClass, int index, String studentFullNameSearch,
			String subjectNameSearch, double exerciseMark, double positiveMark) {
		for (Student student : listClass.get(chooseClass - 1).listStudent) {
			if (student.getFullName().compareToIgnoreCase(studentFullNameSearch) == 0) {
				for (Mark mark : student.listMark) {
					if (mark.getSubjectName().compareToIgnoreCase(subjectNameSearch) == 0)
						mark.listExerciseMark.set(index, exerciseMark);
						mark.listPositiveMark.set(index, positiveMark);
				}
			}
		}
	}
	
	//Set mark final
	public static void setMarkFinal(List<Class> listClass, int chooseClass, String studentFullNameSearch,
			String subjectNameSearch, double multipleChoiceMark, double essayMark) {
		for (Student student : listClass.get(chooseClass - 1).listStudent) {
			if (student.getFullName().compareToIgnoreCase(studentFullNameSearch) == 0) {
				for (Mark mark : student.listMark) {
					if (mark.getSubjectName().compareToIgnoreCase(subjectNameSearch) == 0)
						mark.setMultipleChoiceMark(multipleChoiceMark);
						mark.setEssayMark(essayMark);
				}
			}
		}
	}
	
}
