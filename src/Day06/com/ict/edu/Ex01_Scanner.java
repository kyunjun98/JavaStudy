package Day06.com.ict.edu;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		//Scanner 클래스: 키보드에 입력된 정보를 받아서 처리하는 클래스
		//System.out => 표준 출력장치(모니터)
		//System.in => 표준 입력장치(키보드)
		//회사에서 제공하는 클래스를 사용하기 위해서 import를 해야 된다.
		
		//java.lang 패키지안에 존재하는 클래스는 아무런 제약없이 사용가능(import 안함)
		//이 외 패키지 안에 존재하는 클래스는 무조건 import를 해야한다.
		//import 방법 1) 클래스 이름 뒤에서 ctrl + space, 
		//			 2) ctrl + shift + o
		//해당 클래스의 api를 보고싶으면 shift + f2 하면된다.
		
		Scanner sc = new Scanner(System.in);

		//.next();: 입력한 내용을 String으로 처리하는 메서드
		System.out.print("이름: ");
		String name = sc.next();
		System.out.println("받은 이름: " + name);
		
		//.next();: 입력한 내용을 String으로 처리하는 메서드		
		System.out.print("나이: ");
		String age = sc.next();
		System.out.println("String으로 받은 나이: " + (age+1));
		
		//.nextInt();: 입력한 내용을 int로 처리하는 메서드
		System.out.print("나이: ");
		int age2 = sc.nextInt();
		System.out.println("Int로 받은 나이: " + (age2+1));

		//.nextDouble();: 입력한 내용을 double로 처리하는 메서드
		System.out.print("키: ");
		double ke = sc.nextDouble();
		System.out.println("double로 받은 키: " + ke);
		
		//.nextBoolean();: 입력한 내용을 boolean으로 처리하는 메서드(숫자 및 다른 문자 입력시 오류)
		System.out.print("당신은 남성입니까?(true/false) ");
		boolean gender = sc.nextBoolean();
		if(gender) {
			System.out.println("당신은 남성입니다.");
		} else System.out.println("당신은 여성입니다.");
	}
}
