package MaxArray;

import java.util.Random;
import java.util.Scanner;

public class MainMaxArray {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Input n:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = random.nextInt(100);
		}
		
		System.out.println("Input num of threads:");
		int numThreads = sc.nextInt();
		int max = max(arr, numThreads);
		String strArr = "";
		for(int value : arr)
		{
			strArr += value + " ";
		}
		
		System.out.println("Array: " + strArr);
		System.out.println("Max: " + max);
	}
	
	private static int max(int[] arr, int numThreads) throws InterruptedException {
		// TODO Auto-generated method stub
		int len = arr.length;
		int max = 0;
		
		MaxThread[] tm = new MaxThread[numThreads];
		for (int i = 0; i < numThreads; i++) {
			tm[i] = new MaxThread((i * len) / numThreads, ((i + 1) * len / numThreads), arr);
			tm[i].start();
		}
		
		for (int i = 0; i < numThreads; i++) {
			tm[i].join();
			if(tm[i].getMax() > max)
				max = tm[i].getMax();
		}
		
		return max;
	}
	
}
