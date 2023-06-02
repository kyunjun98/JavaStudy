package Day13.com.ict.edu;

import java.util.Random;
import java.util.Scanner;

public class Homework_High_Low {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random ran = new Random();
		int count = 0;

		esc: while (true) {
			// 컴퓨터는 1~100 사이 랜덤 돌림
			int com = (int)(Math.floor(Math.random() * 100 + 1));
			
			while (true) {
				// 유저는 숫자 1~100 입력
				System.out.print("1~100 숫자입력: ");
				int user = sc.nextInt();
				if (user > 0 && user <= 100) {
					count++;
					if (com == user) {
						System.out.println("정답! 정답은 " + com + "입니다.");
						System.out.println("총 " + count + "번 하였습니다."  );
						break;
					} else if (com > user) {
						System.out.println(user + "보다 높음!");
						continue;
					} else if (com < user) {
						System.out.println(user + "보다 낮음!");
						continue;
					}
				} else System.out.println("다시 입력하세요.");
			}

			while (true) {
				System.out.println("더 하시겠습니까?(y/n)");
				String sel = sc.next();
				if (sel.equalsIgnoreCase("y")) {
					continue esc;
				} else if (sel.equalsIgnoreCase("n")) {
					break esc;
				} else {
					System.out.println("다시 선택하세요.");
					continue;
				}
			}
		}

	}
}
