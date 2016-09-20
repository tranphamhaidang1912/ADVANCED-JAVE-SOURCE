package LAMBDA;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 19-Sep-2016 Class for Sort String
 */
public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> listString = Arrays.asList("yeu lai tu dau",
				"nang am xa dan", "nhu phut ban dau", "lam vo anh nhe",
				"sau tat ca");

		System.out.println("List after sort short to long:");
		sortShortToLong(listString);
		showListString(listString);
		System.out.println();

		System.out.println("List after sort long to short:");
		sortLongToShort(listString);
		showListString(listString);
		System.out.println();
		
		System.out.println("List after sort alphabet:");
		sortAlphabet(listString);
		showListString(listString);
		System.out.println();
	}

	//Comparator sort short to long
	public static void sortShortToLong(List<String> listString) {
		Comparator<String> sortShortToLong = (String s1, String s2) -> Integer
				.valueOf(s1.length()).compareTo(Integer.valueOf(s2.length()));

		listString.sort(sortShortToLong);
	}

	//Comparator sort long to short
	public static void sortLongToShort(List<String> listString) {
		Comparator<String> sortLongToShort = (String s1, String s2) -> Integer
				.valueOf(s2.length()).compareTo(Integer.valueOf(s1.length()));

		listString.sort(sortLongToShort);
	}

	//Comparator sort alphabet
	public static void sortAlphabet(List<String> listString) {
		Comparator<String> sortAlphabet = (String a, String b) -> a.compareTo(b);
		
		listString.sort(sortAlphabet);
	}

	//Show list string
	public static void showListString(List<String> listString) {
		for (String string : listString) {
			System.out.println(string);
		}
	}
}
