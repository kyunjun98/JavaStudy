package Day03.com.ict.edu;

public class Ex01_oper {
	public static void main(String[] args) {
		//산술연산자: + - * / %(나머지)
		int su1 = 9;
		int su2 = 4;
		int result = 0;
		
		//sysout 하고 ctrl + 스페이스바 하면 바로 나옴
		result = su1 +su2;
		System.out.println("+ 결과: " + result);
		
		result = su1 - su2;
		System.out.println("- 결과: " + result);
		
		result = su1 / su2;
		System.out.println("/ 결과: " + result);
		
		// ALT키 누르고 방향키 누르면 위치 바꿔줌
		double res = su1 / su2;
		System.out.println("double / 결과: " + res);
		
		// ctrl + alt 누르고 방향키 조절하면 선택한 만큼 복사해줌
		res = (double)(su1) / su2; //또는 su1*1.0 / su2
		System.out.println("double / 소수점 결과: " + res);
		
		res = (su1*1.0) / su2;
		System.out.println("double / 소수점2 결과: " + res);
		
		result = su1 % su2;
		System.out.println("% 결과: " + result);
	}

}
