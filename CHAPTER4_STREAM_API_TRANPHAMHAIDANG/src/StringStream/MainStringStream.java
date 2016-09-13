package StringStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainStringStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list1 = Arrays.asList("a", "bb", "ccc", "", "d", "ee", "", "f", "gg", "hhh", "iiii", "jjjjj", "kkkkkk", "lllllll", "", "m");
		System.out.println("List 1:");
		list1.forEach(System.out::println);
		System.out.println();
		
		System.out.println("Count \"\" element in list 1: " + list1.stream().filter(string -> string.isEmpty()).count());
		System.out.println("Count element have length >= 5 in list 1: " + list1.stream().filter(string -> string.length() >= 5).count());
		System.out.println("Count element start with \"a\" in list 1: " + list1.stream().filter(string -> string.startsWith("a")).count());
		System.out.println("Count \"happy\" element in list 1: " + list1.stream().filter(string -> string.matches("happy")).count());
		System.out.println();
		
		List<String> list2 = list1.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println("List 2:");
		list2.forEach(System.out::println);
		System.out.println();
		
		List<String> list3 = list1.stream().filter(string -> string.length() >= 3 && string.length() <= 6).collect(Collectors.toList());
		String listString3 = list1.stream().filter(string -> string.length() >= 3 && string.length() <= 6).collect(Collectors.joining(", "));
		System.out.println("List 3:\n" + listString3 + "\n");
		
		List<String> list4 = list1.stream().map(string -> string + "happy").collect(Collectors.toList());
		System.out.println("List 4:");
		list4.forEach(System.out::println);
	}

}
