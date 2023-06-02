package Day06.com.ict.edu;

import java.util.Scanner;

public class Ex02_Scanner {
	public static void main(String[] args) {
		//키보드 입력정보를 받아서 일 처리하라.
		
		//입력값이 홀수, 짝수인지 판별하라
		Scanner sc = new Scanner(System.in);
		System.out.print("입력값: ");
		int su = sc.nextInt();
		String str = "";
		if(su%2==0) {
			str = "짝수";
		} else str = "홀수";
		System.out.println(str);
		
		//총점 입력
		System.out.print("점수: ");
		int to = sc.nextInt();		
		if(to>=60) {
			str = "합격";
		} else str = "불합격";
		System.out.println("점수: " + to + ", 당신은 " + str + "입니다.");
	}
}
