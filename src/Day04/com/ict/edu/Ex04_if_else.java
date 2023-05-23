package Day04.com.ict.edu;

public class Ex04_if_else {

	public static void main(String[] args) {
		//if - else 문
		//조건식이 참일때와 거짓일때 각각 니눠서 처리한다.
		//형식은 if(조건식) {
					//조건식이 참일 때 실행할 문장;
					//조건식이 참일 때 실행할 문장;
		//		} else {
					//조건식이 참일 때 실행할 문장;
					//조건식이 참일 때 실행할 문장;
		//		}
		
		//k1이 60 이상이면 합격, 미만은 불합격
		int k1 = 40;
		String str = "";
		
		if(k1>=60) {
			str = "합격";
		} else {
			str = "불합격";
		} 
		System.out.println("결과: " + str);
		
		//k2의 홀수, 짝수 판별
		int k2 = 3;
		
		if(k2%2 ==0) {
			str = "짝수";
		} else {
			str = "홀수";
		}
		System.out.println("짝홀 결과: " + str);
		
		//k3의 대문자, 소문자 판별
		char k3 = 'A';
		
		if(k3 >= 'a' && k3 <= 'z') {
			str = "소문자";
		} else if(k3 >= 'A' && k3 <= 'Z') {
			str = "대문자";
		} else {
			str = "기타문자입니다.";
		}
		System.out.println("대소문자 결과: " + str);
		
		//		근무시간이 8시간까지는 시간당 9620이고
		//		8시간을 초과한 시간 만큼은 1.5배 지급한다.
		//		현재 근무한 시간이 10시간이다
		//		얼마를 받아야 하는가?
		int work = 10;
		int pay = 9620;
		int su = pay*work;
		double overWork = (work-8)*pay*1.5;
		
		if(work <= 8) {
			System.out.println("받을 돈은 " + su + "원 입니다.");
		} else {
			System.out.println("받을 돈은 " + (int)(overWork + 8*pay) + "원 입니다.");
		}
	}
}
