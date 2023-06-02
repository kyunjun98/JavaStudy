package Day05.com.ict.edu;

public class Ex01_switch {

	public static void main(String[] args) {
		/*
		 * switch ~ case : 다중 if~else문과 같은 조건문 차이점은 if문의 조건식은 boolean, 비교연산, 논리연산 즉
		 * true, false 일 때 사용 switch문은 int, char, String 일 때 사용(long, float, double은
		 * 사용불가) 형식) switch(인자값 = int, char, String) { case 조건값1: 인자값과 조건값1이 같을 때 수행할
		 * 문장; break; {} 할 필요없이 계속 이어서 수행문 주면 됨 case 조건값2: 인자값과 조건값2이 같을 때 수행할 문장; 인자값과
		 * 조건값2이 같을 때 수행할 문장; break;
		 * 
		 * default : 조건값 1,2 모두 같지 않을 때(나머지) 수행할 문장; 주의사항: break가 없으면 break를 만날때 까지 모든
		 * 실행문을 시행한다. break의 역할은 실행중인 범위 ({ }=블록)를 벗어나는 역할을 한다. default는 생략 가능하다. }
		 */

		// k1이 1이면 카페모카, 2이면 카페라떼, 3이면 아메리카며, 4이면 과일쥬스를 출력하자

		int k1 = 3;
		String res = " ";

		switch (k1) {
		case 1:
			res = "카페모카";
			break;
		case 2:
			res = "카페라떼";
			break;
		case 3:
			res = "아메리카노";
			break;
		case 4:
			res = "과일쥬스";
			break;
		}
		System.out.println("선택한 메뉴: " + res);
		System.out.println("=============================");

		// break문이 없을 때: 다음 break를 만날때까지 다음 수행을 실행한다.
		int k2 = 2;
		switch (k2) {
		case 1:
			System.out.println("선택한 메뉴: 카페모카");
		case 2:
			System.out.println("선택한 메뉴: 카페라떼");
		case 3:
			System.out.println("선택한 메뉴: 아메리카노");
		case 4:
			System.out.println("선택한 메뉴: 과일쥬스");
		}
		System.out.println("=============================");

		// k3이 A,a이면 아프리카, B,b이면 브라질, C,c이면 캐나다, 나머지 한국
		char k3 = 'b';
		switch (k3) {
		case 'A':
		case 'a':
			res = "아프리카";
			break;
		case 'B':
		case 'b':
			res = "브라질";
			break;
		case 'C':
		case 'c':
			res = "캐나다";
			break;
		default:
			res = "한국";
			break;
		}
		System.out.println("선택한 나라: " + res);
		System.out.println("=============================");

		//k4가 한국이면 서울, 중국이면 베이징, 일본이면 도쿄
		String k4 = "한국";
		switch (k4) {
			case "한국":
				res = "서울";
				break;
			case "중국":
				res = "베이징";
				break;
			case "일본":
				res = "도쿄";
				break;
		}
		System.out.println("선택한 수도: " + res);
		System.out.println("=============================");

		//k5가 3~5이면 봄, 6~8이면 여름, 9~11이면 가을, 12~2이면 겨울
		int k5 = 1;
		//나누었을때 몫의 따라 구분함
		switch(k5/3) {
		case 1: 
			res = "봄";
			break;
		case 2:
			res = "여름";
			break;
		case 3:
			res = "가을";
			break;
		case 0:
		case 4:
			res ="겨울";
			break;
		}
		System.out.println("선택한 계절: " + res);
		System.out.println("=============================");
		
		//switch에서 범위가 넓어지면 사용하지 말자(if문 사용하자)
		//k6의 점수가 90점이상이면 A학점, 80점이상이면 B학점, 70점이상이면 C학점, 나머지 F학점
		int k6 = 87;
		switch(k6/10) {
			case 10:
			case 9:
				res = "A학점";
				break;
			case 8: 
				res = "B학점";
				break;
			case 7:
				res = "C학점";
				break;
			default : 
				res = "F학점";
		}
		System.out.println("학점: " + res);
	}
}
