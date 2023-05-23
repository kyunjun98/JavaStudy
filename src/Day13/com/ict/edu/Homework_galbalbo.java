package Day13.com.ict.edu;

import java.util.Random;
import java.util.Scanner;

public class Homework_galbalbo {
	public static void main(String[] args) {
		Random ran = new Random();

		Scanner sc = new Scanner(System.in);
		int win = 0;
		int lose = 0;
		int draw = 0;
		int count = 0;
		
		galbalbo_method k1 = new galbalbo_method();
		
		esc: while (true) {
			System.out.println("1. 가위\t2. 바위\t3. 보");
			System.out.print("선택: ");
			int user = sc.nextInt();
			if (user == 1 || user == 2 || user == 3) {
				int com = ran.nextInt(3); // 컴퓨터 랜덤
				count++;
				// 가위는 나머지0 바위는 1 보는 2
				if (com == 0) { // 컴퓨터가 가위낼때
					System.out.println("컴퓨터는 가위");
					if (user == 1) {
						k1.setDraw();
					} else if (user == 2) {
						k1.setWin();
					} else if (user == 3) {
						k1.setLose();
					}
				} else if (com == 1) { // 컴퓨터가 바위낼때
					System.out.println("컴퓨터는 바위");
					if (user == 1) {
						k1.setLose();
					} else if (user == 2) {
						k1.setDraw();
					} else if (user == 3) {
						k1.setWin();
					}
				} else if (com == 2) { // 컴퓨터가 보낼때
					System.out.println("컴퓨터는 보");
					if (user == 1) {
						k1.setWin();
					} else if (user == 2) {
						k1.setLose();
					} else if (user == 3) {
						k1.setDraw();
					}
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
			} else {
				System.out.println("다시 입력하세요.");
				continue esc;
			}
		}
		double per = (k1.getWin() / (count * 1.0)) * 100;
		System.out.println("승률: " + (int) (per * 10) / 10.0 + "%입니다.");
	}
}
