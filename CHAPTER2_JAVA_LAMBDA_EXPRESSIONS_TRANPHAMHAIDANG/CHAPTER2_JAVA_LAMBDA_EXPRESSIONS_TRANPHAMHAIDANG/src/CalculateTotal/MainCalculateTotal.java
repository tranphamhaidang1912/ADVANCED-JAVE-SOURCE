package CalculateTotal;

import java.util.Arrays;
import java.util.List;

public class MainCalculateTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> amounts = Arrays.asList(new Integer[] {2, 3, 5, 7});
		int price = 5200;
		amounts.forEach(element -> {
			System.out.println("Total = " + price * element + " vnd");
		});
	}

}
