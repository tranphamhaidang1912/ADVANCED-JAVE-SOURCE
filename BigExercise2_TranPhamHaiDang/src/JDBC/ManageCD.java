package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.mysql.cj.api.jdbc.Statement;
import com.mysql.cj.jdbc.PreparedStatement;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 19-Sep-2016 Class for Manage CD
 */
public class ManageCD {

	private static Scanner sc = new Scanner(System.in);
	private static Database db = new Database();

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		// TODO Auto-generated method stub

		List<CD> listCD = new ArrayList<CD>();

		String chooseContinue;
		int chooseFunction;

		try {
			do {
				System.out.println("------MANAGE CD------");
				System.out
						.println("1/Show list CD\n2/Add new CD\n3/Search CD\n4/Update CD\n5/Delete CD");
				System.out.print("Choose: ");
				chooseFunction = sc.nextInt();
				System.out.println();

				switch (chooseFunction) {
				case 1:
					showListCD(listCD);
					sc.nextLine();
					break;
				case 2:
					sc.nextLine();
					addCD(listCD);
					break;
				case 3:
					searchCD(listCD);
					break;
				case 4:
					updateCD(listCD);
					break;
				case 5:
					deleteCD(listCD);
					break;
				default:
					break;
				}
				System.out.println();
				System.out.println("Do you want to continue? (y / n)");
				System.out.print("Choose: ");
				chooseContinue = sc.nextLine();
				System.out.println();

			} while (chooseContinue.compareToIgnoreCase("y") == 0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

	//Load database
	public static void loadDatabase(List<CD> listCD)
			throws ClassNotFoundException, SQLException {
		try (Connection conn = db.connect()) {
			String sql = "SELECT * FROM cd";
			Statement statement = (Statement) conn.createStatement();
			ResultSet resultset = statement.executeQuery(sql);
			listCD.clear();
			while (resultset.next()) {
				CD cd = new CD();

				cd.setId(resultset.getInt("id"));
				cd.setName(resultset.getString("name"));
				cd.setSinger(resultset.getString("singer"));
				cd.setNumberSongs(resultset.getInt("numbersongs"));
				cd.setPrice(resultset.getDouble("price"));

				listCD.add(cd);
			}
		}
	}

	//Show list CD
	public static void showListCD(List<CD> listCD) throws ClassNotFoundException, SQLException {
		loadDatabase(listCD);
		
		System.out.println("LIST CD\n");
		if (listCD.isEmpty() == true)
			System.out.println("List CD is empty!");
		else {
			for (CD cd : listCD) {
				cd.showInformation();
				System.out.println();
			}
		}
	}

	//Add new CD
	public static void addCD(List<CD> listCD) throws ClassNotFoundException,
			SQLException {

		System.out.println("INPUT CD'S INFORMATION\n");
		System.out.println("Input name:");
		String name = sc.nextLine();
		System.out.println("Input singer:");
		String singer = sc.nextLine();
		System.out.println("Input number of songs:");
		int numberSongs = sc.nextInt();
		System.out.println("Input price:");
		double price = sc.nextDouble();
		sc.nextLine();
		System.out.println();

		CD cd = new CD(name, singer, numberSongs, price);
		
		try (Connection conn = db.connect()) {
			String sql = "INSERT INTO cd VALUES(NULL, '" + cd.getName()
					+ "', '" + cd.getSinger() + "', '" + cd.getNumberSongs()
					+ "', '" + cd.getPrice() + "')";

			PreparedStatement statement = (PreparedStatement) conn
					.prepareStatement(sql);
			statement.execute();
		}
	}

	//Search CD
	public static void searchCD(List<CD> listCD) {
		sc.nextLine();
		System.out.println("Input CD's name:");
		String nameSearch = sc.nextLine();

		boolean flag = false;
		for (CD cd : listCD) {
			if (cd.getName().compareToIgnoreCase(nameSearch) == 0) {
				cd.showInformation();
				System.out.println();
				flag = true;
			}
		}

		if (flag == false)
			System.out.println("CD is not found!");
	}

	//Update CD
	public static void updateCD(List<CD> listCD) throws ClassNotFoundException,
			SQLException {
		showListCD(listCD);

		sc.nextLine();
		System.out.println("Input CD's name:");
		String nameUpdate = sc.nextLine();
		System.out.println("Update number of songs:");
		int numOfSongs = sc.nextInt();
		System.out.println("Update price:");
		double price = sc.nextDouble();
		sc.nextLine();

		boolean flag = false;
		for (CD cd : listCD) {
			if (cd.getName().compareToIgnoreCase(nameUpdate) == 0) {
				cd.setNumberSongs(numOfSongs);
				cd.setPrice(price);
				flag = true;
				
				try (Connection conn = db.connect()) {
					String sql = "UPDATE CD SET numbersongs = "
							+ cd.getNumberSongs() + ", price = "
							+ cd.getPrice() + " WHERE id = '" + cd.getId() + "'";

					PreparedStatement statement = (PreparedStatement) conn
							.prepareStatement(sql);
					statement.execute();

					System.out.println("CD is saved!");
				}
			}
		}

		if (flag == false)
			System.out.println("CD is not found!");
	}

	//Delete CD
	public static void deleteCD(List<CD> listCD) throws ClassNotFoundException, SQLException {
		showListCD(listCD);

		sc.nextLine();
		System.out.println("Input CD's name:");
		String nameDelete = sc.nextLine();

		System.out.println("Do you want to delete this contact? (y / n)");
		System.out.print("Choose: ");
		String chooseDelete = sc.nextLine();
		System.out.println();

		if (chooseDelete.compareToIgnoreCase("y") == 0) { 
			if (listCD.remove(new CD(nameDelete))) {
				try (Connection conn = db.connect()) {
					String sqlGetAllCD = "SELECT * FROM cd";
					Statement statement= (Statement) conn.createStatement();
					ResultSet resultset = statement.executeQuery(sqlGetAllCD);
					
					CD cd = new CD();
					while (resultset.next()) {
						cd.setName(resultset.getString("name"));
						if(cd.getName().compareToIgnoreCase(nameDelete) == 0)
						{
							cd.setId(resultset.getInt("id"));
							break;
						}
					}
					
					String sql = "DELETE FROM CD WHERE id = '" + cd.getId() + "'";

					PreparedStatement preparedStatement = (PreparedStatement) conn
							.prepareStatement(sql);
					preparedStatement.execute();

					System.out.println("CD is deleted!");
				}
			}

			else
				System.out.println("CD is not found!");
		}
	}
}
