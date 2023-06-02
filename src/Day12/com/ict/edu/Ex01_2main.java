package Day12.com.ict.edu;

import java.util.Scanner;

public class Ex01_2main {
	public static void main(String[] args) {
		// 음료수 종류, 가격

		Ex01_2method coffee = new Ex01_2method();
		coffee.name = "아아";
		coffee.price = 1000;

		Ex01_2method ion = new Ex01_2method();
		ion.name = "이온음료";
		ion.price = 1100;

		Ex01_2method co = new Ex01_2method();
		co.name = "탄산";
		co.price = 1200;

		Ex01_2method ju = new Ex01_2method();
		ju.name = "주스";
		ju.price = 1300;

		Ex01_2method[] arr = { coffee, ion, co, ju };

		Scanner sc = new Scanner(System.in);
		System.out.print("금액: ");
		int money = sc.nextInt();

		// 음료들의 최소금액을 구하자(오름차순에서 맨 처음 최소값, 맨 끝이 최대값)

		if (money < 1000) {
			System.out.println("최소입금금액 부족");
			System.out.println("잔돈: money");
		} else {
			System.out.println("커피\t이온\t탄산\t주스");
		}
		for (int i = 0; i < arr.length; i++) {
			if (money > arr[i].price) {
				System.out.print("o\t");
			} else
				System.out.print("x\t");
		}

		System.out.println();

		esc: while (money>=1000) {
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
				System.out.println(money);
				continue;
			case 2:
				money = ion.setGae(money);
				System.out.println(money);
				continue;
			case 3:
				money = co.setGae(money);
				System.out.println(money);
				continue;
			case 4:
				money = ju.setGae(money);
				System.out.println(money);
				continue;
			case 5:
				System.out.println("잔돈: " + money);
				break esc;
			}
		}
	}
}
