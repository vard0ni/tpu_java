package linalg;

import java.util.Scanner;

public class Tast2 {
	public static void main(String[] args) {
		System.out.println("X = sqrt(Y1^2 + Z1^2 + P1^2)");
		System.out.println("Y = (Y1 - Y2) / X");
		System.out.println("Z = (Z1 + Z2) / X");
		System.out.println("P = P1 * P2 / X");

		Scanner scan = new Scanner(System.in);

		System.out.print("Input Y1: ");
		double y1 = scan.nextDouble();

		System.out.print("Input Y2: ");
		double y2 = scan.nextDouble();

		System.out.print("Input Z1: ");
		double z1 = scan.nextDouble();

		System.out.print("Input Z2: ");
		double z2 = scan.nextDouble();

		System.out.print("Input P1: ");
		double p1 = scan.nextDouble();

		System.out.print("Input P2: ");
		double p2 = scan.nextDouble();

		double x = Math.sqrt(y1 * y1 + z1 * z1 + p1 * p1);
		System.out.println("X = " + x);

		double y = (y1 - y2) / x;
		double z = (z1 + z2) / x;
		double p = p1 * p2 / x;
		System.out.println("Y = " + y + "\nZ = " + z + "\nP = " + p);
	}
}
