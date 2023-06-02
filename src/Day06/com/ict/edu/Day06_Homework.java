package Day06.com.ict.edu;

import java.util.Scanner;

public class Day06_Homework {
	public static void main(String[] args) {
		//과제: next(), nextLine() 메서드 차이 조사하기	
		
		Scanner sc = new Scanner(System.in);
		
		//nextLine은 입력한 내용 한줄 단위로 입력받는 메서드이다.
		System.out.print("내용: ");
		String nameLine = sc.nextLine();
		System.out.println("nextLine()으로 받은 내용: " + nameLine);
		
		
		//next는 공백 또는 분리자를 제외하고 가져온다.
		System.out.print("내용: ");
		String str = sc.next();
		System.out.println("next()로 받은 내용: " + str);
		
		
		//원하는 횟수를 입력받고 입력받은 만큼 숫자를 입력받고 그 숫자가 홀수, 짝수 판별
		System.out.print("입력받은 숫자의 횟수 입력: ");
		int su = sc.nextInt();
		for(int i=0; i<su; i++) {
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
		double avg = (int)((sum/3.0)*10)/10.0;
		String hak = "";
		if(avg>=90) {
			hak = "A";
		} else if(avg>=80) {
			hak = "B";
		} else if(avg>=70) {
			hak = "C";
		} else hak = "F";
		System.out.print("이름: " + name + ", 총점: " + sum + ", 평균: " + avg + ", 학점: " + hak + "입니다. \n");
	
		
		//a,b 숫자를 받아서 1.더하기, 2.빼기, 3.곱하기, 4.나누기
		double res = 0;
		System.out.print("숫자 a 입력: ");
		double a = sc.nextDouble();
		System.out.print("숫자 b 입력: ");
		double b = sc.nextDouble();
		String chi = "";
		
		System.out.println("1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기");
		int sel = sc.nextInt();
		if(sel==1) {
			res = a+b;
			chi = "+";
		} else if(sel==2) {
			res = a-b;
			chi = "-";
		} else if(sel==3) {
			res = a*b;
			chi = "*";
		} else if(sel==4) {
			res = a/b;
			chi = "/";
		} else System.out.println("다시 입력하세요.");
		System.out.println("a" + chi + "b = " + res);

	}
}
