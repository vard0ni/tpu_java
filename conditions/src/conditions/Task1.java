package conditions;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Input X: ");
		double x = scan.nextDouble();

		System.out.print("Input C: ");
		double c = scan.nextDouble();

		double y;

		if (x < c) {
			y = 1 - x;
		} else if (x == c) {
			y = 1;
		} else {
			y = x + 1;
		}
		System.out.println("Y = " + y);
	}
}
