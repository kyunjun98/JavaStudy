package Day03.com.ict.edu;

public class Ex05_oper {
	public static void main(String[] args) {
		//OR = || = 논리합 = 합집합
		//주어진 조건들 중 true를 만나면 결과는 true이고 그 이후는 연산 하지 않음
		
		int su1 = 10;
		int su2 = 7;
		boolean result;
		
		result = (su1 >= 7) || (su2 >= 5 );
		System.out.println("결과: " + result);
		
		result = (su1 <= 7) || (su2 >= 5 );
		System.out.println("결과: " + result);
		
		result = (su1 >= 7) || (su2 <=5 );
		System.out.println("결과: " + result);
		
		result = (su1 <= 7) || (su2 <=5 );
		System.out.println("결과: " + result);
		
		System.out.println("=============================");
		
		result = ((su1 = su1 +2) > su2) || (su2== (su2 = su2 +5));
		System.out.println("결과: " + result);
		System.out.println("su1: " + su1);
		System.out.println("su2: " + su2);

		//NOT = ! = 논리부정
		//주어진 논리값의 반대를 출력
		//ture > false, false > true
		boolean res = true;
		System.out.println(res);
		System.out.println(!res);
	}
}
