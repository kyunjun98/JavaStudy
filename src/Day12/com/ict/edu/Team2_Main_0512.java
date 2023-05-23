package Day12.com.ict.edu;

import java.util.Arrays;
import java.util.Scanner;

public class Team2_Main_0512 {
	public static void main(String[] args) {
		
		// 음료수 종류, 가격
		Team2_Method_0512 coffee = new Team2_Method_0512();
		coffee.name = "아아";
		coffee.price = 1000;

		Team2_Method_0512 ion = new Team2_Method_0512();
		ion.name = "이온음료";
		ion.price = 1100;

		Team2_Method_0512 co = new Team2_Method_0512();
		co.name = "탄산";
		co.price = 1200;

		Team2_Method_0512 ju = new Team2_Method_0512();
		ju.name = "주스";
		ju.price = 300;

		Team2_Method_0512[] arr = { coffee, ion, co, ju };

		Scanner sc = new Scanner(System.in);
		System.out.print("금액: ");
		int money = sc.nextInt();

	
		// 음료들의 최소금액을 구하자(오름차순에서 맨 처음 최소값, 맨 끝이 최대값)
		int[] su = {coffee.price, ion.price, co.price, ju.price};
		Arrays.sort(su);
		
		// esc: 5번 구매하지 않을때 while문 벗어남.
		esc: while (true) {
			if (money < su[0]) {
				System.out.println("=======================");
				System.out.println("최소금액이 부족합니다.(" + su[0] + "원)");
				System.out.println("현재금액:" + money);
				System.out.print("추가입금: ");
				money += sc.nextInt();
				continue;
			} else {
				System.out.println("커피\t이온\t탄산\t주스");
				//현재 금액이 구매할수 있는 물품 o/x 체크
				for (int i = 0; i < arr.length; i++) {
					if (money >= arr[i].price) {
						System.out.print("o\t");
					} else
						System.out.print("x\t");
				}

				System.out.println();

				System.out.print("선택하세요");
				System.out.print("1. 커피1000\t");
				System.out.print("2. 이온1100\t");
				System.out.print("3. 탄산1200\t");
				System.out.print("4. 주스1300\t");
				System.out.print("5. 구매하지 않음\n");
				int drink = sc.nextInt();
				
				switch (drink) {
				case 1:
					money = coffee.setGae(money);
					System.out.println("남은금액: " + money);
					continue;
				case 2:
					money = ion.setGae(money);
					System.out.println("남은금액: " + money);
					continue;
				case 3:
					money = co.setGae(money);
					System.out.println("남은금액: " + money);
					continue;
				case 4:
					money = ju.setGae(money);
					System.out.println("남은금액: " + money);
					continue;
				case 5:
					System.out.println("=======================");
					System.out.println("사용을 종료합니다.");
					System.out.println("잔돈: " + money);
					break esc;
				}
			}
		}
	}
}
