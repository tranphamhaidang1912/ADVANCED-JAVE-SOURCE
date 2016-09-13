package MultipleLanguage;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class MainMultipleLanguage {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("1/English\n2/Vietnamese");
			int choose = sc.nextInt();

			System.out.println("\nResource Bundle list:\n");
			String language = "";
			String country = "";
			String path = "";
			switch (choose) {
			case 1:
				language = "en";
				country = "US";
				path = "MultipleLanguage/resource_en_US";
				break;
			case 2:
				language = "vi";
				country = "VN";
				path = "MultipleLanguage/resource_vi_VN";
				break;
			default:
				break;
			}

			Locale currentLocal = new Locale(language, country);
			getResources(path, currentLocal);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

	public static void getResources(String path, Locale currentLocal) {
		ResourceBundle message;
		message = ResourceBundle.getBundle(path, currentLocal);

		List<String> list = new ArrayList<String>();
		Enumeration<String> keys = message.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			String value = message.getString(key);
			list.add(value);
		}

		for (String string : list) {
			System.out.println(string);
		}
	}

}
