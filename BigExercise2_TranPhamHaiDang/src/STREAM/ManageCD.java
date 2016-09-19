package STREAM;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import JDBC.CD;

import com.mysql.cj.api.jdbc.Statement;

public class ManageCD {

	private static Database db = new Database();
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		List<CD> listCD = new ArrayList<CD>();
		//loadDatabase(listCD);
		
		String path = "src/STREAM/cd.txt";
		//outputFile(path, listCD);
		readFile(path, listCD);
		
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

	public static void loadDatabase(List<CD> listCD)
			throws ClassNotFoundException, SQLException {
		try (Connection conn = db.connect()) {
			String sql = "SELECT * FROM cd";
			Statement statement = (Statement) conn.createStatement();
			ResultSet resultset = statement.executeQuery(sql);

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
	
	public static void readFile(String path, List<CD> listCD) {

		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path)))) {

			while (true) {
				CD cd = (CD) in.readObject();
				listCD.add(cd);
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

	public static void outputFile(String path, List<CD> listCD) throws FileNotFoundException, IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path));
		for (CD cd : listCD) {
			out.writeObject(cd);
		}
		out.close();
	}
}
