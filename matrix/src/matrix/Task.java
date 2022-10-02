package matrix;

import java.util.Random;

public class Task {
	public static void main(String[] args) {

		Random random = new Random();

		final int m = 4;
		final int n = 4;

		int[][] a = new int[m][n];
		float[] b = new float[m];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = random.nextInt(-10, 10);
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("[" + i + "][" + j + "] : " + a[i][j]);
			}
		}

		// A
		/*
		 * for (int i = 0; i < m; i++) { int sum = 0; for (int j = 0; j < n; j++) { sum
		 * += a[i][j]; } b[i] = sum; }
		 * 
		 * // B
		 * 
		 * for (int i = 0; i < m; i++) { int product = 1; for (int j = 0; j < n; j++) {
		 * product *= a[i][j]; } b[i] = product; }
		 */
		// C
		for (int i = 0; i < m; i++) {
			float sum = 0;
			for (int j = 0; j < n; j++) {
				sum += a[i][j];
			}
			b[i] = sum / n;
		}

		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

		float minAverage = 100000;
		for (int i = 0; i < b.length; i++) {
			if (b[i] < minAverage) {
				minAverage = b[i];
			}
		}
		System.out.println("\n" + minAverage);

	}
}
