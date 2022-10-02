package vectors;

import java.util.Random;

public class Task1 {
	public static void main(String[] args) {
		Random random = new Random();

		final int n = 8;
		int max = -1000000;
		int min = 1000000;

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(-100, 100);
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0 && arr[i] < min) {
				min = arr[i];
			} else if (arr[i] < 0 && arr[i] > max) {
				max = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\n" + min + " " + max);
	}
}
