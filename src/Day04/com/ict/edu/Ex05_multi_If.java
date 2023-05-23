package Day04.com.ict.edu;

public class Ex05_multi_If {
	public static void main(String[] args) {
		//다중 if문
		//형식은 if(조건식1) {
		//			조건식1이 true일때 실행할 문장;
		//			조건식1이 true일때 실행할 문장;
		//		}	else if(조건식2) {
		//				조건식1이 false이고 조건식2 true일때 실행할 문장;
		//				조건식1이 false이고 조건식2 true일때 실행할 문장;
		//			}
		//			else if(조건식3) {
		//				조건식1, 조건식2 false이고 조건식3 true일때 실행할 문장;
		//				조건식1, 조건식2 false이고 조건식3 true일때 실행할 문장;
		//			} else {
		//				조건식1, 2, 3 모두 false일때 실행할 문장;
		//			}
		
		//k1의 점수가 90점이상이면 A학점, 80점이상이면 B학점, 70점 이상이면 C학점, 나머지는 F학점
		int k1 = 30;
		
		if(k1 >= 90) {
			System.out.println("A학점");
		} else if(k1>=80) {
			System.out.println("B학점");
		} else if(k1>=70) {
			System.out.println("C학점");
		} else {
			System.out.println("F학점");
		}
		
		//k2가 대문자인지, 소문자인지, 숫자인지, 기타문자인지 판별하자.
		char k2 = '4'; //''넣으면 문자 그자체를 뜻하고 없으면 아스키코드로 변환됨
		if(k2 >= 'A' && k2 <= 'Z') {
			System.out.println("대문자입니다.");
		} else if (k2 >= 'a' && k2 <= 'z') {
			System.out.println("소문자입니다.");
		} else if (k2 >= '0' && k2 <= '9' ) {
			System.out.println("숫자입니다."); 
		} else {
			System.out.println("기타문자입니다.");
		}
		
		//k3가 A,a 이면 아프리카, B,b이면 브라질, C,c 이면 캐나다, 나머지는 한국
		char k3 = 'c';
		if(k3 == 'A' || k3 == 'a') {
			System.out.println("아프리카");
		} else if (k3 == 'B' || k3 == 'b') {
			System.out.println("브라질");
		} else if (k3 == 'C' || k3 == 'c') {
			System.out.println("캐나다");
		} else {
			System.out.println("한국");
		}
		
		//menu가 1이면 카메모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000,
		//4이면 과일쥬스 3500이다. 친구와 2잔을 10000을 내고 먹었다.
		//잔돈은 얼마인가? (부가세 10% 포함), 친구와 같은 음료만 선택 가능
		int cafeMoca = 3500; //카페모카 가격
		int cafeLatte = 4000; //카페라떼 가격
		int americano = 3000; //아메리카노 가격
		int fruitJuice = 3500; //과일쥬스 가격
		double tax = 1.1; //부가세
		int money = 10000; //현재가지고 있는돈
		int people = 2; //사람 수

		int menu = 2; //사용자가 선택한 메뉴
		
		if(menu == 1) {
			money -= (int)(cafeMoca*people*tax);
		} else if(menu == 2) {
			money -= (int)(cafeLatte*people*tax);
		}else if(menu == 3) {
			money -= (int)(americano*people*tax);
		}else if(menu == 4) {
			money -= (int)(fruitJuice*people*tax);
		} else {
			System.out.println("1~4번 입력하세요");
		}
		System.out.println(money); //잔돈
	}
}
