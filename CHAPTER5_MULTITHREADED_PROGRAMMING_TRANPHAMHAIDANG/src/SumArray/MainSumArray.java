package SumArray;

import java.util.Random;
import java.util.Scanner;

public class MainSumArray {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Input n:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = random.nextInt(10);
		}
		
		System.out.println("Input num of threads:");
		int numThreads = sc.nextInt();
		int sum = sum(arr, numThreads);
		String strArr = "";
		for(int value : arr)
		{
			strArr += value + " ";
		}
		
		System.out.println("Array: " + strArr);
		System.out.println("Sum: " + sum);
	}
	
	private static int sum(int[] arr, int numThreads) throws InterruptedException {
		// TODO Auto-generated method stub
		int len = arr.length;
		int sum = 0;
		
		SumThread[] ts = new SumThread[numThreads];
		for (int i = 0; i < numThreads; i++) {
			ts[i] = new SumThread((i * len) / numThreads, ((i + 1) * len / numThreads), arr);
			ts[i].start();
		}
		
		for (int i = 0; i < numThreads; i++) {
			ts[i].join();
			sum += ts[i].getSum();
		}
		
		return sum;
	}

}
