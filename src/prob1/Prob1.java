package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		
		System.out.print("금액을 입력하세요>");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[] coin = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int[] count = new int[coin.length];
		int i = 0;
		boolean f = true;

		while (i < coin.length) {
			if (coin[i] > num)
				i++;
			else if (coin[i] < num) {
				num -= coin[i];
				count[i]++;
			} else {
				f = false;
				count[i]++;
				break;
			}
		}
		
		for (int j = 0; j < coin.length; j++) {
			System.out.println(coin[j]+"="+count[j]+"개");
		}
	}
}