package loops;

import java.util.Random;
import java.util.Scanner;

public class Task1b {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		float l, r, h;
		int b;

		System.out.print("Input L: ");
		l = scanner.nextFloat();

		b = random.nextInt(1, 5);
		System.out.println("B = " + b + "\n");

		for (r = 0.5f; r > -0.77f; r -= 0.01f) {
			h = (float) ((Math.sin(r) + Math.sin(b) + Math.sin(l)) / (Math.pow(r, 2) + Math.sqrt(r - l + b)));
			System.out.println("R = " + r + "  H = " + h);
		}
	}
}
