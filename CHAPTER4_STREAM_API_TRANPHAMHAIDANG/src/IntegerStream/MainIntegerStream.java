package IntegerStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainIntegerStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();

		System.out.println("List 1:");
		List<Integer> list1 = IntStream
				.of(random.ints(0, 15).limit(15).toArray()).boxed()
				.collect(Collectors.toList());
		list1.forEach(integer -> System.out.print(integer + " "));
		System.out.println("\n");

		System.out.println("List 2:");
		List<Integer> list2 = list1.stream().map(integer -> integer * integer)
				.collect(Collectors.toList());
		list2.forEach(integer -> System.out.print(integer + " "));
		System.out.println("\n");

		IntSummaryStatistics stats = list2.stream().mapToInt((x) -> x)
				.summaryStatistics();
		System.out.println("Max element in list 2: " + stats.getMax());
		System.out.println("Min element in list 2: " + stats.getMin());
		System.out.println("Sum of all elements in list 2: " + stats.getSum());
		System.out.println("Average of all elements in list 2: "
				+ stats.getAverage());
		System.out.println("\n");
		
		System.out.println("List 3:");
		List<Integer> list3 = list2.stream()
				.filter(integer -> checkPrime(integer))
				.collect(Collectors.toList());
		list3.forEach(integer -> System.out.print(integer + " "));
		System.out.println("\n");

		System.out.println("List 4:");
		List<Integer> list4 = list2.stream()
				.filter(integer -> checkSquared(integer)).distinct()
				.collect(Collectors.toList());
		list4.forEach(integer -> System.out.print(integer + " "));
		System.out.println("\n");
	}

	public static boolean checkPrime(int n) {
		if (n == 0 || n == 1)
			return false;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}

		return true;
	}

	public static boolean checkSquared(int n) {
		if ((int) Math.sqrt(n) == Math.sqrt(n))
			return true;

		return false;
	}
}
