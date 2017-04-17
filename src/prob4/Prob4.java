package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {

		char[] c1 = reverse("Hello World");
		printCharArray(c1);

		char[] c2 = reverse("Java Programming!");
		printCharArray(c2);

	}

	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */
		char[] result = str.toCharArray();
		char[] result2 = new char[result.length];
		int i = 0;
		for (int j = result.length - 1; j >= 0; j--) {
			result2[i] = result[j];
			i++;
		}

		return result2;
	}

	public static void printCharArray(char[] array) {
		/* 코드를 완성합니다 */
		String a = new String(array);
		System.out.println(a);
	}
}
