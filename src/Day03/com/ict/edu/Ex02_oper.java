package Day03.com.ict.edu;

public class Ex02_oper {
	public static void main(String[] args) {
		//증감연산자: 해당 변수의 값을 1씩 증가하거나 감소 시킨다.
		// ++변수: 현재 변수값을 먼저 1증가하고 나머지를 실행
		// 변수++: 현재 변수값을 실행 후 나중에 변수값 1증가
		int su1 = 10;
		int su2 = 10;
		
		System.out.println(++su1);
		System.out.println(su2++);
		System.out.println(su1);
		System.out.println(su2);
		
		char c1 = 'b';
		char c2 = 'B';
		System.out.println(++c1);
		System.out.println(c2++);

		System.out.println(c1);
		System.out.println(c2);
	}
}
