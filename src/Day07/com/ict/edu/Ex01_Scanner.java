package Day07.com.ict.edu;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int all = 1; //전체횟수
		int even = 0; //짝수횟수
		esc:
		while(true) {
			System.out.print("숫자입력: ");
			int su1 = sc.nextInt();
			if(su1%2 == 0) {
				System.out.println(su1 + "는 짝수입니다."); even++;
			} else System.out.println(su1 + "는 홀수입니다.");

			contin: //1번 계속, 2번 끝, 나머지는 다시 물어보기
			while(true) {
				System.out.print("계속할까요?\n1)yes\t|\n2)no\t|\n>>>>>>>");
				int conti = sc.nextInt();
				if(conti==1) {
					all++;
					break;
				}
				else if(conti==2) break esc;
				else continue;
				
		}
	}
		double su = (even/(all*1.0)) *100;
		System.out.println("전체: " + all + ", 짝수: " + even + ", 짝수가 나온확률:" + (int)(su));
		System.out.println("===========================");
	}
}
