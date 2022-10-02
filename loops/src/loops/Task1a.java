package loops;

import java.util.Scanner;

public class Task1a {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input L: ");
		float l = scanner.nextFloat();

		System.out.print("Input B: ");
		float b = scanner.nextFloat();

		for (float r = 0.5f; r > -0.77f; r -= 0.01f) {
			float h = (float) ((Math.sin(r) + Math.sin(b) + Math.sin(l)) / (Math.pow(r, 2) + Math.sqrt(r - l + b)));
			System.out.println("R = " + r + "  H = " + h);
		}
	}
}
