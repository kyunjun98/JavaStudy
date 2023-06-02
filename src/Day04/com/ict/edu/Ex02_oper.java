package Day04.com.ict.edu;

public class Ex02_oper {

	public static void main(String[] args) {
		//중첩 삼항 연산자: 삼항 연산자가 중첩되는 것
		//형식) 자료형 변수이름 = (조건식1) ? true : false
		//형식) 자료형 변수이름 = (조건식1) ? (true ? (true의 조건식이 true) : (true의 조건식이 false)) : (false ? (false의 조건식이 true) : (false의 조건식이 false)) ;

		//int k1이 90점이면 "A"학점, 80점이면 "B"학점, 나머지는 "F"학점
		
		int k1 = 94;
		String str = "F";
		
		str = (k1 >= 90) ? "A" : ((k1>=80) ? "B" : "F");
		System.out.println(str + "학점");
		
		//char k2가 대문자인지, 소문자인지, 기타문자인지 판별하자
		char k2 = 60;
		
		str = ('A'<=k2 && k2<='Z') ? "대문자입니다." : ('a'<=k2 && k2<='z') ? "소문자입니다." : (k2<=127) ? "기타문자입니다.": "입력값이 올바르지 않습니다.";
		System.out.println(str);
		
		//int k3이 1 또는 3이면 남자, 2 또는 4이면 여자
		//1 또는 2 1900년대 태어남, 3 또는 4 2000년 태어남, 나머지는 외국인
		
		int k3 = 5;
		str = (k3 == 1 || k3 == 3) ? ((k3 == 1)? "1900년대 남자" : "2000년대 남자") : (k3 == 2 || k3 == 4) ? ((k3 == 2)? "1900년대 여자" : "2000년대 여자") : "외국인";
		System.out.println(str);
	}

}
