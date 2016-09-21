package ManageContractClass;

import java.util.Date;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		try {
			// USER INTERFACE
			System.out.println("CLASS LIST");
			for (int i = 0; i < listClass.size(); i++)
				System.out.println((i + 1) + "/ Class " + (i + 1));
			System.out.print("Choose class: ");
			int chooseClass = sc.nextInt();
			System.out.println();

			int choose = 0;
			do {
				System.out.println(
						"1/Show class's information\n2/Add new class\n3/Show subject's information\n4/Add new subject\n5/Show list student's information\n6/Add new student\n7/Attendance\n8/Exit");
				choose = sc.nextInt();
				System.out.println();

				switch (choose) {
				case 1:
					listClass.get(chooseClass - 1).showClassInformation();
					break;
				case 2:
					sc.nextLine();

					System.out.println("Input contract ID: ");
					String contractID = sc.nextLine();
					System.out.println("Input class name: ");
					String name = sc.nextLine();
					System.out.println("Input head teacher: ");
					String headTeacher = sc.nextLine();
					System.out.println("Input start date: ");
					Date startDate = new Date();
					break;
				case 3:
					for (int i = 0; i < listClass.get(chooseClass - 1).listSubject.size(); i++)
						listClass.get(chooseClass - 1).listSubject.get(i).showSubjectInformation();
					break;
				case 4:
					break;
				case 5:
					for (int i = 0; i < listClass.get(chooseClass - 1).listStudent.size(); i++) {
						listClass.get(chooseClass - 1).listStudent.get(i).showStudentInformation();
						System.out.println();
						for (int j = 0; j < listClass.get(chooseClass - 1).listSubject.size(); j++)
							System.out.print(listClass.get(chooseClass - 1).listSubject.get(j).name + "\t");
						System.out.println();
						for (int j = 0; j < listClass.get(chooseClass - 1).listSubject.size(); j++)
							System.out.print(
									String.format("%.2f", listClass.get(chooseClass - 1).listStudent.get(i).listMark
											.get(j).getTotalSubjectMark()) + "\t\t");
						System.out.println("\n");
					}
					break;
				case 6:
					break;
				case 7:
					System.out.println("1/Attendance all class\n2/Attendance one student");
					int chooseAttendance = sc.nextInt();

					switch (chooseAttendance) {
					case 1:
						for (int i = 0; i < listClass.get(chooseClass - 1).listStudent.size(); i++) {
							System.out.println(listClass.get(chooseClass - 1).listStudent.get(i).getFullName());
							int z = 0;
							for (int j = 0; j < listClass.get(chooseClass - 1).listSubject.size(); j++) {
								System.out.println("Attendance for "
										+ listClass.get(chooseClass - 1).listSubject.get(j).getName());

								System.out.println("Input number present day: ");
								listClass.get(chooseClass - 1).listStudent.get(i).listAttendance.get(z)
										.setNumberPresentDay(sc.nextInt());
								System.out.println("Input number absence day: ");
								listClass.get(chooseClass - 1).listStudent.get(i).listAttendance.get(z)
										.setNumberAbsenceDay(sc.nextInt());
								System.out.println("Input number late day: ");
								listClass.get(chooseClass - 1).listStudent.get(i).listAttendance.get(z)
										.setNumberLateDay(sc.nextInt());
								System.out.println("Input number soon day: ");
								listClass.get(chooseClass - 1).listStudent.get(i).listAttendance.get(z)
										.setNumberSoonDay(sc.nextInt());

								int numberPresentDay = listClass.get(chooseClass - 1).listStudent.get(i).listAttendance
										.get(z).getNumberPresentDay();
								int numberAbsenceDay = listClass.get(chooseClass - 1).listStudent.get(i).listAttendance
										.get(z).getNumberAbsenceDay();
								int numberLateDay = listClass.get(chooseClass - 1).listStudent.get(i).listAttendance
										.get(z).getNumberLateDay();
								int numberSoonDay = listClass.get(chooseClass - 1).listStudent.get(i).listAttendance
										.get(z).getNumberSoonDay();
								double attendanceMark = (numberPresentDay * 10 + (numberLateDay + numberSoonDay) * 5)
										/ (numberPresentDay + numberAbsenceDay);
								listClass.get(chooseClass - 1).listStudent.get(i).listMark.get(i)
										.setAttendanceMark(attendanceMark);
								z++;
							}
						}
						break;
					case 2:
						sc.nextLine();

						System.out.println("Input student's name: ");
						String studentName = sc.nextLine();

						for (int i = 0; i < listClass.get(chooseClass - 1).listStudent.size(); i++) {
							if (listClass.get(chooseClass - 1).listStudent.get(i).getFullName()
									.compareToIgnoreCase(studentName) == 0) {
								System.out.println("Attendance for "
										+ listClass.get(chooseClass - 1).listStudent.get(i).getFullName());

								int z = 0;
								for (int j = 0; j < listClass.get(chooseClass - 1).listSubject.size(); j++) {
									System.out.println(listClass.get(chooseClass - 1).listSubject.get(j).getName());

									System.out.println("Input number present day: ");
									listClass.get(chooseClass - 1).listStudent.get(i).listAttendance.get(z)
											.setNumberPresentDay(sc.nextInt());
									System.out.println("Input number absence day: ");
									listClass.get(chooseClass - 1).listStudent.get(i).listAttendance.get(z)
											.setNumberAbsenceDay(sc.nextInt());
									System.out.println("Input number late day: ");
									listClass.get(chooseClass - 1).listStudent.get(i).listAttendance.get(z)
											.setNumberLateDay(sc.nextInt());
									System.out.println("Input number soon day: ");
									listClass.get(chooseClass - 1).listStudent.get(i).listAttendance.get(z)
											.setNumberSoonDay(sc.nextInt());

									int numberPresentDay = listClass.get(chooseClass - 1).listStudent
											.get(i).listAttendance.get(z).getNumberPresentDay();
									int numberAbsenceDay = listClass.get(chooseClass - 1).listStudent
											.get(i).listAttendance.get(z).getNumberAbsenceDay();
									int numberLateDay = listClass.get(chooseClass - 1).listStudent.get(i).listAttendance
											.get(z).getNumberLateDay();
									int numberSoonDay = listClass.get(chooseClass - 1).listStudent.get(i).listAttendance
											.get(z).getNumberSoonDay();
									double attendanceMark = (numberPresentDay * 10
											+ (numberLateDay + numberSoonDay) * 5)
											/ (numberPresentDay + numberAbsenceDay);
									listClass.get(chooseClass - 1).listStudent.get(i).listMark.get(i)
											.setAttendanceMark(attendanceMark);
									z++;
								}
								break;
							} else
								System.out.println("This student do not have in class");
						}
						break;
					default:
						break;
					}
					break;
				default:
					break;
				}
				System.out.println();
			} while (choose != 8);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
*/
	}

}
