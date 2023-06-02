package Day03.com.ict.edu;

public class Ex04_oper {
	// ctrl + shift + f 하면 들여쓰기 자동으로 됨
	public static void main(String[] args) {
		//논리연산자: &&(AND, 논리곱), ||(OR, 논리합), !(NOT, 논리부정)
		//논리연산자의 연산 대상은 boolean형
		//결과는 boolean형, 조건식에 사용
		
		//AND = && = 논리곱 = 교집합
		//주어진 조건들이 모두 true 일때만 결과가 true
		//false가 한개라도 존재할경우 false이고 이후 연산하지 않는다.
		//**AND 조건을 이용하면 범위를 지정할 수 있다.
		//a >= 10 && a<=20 -> a는 10이상 20이하 범위를 지정한 것
		
		int su1 = 10;
		int su2 = 7;
		boolean result;
		
		result = (su1 >= 7) && (su2 >= 5);
		System.out.println(result);
		
		result = (su1 <= 7) && (su2 >= 5);
		System.out.println(result);		
		
		result = (su1 >= 7) && (su2 <= 5);
		System.out.println(result);
		
		result = (su1 <= 7) && (su2 <= 5);
		System.out.println(result);
		
		System.out.println("========================");
		
		result = ((su1 = su1 +2) > su2) && (su1 == (su2 = su2 +5));
		System.out.println("결과: " + result);
		System.out.println("su1: " + su1); 
		System.out.println("su2: " + su2);
	
		System.out.println("========================");
		
		su1 = 10;
		su2 = 7;
			
		//false가 나오는 순간 뒤에 계산식은 계산을 안하기 때문에 su2는 7이다.
		result = ((su1 = su1 +2) < su2) && (su1 == (su2 = su2 +5));
		System.out.println("결과: " + result);
		System.out.println("su1: " + su1); 
		System.out.println("su2: " + su2);
		
		System.out.println("========================");
		
		int su3 = 34;
		//su3은 20~30 사이에 존재하는 값 확인
		result = su3 >=20 && su3 <= 40;
		System.out.println("결과: " + result);
		
		//char c1이 소문자인지 확인 굳이 소문자의 숫자를 알 필요없음
		char c1 = 'g';
		result = c1 >= 'a' && c1 <= 'z';
		System.out.println("결과: " + result);
	}
}
