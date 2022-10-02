package vectors;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int n = 8;
		int[] arr = new int[n];
		int count = 1;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] == arr[i]) {
				count++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nCount: " + count);

	}
}
