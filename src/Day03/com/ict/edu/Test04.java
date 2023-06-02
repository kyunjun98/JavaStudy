package Day03.com.ict.edu;

public class Test04 {
	public static void main(String[] args) {
		//카페모카가 6500이다.
		//친구와 둘이서 15000을 내고 주문했다.
		//잔돈은 얼마인가(단, 부가세 10% 포함)
		
		//공통 변수
		int moca = 6500;
		int money = 15000;
		int number = 2;
		
		//첫번째 방법
		double pay = 1.1 * moca * number;
		money -= (int)pay;
		System.out.println("잔돈은 " + money);
		
		//두번째 방법 (부가세를 계산식안에 넣음)
		money = 15000;
		money -= (int)(1.1 * moca)*number;
		System.out.println("잔돈은 " + money);
	}
}
