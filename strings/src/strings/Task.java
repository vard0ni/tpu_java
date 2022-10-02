package strings;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();

		String ans = str1.replace(str2, "");
		System.out.println(ans);
	}

}
