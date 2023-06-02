package Day07.com.ict.edu;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//이름, 국어, 영어, 수학을 입력 받고 총점, 평균, 학점을 구하고
		//이름, 총점, 평균, 학점을 출력
		System.out.print("이름: ");
		String name = sc.next();
		
		System.out.println("국어: ");
		int kor = sc.nextInt();
		
		System.out.println("영어: ");
		int eng = sc.nextInt();
		
		System.out.println("수학: ");
		int math = sc.nextInt();
		
		int sum = (kor+eng+math);
		double avg = (int)(sum/3.0*10)/10.0;
		String hak = "";
				
		if(avg>=90) hak = "A";
		else if(avg>=80) hak ="B";
		else if(avg>=70) hak ="C";
		else hak = "F";
		
		System.out.println("이름: " + name + ", 총점: " + sum + ", 평균: " + avg + ", 학점: " + hak);
		
	}
}
