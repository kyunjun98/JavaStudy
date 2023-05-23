package Day04.com.ict.edu;

public class Ex01_oper {
	public static void main(String[] args) {
//		삼항연산자: 조건식 => 조건이 참일때와 거짓일때를 구분해서 실행한다. <분기문이라고 표현>
//		형식) 자료형 변수이름 = (조건식) ? 조건식이 참일때 실행할 문장 : 조건식이 거짓일때 실행할 문장 ;
//		str = (조건식) ? 참일때 : 거짓일때 ;
//		※ 주의사항 ※ 변수, 참일때 실행 결과, 거짓일때 실행 결과 모두 같은 자료형이어야 한다.
//		조건식 종류: boolean(true, false), 비교연산자(<,>,==,등), 논리연산자(&&,||,등) 
		
		String str = (true) ? "강아지" : "고양이" ;
		System.out.println("결과: "+ str);
		
		//int avg = 80;
		double avg = 85.3;  // ★실수라도 정수와 비교가능!!!!
		str = (avg >= 80) ? "합격" : "불합격";
		System.out.println("결과: "+ str);
		
		char c1 = 'R';
		str = (c1>='a' && c1<='z') ? "소문자" : "소문자아님" ;
		System.out.println("결과: "+ str);
		
		//1 또는 3이면 남자 아니면 여자
		int gender = 2;
		str = (gender == 1 || gender == 3) ? "남자" : "여자" ;
		System.out.println("결과: "+ str);
		
		//★ 홀수이면 남자, 짝수이면 여자(홀짝 구하기)
		gender = 4;
		str = (gender%2 == 1) ? "남자" : "여자" ;  //2로 나눈 나머지가 1이면 홀수
		System.out.println("결과: "+ str);
		
		//3의 배수인지 아닌지 맞춰라 (배수 구하기)
		int su1 = 157;
		str = (su1 % 3 == 0) ? "3의 배수입니다" : "3의 배수가 아닙니다";
		System.out.println("결과: "+ str);
		
		
		//		근무시간이 8시간까지는 시간당 9620이고
		//		8시간을 초과한 시간 만큼은 1.5배 지급한다.
		//		현재 근무한 시간이 10시간이다
		//		얼마를 받아야 하는가?
		
		int work = 10;
		int pay = 9620;
		
		int sal = 0;
										//(work-8)*1.5*pay + 8*pay
		sal = (work <= 8)? work * pay : (int)(1.5 * pay * work - 4 * pay);
		System.out.println("지급받을 금액은 " + sal + "원 입니다.");
		
		int num1 = 47;
		int num2 = 32;
		
		//int res = (num1 - num2 > 0 ) -> num1이 양수면 더 큰거지
		int res = (num1 > num2)? num1 : num2;
		System.out.println("큰값은 " + res);
		//Math 클래스에 있는 max() 메소드 사용 -> 두 값중 높은 값 반환
		int res2 = Math.max(num1, num2);
		System.out.println(res2);
		
		int res3 = -19;
		int res4 = (res3 > 0)? res3 : res3*-1;
		System.out.println("res4 값: " + res4);
		
		//Math 클래스에 있는 abs() 메소드 사용 -> 절대값 반환
		int res5 = -19;
		System.out.println("res5 값: " + Math.abs(res5));
	}

}