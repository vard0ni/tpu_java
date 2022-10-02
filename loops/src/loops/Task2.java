package loops;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input X2: ");
		float x2 = scanner.nextFloat();

		float x1 = 10.0f;
		float z2;
		while (x1 > -10) {
			z2 = (float) ((x1 - Math.pow(x2, 3)) / Math.sqrt(x1 + x2));
			System.out.println("X1 = " + x1 + " Z2 = " + z2);

			x1 -= 0.51;
		}
	}
}
