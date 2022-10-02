package vectors;

import java.util.Random;

public class Task3 {
	public static void main(String[] args) {
		Random random = new Random();

		final int n = 8;

		int[] arr1 = new int[n];
		int[] arr2 = new int[n];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = random.nextInt(0, 8);
		}

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == i) {
				arr2[i] = arr1[i];
			}
		}

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		System.out.println("\n");

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
