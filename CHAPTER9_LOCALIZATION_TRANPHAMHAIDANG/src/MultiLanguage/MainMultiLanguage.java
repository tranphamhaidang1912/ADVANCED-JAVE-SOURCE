package MultiLanguage;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class MainMultiLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String language = "en";
		String country = "US";
		Locale currentLocal = new Locale(language, country);
		
		ResourceBundle message;
		message = ResourceBundle.getBundle("MultiLanguage/resource_en_US", currentLocal);
		
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
