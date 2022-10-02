package matrix;

import java.util.Random;

public class Task111 {
	public static void main(String[] args) {
		Random random = new Random();
		final int n = 4;

		int[][] a = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = random.nextInt(-10, 10);
			}
		}
		int min = 100000;
		int max = -100000;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
				}
			}
		}
	}
}
