package Day06.com.ict.edu;

import java.util.Scanner;

public class Ex03_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//나라를 입력하면 수도가 출력되게 하자
		//한국=>서울, 중국=>베이징, 일본=>도쿄, 미국=>워싱턴 이 외는 데이터 없음
		//switch case 문으로
		System.out.print("국가 입력: ");
		String str = sc.next();
		String str2 = " ";
		switch(str) {
		case "한국" :
			str2 = "서울";
			break;
		case "중국" :
			str2 = "베이징";
			break;
		case "일본" :
			str2 = "도쿄";
			break;
		case "미국" :
			str2 = "워싱턴";
			break;
			default:
				str2 = "데이터 없음";
		} System.out.println(str + "의 수도는 " + str2 + "입니다.");
		System.out.println("=================================");
		
		//근무시간이 8시간까지는 시간당 9620이고
		//8시간을 초과한 시간 만큼은 1.5배 지급한다.
		//현재 근무한 시간은 입력된 값을 받는다.
		//얼마를 받아야 하는가?
		System.out.print("근무 시간: ");
		int work = sc.nextInt();
		int pay = 0;
		int timePay = 9620;
		
		if(work<=8) {
			pay = work * timePay;
		} else {
			pay = timePay*8 + (work-8) * (int)(timePay*1.5);
		}
		System.out.println(pay);
		
		System.out.println("=================================");
		
	      // menu가 1이면 카페모카 3500, 2이면 카페라떼 4000,
        // 3이면 아메리카노 3000, 4이면 과일 쥬스 3500이다.
        // 친구와 함께 2잔을 10000 내고 먹었다.
        // 선택한 메뉴와 잔돈을 출력하자 (단, 부가세 10%는 포함)
        // (친구와 같은 음료을 먹어야 한다.)
         System.out.print("메뉴선택 \n1.카페모카(3500)\n2.카페라떼(4000)"
                 + "\n3.아메리카노(3000)\n4.과일쥬스(3500)\n>>>>>>>>>  ");
         int menu = sc.nextInt();
         int money = 10000;
         String sel = "";
         int qan = 2;
         int dan = 0;
         
			if (menu == 1) {
				dan = 3500;
				sel = "카페모카";
			} else if (menu == 2) {
				dan = 4000;
				sel = "카페라떼";
			} else if (menu == 3) {
				dan = 3000;
				sel = "아메리카노";
			} else if (menu == 4) {
				dan = 3500;
				sel = "과일쥬스";
			}	
			money -= (int)(dan*qan*1.1);
			System.out.println("선택한 메뉴: " + sel + ", 남은 금액: " + money);
	
         }
}
