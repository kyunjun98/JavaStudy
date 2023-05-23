package Day07.com.ict.edu;

import java.util.Scanner;

public class Day07_Homework {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.print("계속할까요?(1.yes, 2.no) >> "); 했을 떄
		// 1 이면 반복문 실행 , 2이면 반복문 탈출 ,
		// 이외의 숫자가 나오면 잘못 입력했습니다. 후 다시 물어보는 로직 구현
		// 계속할까요?(1.yes, 2.no)

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
				System.out.print("계속할까요?\n1)yes\t|\n2)no\t|\n>>>>>>>");
				int conti = sc.nextInt();
				if (conti == 1) {
					all++;
					break;
				} else if (conti == 2)
					break esc;
				else {
					System.out.println("잘못 입력했습니다.");
				}
			} // 안쪽 while //잘못입력했을때 안쪽 while문이 다시 실행하기 위함
		} // 바깥쪽 while / 계속안할때는 바깥쪽 while문 빠져나가야하기 때문에 label로 묶음
		double su = (int) (even * 1000.0 / all) / 10.0;
		System.out.println("전체: " + all + ", 짝수: " + even + ", 짝수가 나온확률:" + su + "%");
		System.out.println("===========================");
	}
}
