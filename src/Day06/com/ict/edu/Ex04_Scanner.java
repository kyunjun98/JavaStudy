package Day06.com.ict.edu;

import java.util.Scanner;

public class Ex04_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//원하는 단어 입력 받고 원하는 횟수 입력 받아서 횟수만큼 단어 출력
		System.out.print("단어 입력: ");
		String str = sc.next();
		System.out.print("출력 횟수 입력: ");
		int i = sc.nextInt();
		
		//for문
		for(int j=0; j<i; j++) {
			System.out.println(str);
		}
		System.out.println("==============================");
		
		//while문
		int j = 0;
		while(j<i) {
			System.out.println(str);
			j++;
		}
		
		//원하는 횟수를 입력받고 입력받은 만큼 숫자를 입력받고 그 숫자가 홀수, 짝수 판별
		System.out.print("입력받은 숫자의 횟수 입력: ");
		int su = sc.nextInt();
		for(i=0; i<su; i++) {
			System.out.print("홀수, 짝수 판별할 숫자 입력: ");
			int su1 = sc.nextInt();
			if(su1%2==0) {
				System.out.println("짝수");
			} else System.out.println("홀수");
		} System.out.println("프로그램 종료");
		
		//이름, 국어, 영어, 수학을 입력 받고 총점, 평균, 학점을 구하고
		//이름, 총점, 평균, 학점을 출력
		System.out.print("이름 입력: ");
		String name = sc.next();
		System.out.print("국어 점수 입력: ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 입력: ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력: ");
		int math = sc.nextInt();
		
		int sum = kor+eng+math;
		double avg = sum/3;
		String hak = "";
		if(avg>=90) {
			hak = "A";
		} else if(avg>=80) {
			hak = "B";
		} else if(avg>=70) {
			hak = "C";
		} else hak = "F";
		
		System.out.println("이름: " + name);
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		System.out.println("학점: " + hak);
	}
}
