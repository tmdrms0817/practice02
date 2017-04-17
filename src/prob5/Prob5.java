package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {

		System.out.print("숫자를 입력해 주세요>");
		Random RN = new Random();
		int a = RN.nextInt(100);
		Scanner s = new Scanner(System.in);
		int min = 0;
		int max = 100;
		boolean status = false;
		try {

			while (s.hasNext()) {
				String user_st = s.next();
				if (status) {
					if (user_st.equals("y") || user_st.equals("Y")) {
						a = RN.nextInt(100);
						status = false;
						max = 100;
						min = 0;
						System.out.println("0-100 다시시작~!");
					} else {
						System.out.println("게임이 끝났습니다.");
						s.close();
					}
				} else {
					int user_in = Integer.parseInt(user_st);
					if (user_in != a) {
						if (user_in > a) {
							max = user_in;
							System.out.println(min + "-" + max + " 더 낮게");
						} else {
							min = user_in;
							System.out.println(min + "-" + max + " 더 높게");
						}
					} else {
						System.out.println("정답입니다.");
						System.out.println("다시하시겠습니까( Y/N )");
						status = true;
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}