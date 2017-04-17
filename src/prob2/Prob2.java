package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] intArray = new int[5];
		double sum = 0;
		int i = 1;
		int total =0;

		try {
			while (scanner.hasNext()) {
				i++;
				total+=Integer.parseInt(scanner.next());
				
				if (i > 5) {
					float a = total/5;
					System.out.println("평균값은 ="+a);
					scanner.close();
				}
			}
		} catch (Exception e) {
			
		}
	}
}
