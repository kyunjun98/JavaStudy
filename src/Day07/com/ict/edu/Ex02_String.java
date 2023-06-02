package Day07.com.ict.edu;

public class Ex02_String {
	public static void main(String[] args) {
		//String 클래스는 문자열을 처리하는 클래스
		//기본자료형은 아니지만 기본자료형처럼 사용
		
		//String에서 자주사용되는 메서드들
		//메서드(인자): 실행 결과의 자료형
		//인자 = 메서드가 실행하기 위해서 받은 재료(source)
		
		//1. .charAt(int index): index 위치의 글자를 반환
		//위치정보 = index
		//위치 정보를 받아서 해당 위치의 존재하는 글자를 char형으로 반환
		String str = "한국 ICT 인재개발원 1강의장";
		char k1 = str.charAt(1); //index는 0부터 시작
		System.out.println("결과: " + k1);
		System.out.println("=====================");
		
		str = "Hello World";
		
		//모두 소문자로 만들자
		for(int i=0; i<str.length(); i++) { //.length()는 문자열의 길이 구해줌
			char k2 = str.charAt(i);
			if(str.charAt(i)<='z' && str.charAt(i) >='a') {
				System.out.print((char)(k2-32));
			} else System.out.print(k2);
		}
		System.out.println("\n=====================");
		
		//toUpperCase > 모두 대문자로 변환 / toLowerCase > 모두 소문자로 변환
		for(int i=0; i<str.length(); i++) { //.length()는 문자열의 길이 구해줌
			str = str.toUpperCase();
		}
		System.out.println(str);
		System.out.println("=====================");
		
		//2. .concat(String str): String
		//입력된 문자열을 현재 문자열과 합친다. ("문자열" + "문자열")
		//concat이나 +는 메모리 효율이 떨어진다.
		String s1 = "대한민국";
		String s2 = "KOREA";
		String s3 = s1.concat(s2);
		System.out.println(s3);
		System.out.println(s1+s2);
		System.out.println("=====================");
		
		//3. .contains(CharSequence s): boolean
		//CharSequence: char 값을 읽을 수 있는 시퀀스, 인터페이스
		//CharSequence을 지금은 String이라고 생각하자.
		//현재 가지고 있는 문자열 중에 인자로 들어온 문자나 문자열을 가지고 있으면 true, 없으면 false
		String s4 = "KOREA @ 대한민국";
		System.out.println(s4.contains("@"));
		System.out.println(s4.contains("REA"));
		System.out.println(s4.contains("rea"));
		System.out.println("=====================");
		
		//4. .equals(Object anObject): boolean
		//입력된 문자열과 현재 문자열이 같으면 true, 다르면 false (대소문자 구별)
		//5. .equalsIgnoreCase(String anotherString): boolean
		//입력된 문자열과 현재 문자열이 같으면 true, 다르면 false (대소문자 구별하지 않음)
		String s5 = "Korea";
		String s6 = "KOREA";
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
		System.out.println("=====================");
		
		//6. .format(String format, Object... args): static String
		//형식을 지정하고 형식에 맞춰 생성
		String s7 = "ICT 인재 개발원";
		//문자열 => %s라고 함
		String s8 = String.format("%s", s7);
		System.out.println(s8);
		System.out.println("=====================");
		
		//%30s 30자리 차지하는 문자열(남은 자리는 비워둔다.) 오른쪽 정렬
		s8 = String.format("%30s", s7);
		System.out.println(s8);
		//자리가 모잘라도 알아서 전부 출력시켜준다.
		s8 = String.format("%4s", s7);
		System.out.println(s8);
		System.out.println("=====================");
		
		//%-30s 30자리 차지하는 문자열(남은 자리는 비워둔다.) 왼쪽 정렬
		s8 = String.format("%-30s", s7);
		System.out.println(s8);
		//자리가 모잘라도 알아서 전부 출력시켜준다.
		s8 = String.format("%-4s", s7);
		System.out.println(s8);
		System.out.println("=====================");
		
		//%.ns 하면 n만큼만 출력시킴
		s8 = String.format("%.7s", s7);
		System.out.println(s8);
		System.out.println("=====================");
		
		//%d 정수 형식 지정 문자열로 바꿔줌
		int s9 = 231423;
		s8 = String.format("%d", s9);
		System.out.println(s8);
		//오른쪽 정렬 
		s8 = String.format("%10d", s9);
		System.out.println(s8);
		//왼쪽 정렬
		s8 = String.format("%-10d", s9);
		System.out.println(s8);
		//빈공간 0으로 채운다
		s8 = String.format("%010d", s9);
		System.out.println(s8);
		//뒷부터 세자리마다 콤마
		s8 = String.format("%,d", s9);
		System.out.println(s8);
		System.out.println("=====================");
		
		//%f 실수 형식
		double s10 = 1234.567890123;
		System.out.println(String.format("%f", s10));
		//오른쪽 정렬
		System.out.println(String.format("%20f", s10));
		//.n하면 반올림하여 n만큼 소수점 출력
		System.out.println(String.format("%.1f", s10));
		//정수부분 뒷부터 3자리마다 콤마
		System.out.println(String.format("%,.3f", s10));		
	}
}
