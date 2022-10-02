package strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();

		List<String> list = Arrays.asList(text.split(" "));
		System.out.println(list);

		Set<String> set = new HashSet<String>(list);

		for (String s : set)
			if (Collections.frequency(list, s) == 1) {
				System.out.println(s);
			}
	}
}
