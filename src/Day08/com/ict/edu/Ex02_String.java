package Day08.com.ict.edu;

public class Ex02_String {
	public static void main(String[] args) {
	//		17. toLowerCase() : String => 해당 문자열을 모두 소문자로 변경  (조건비교할때 쓰임)
	//		toUpperCase() : String => 해당 문자열을 모두 대문자로 변경
		String str1 = "javaLand03Exam";
		String str2 ="";
		for (int j = 0; j < str1.length(); j++) {
			char k = str1.charAt(j);
			if (k>= 'a' && k <= 'z') {  //소문자 찾는 범위 지정
				str2 = str2 +(char)(k-32);    //대문자로 변경하는 조건
			} else {   //나머지는 그대로 출력
				str2 =str2+k;
			}
		}
		System.out.println(str2);
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println("========================");
		
	//	18. toString() : String
	//	 객체(클래스)에서 toString : 모든 클래스(객체)에서 사용 가능한 메서드
	//								클래스(객체)가 가지고 있는 정보나 값(데이터)들을 문자열로 만들어서 반환 
	//	String에서의 toString : 문자열 자체 반환
		String u1 = "java 11 자바 11";
		String u2 = u1.toString();
		System.out.println(u1);
		System.out.println(u2);
		System.out.println("========================");
		
	//	19. trim() : String  ★중요중요 비교값 구할때 사용
	//	해당 문자열의 맨앞, 맨뒤 공백 제거, 글자 사이의 공백은 제거 못함
		String u3 = "    java     자바    JAVA      ";
		System.out.println(u3);
		System.out.println("길이: "+ u3.length());
		
		String u4 = u3.trim();
		System.out.println(u4);
		System.out.println("공백제거 길이: "+ u4.length());
		System.out.println("========================");
		
	//	20. startsWith(String prefix) : boolean   //★ 많이 사용됨
	//		주어진 문자열로 시작하는지 검사
	//		startsWith(String prefix, int toffset) : boolean
	//		주어진 문자로 시작하는지 검사, toffset => 시작위치
	//		endWith(String suffix)  : boolean
	//		주어진 문자로 끝났는지 검사
		String u5 = "java    자바    JAVA";
		System.out.println(u5.startsWith("JAVA"));      //=> u5가 "JAVA"로 시작하니?
		System.out.println(u5.startsWith("java"));		// true
		System.out.println(u5.startsWith("자바"));
		
		System.out.println(u5.endsWith("JAVA"));      //=> u5가 "JAVA"로 끝나니?  true
		System.out.println(u5.endsWith("java"));
		System.out.println(u5.endsWith("자바"));
		System.out.println("========================");
		
	//	21. valueOf(기본자료형) : 들어온 기본자료형을 String으로 변경시킴
		boolean bo1 = true;
		char ch1 ='a';
		int num1 = 34;
		long num2 = 37L;
		double num3 = 345.127;
		
	//	System.out.println(bo1+1);  // 숫자가 아니라 계산 더해지지 않음
		System.out.println(ch1+1);
		System.out.println(num1+1);
		System.out.println(num2+1);
		System.out.println(num3+1);
		System.out.println("**********************************");
		System.out.println(String.valueOf(bo1)+1);
		System.out.println(String.valueOf(ch1)+1);
		System.out.println(String.valueOf(num1)+1);
		System.out.println(String.valueOf(num2)+1);
		System.out.println(String.valueOf(num3)+1);
		System.out.println("**********************************");
		System.out.println(bo1+""+1); 
		System.out.println(ch1+""+1);
		System.out.println(num1+""+1);
		System.out.println(num2+""+1);
		System.out.println(num3+""+1);
		System.out.println("========================");
		
	//	22. Wrapper Class
	//		기본자료형의 형태를 가진 문자열을 해당 자료형으로 변경시키는 클래스들
	//	22-1) "true" , "false" => true , false  : boolean.parseBoolean()
	//		문자형 논리형을 논리로 바꿔준다
		String msg = "true";
		boolean msg2 = Boolean.parseBoolean(msg);
		System.out.println(msg);   // "true"
		System.out.println(msg2);  // true
		if (msg2) {
			System.out.println("msg2: 변경1");
		} else {
			System.out.println("변경2");
		}
		
	//	22-2) "142", "25" = 142, 25 => Integer.parseInt()  
	//	문자형 숫자를 숫자로 바꿔준다
		msg = "142";
		int msg3 = Integer.parseInt(msg);
		System.out.println(msg+10);   //14210
		System.out.println(msg3+10);  //152
		
	//	22-3) "123213", "3423423" => 123213 , 3423423 => Long.parseLong()
	//		"숫자" => ok , "숫자L" => err
	//	msg="12321321321321L";     //에러남 "L" 붙이면 안됨
		msg="12321321321321";
		long msg4 = Long.parseLong(msg);
		System.out.println(msg+9);   //123213213213219
		System.out.println(msg4+9);  //12321321321330
		
	//	22-4) "347.457" => 347.457 => Double.parseDouble()
		msg = "347.457";
		double msg5 = Double.parseDouble(msg);
		System.out.println(msg+0.04);   //347.4570.04
		System.out.println(msg5+0.04);  //347.497
		
		msg = "347.457f";   //float는 "f"붙여도 변환됨
		System.out.println(msg+0.04);   
		System.out.println(msg5+0.04); 
		
	//	22-5) Character.parseCharacter()는 존재하지 않는다.
	//		 String의 charAt() 이용하면 char를 가져올수 있다.
		msg = "P";
		char msg6 = msg.charAt(0);
		System.out.println(msg6);
		System.out.println("========================");
		
		//////////////////////////////////////////////////
		msg = "java 자바 JAVA 大韓민국 2023 %*";
	//	String.getBytes() => byte[] (영문자 대/소문자, 숫자 및 일부 특수문자만 가능=> 처리속도 빠름)
		byte[] result = msg.getBytes();    //숫자로 인덱스에 저장됨
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]+" : "+(char)(result[i]));
		}
		System.out.println("**********************************");
	//	String.toCharArray() => char[] 모든 문자 처리 가능
		char[] result2 = msg.toCharArray();
		for (int i = 0; i < result2.length; i++) {
			System.out.println(result2[i]);
		}
	}
}
