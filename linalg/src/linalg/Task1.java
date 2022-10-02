package linalg;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		System.out.println("V = 1/3*S*Н");

		Scanner scan = new Scanner(System.in);

		System.out.print("Input S: ");
		double s = scan.nextDouble();

		System.out.print("Input H: ");
		double h = scan.nextDouble();

		double v = 1. / 3. * s * h;
		System.out.println("V = " + v);
	}
}
