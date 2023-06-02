package Day04.com.ict.edu;

public class Ex03_if {
	public static void main(String[] args) {
		//단순 if문: 조건식이 참일 때만 실행, 거짓이면 if문 무시
		//형식) if(조건식) {
		//		조건식이 참일때 실행할 문장;
		//		조건식이 참일때 실행할 문장;
		//	}
		//단, 실행문장이 한줄이면 {} 블록을 생략 가능
		//형식 if(조건식) 조건식이 참일때 실행할 문장;
		
		//k1이 60이상이면 합격, 미만은 불합격
		int k1 = 6;
		String str = "초기값";
		
		if(k1>=60) str = "합격"; 
		if(k1<60) str = "불합격";
		
		System.out.println("결과: " + str);
		
		//k2의 홀수, 짝수 구분하기
		int k2 = 30;
		if(k2%2 ==0) str = "짝수"; else str = "홀수";
		System.out.println(str);
		
		//대문자, 소문자, 구분
		char k3 = 'a';
		str = "대문자 아님";
		if(k3 >= 'A' && k3<='Z') str = "대문자입니다.";
		System.out.println(str);
		
		//		근무시간이 8시간까지는 시간당 9620이고
		//		8시간을 초과한 시간 만큼은 1.5배 지급한다.
		//		현재 근무한 시간이 10시간이다
		//		얼마를 받아야 하는가?
		
		int work = 10;
		int pay = 9620;
		
		int su = work*pay;
		
		if(work > 8) su = (int)((work-8)*pay*1.5) + pay*8;
		
		System.out.println(su);
		
		
	}
}
