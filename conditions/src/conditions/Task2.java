package conditions;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Input 1st num: ");
		double a = scan.nextDouble();

		System.out.print("Input 2nd num: ");
		double b = scan.nextDouble();

		if (a < b) {
			a = 0;
		} else if (a > b) {
			b = 0;
		} else {
			a = b = 0;
		}

		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
