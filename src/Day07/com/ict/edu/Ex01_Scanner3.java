package Day07.com.ict.edu;

import java.util.Scanner;

public class Ex01_Scanner3 {
	public static void main(String[] args) {
		// Ex01_Scanner 클래스는 계혹할까요? 질문했을 때 2이면 탈출하지만
		// 2를 제외한 나머지는 무조건 다시 실행 하게 되는 단점이 있다.
		Scanner sc = new Scanner(System.in);

		int all = 1; // 전체횟수
		int even = 0; // 짝수횟수
		esc: while (true) {
			System.out.print("숫자입력: ");
			int su1 = sc.nextInt();
			if (su1 % 2 == 0) {
				System.out.println(su1 + "는 짝수입니다.");
				even++;
			} else
				System.out.println(su1 + "는 홀수입니다.");
			// 1번 계속, 2번 끝, 나머지는 다시 물어보기
			while (true) {
				System.out.print("계속할까요?\n1)Y,y\t|\n2)n\t|\n>>>>>>>");
				String conti = sc.next(); //equalsIgnoreCase = 대소문자 구별x, equals = 대소문자 구별o
				if (conti.equals("1") || conti.equalsIgnoreCase("y")) {
					all++;
					break;
				} else if (conti.equals("2") || conti.equals("n"))
					break esc;
				else {
					System.out.println("잘못입력함.");
					continue;
				}

			}
		}
		double su = (int) (even * 1000.0 / all) / 10.0;
		System.out.println("전체: " + all + ", 짝수: " + even + ", 짝수가 나온확률:" + su + "%");
		System.out.println("===========================");
	}
}
