package Day12.com.ict.edu;

import java.util.Scanner;

public class Ex03_main {
	public static void main(String[] args) {
		Ex03_method coffee = new Ex03_method();
		coffee.setName("아아");
		coffee.setPrice(1000);
		
		Ex03_method ion = new Ex03_method();
		ion.setName("이온음료");
		ion.setPrice(1000);
		
		Ex03_method co = new Ex03_method();
		co.setName("콜라");
		co.setPrice(1000);
		
		Ex03_method ju = new Ex03_method();
		ju.setName("주스");
		ju.setPrice(1000);

		Ex03_method[] arr = { coffee, ion, co, ju };

		Scanner sc = new Scanner(System.in);
		System.out.print("금액: ");
		int money = sc.nextInt();
		
		if (money < 1000) {
			System.out.println("최소입금금액 부족");
			System.out.println("잔돈: " + money);
		} else {
			System.out.println("커피\t이온\t탄산\t주스");
		}
		for (int i = 0; i < arr.length; i++) {
			if (money > arr[i].getPrice()) {
				System.out.print("o\t");
			} else
				System.out.print("x\t");
		}
		

		System.out.println();
		
		esc:
		while (money >= 1000) {
			System.out.print("선택하세요");
			System.out.print("1. 커피1000\t");
			System.out.print("2. 이온1100\t");
			System.out.print("3. 탄산1200\t");
			System.out.print("4. 주스1300\t");
			System.out.print("5. 구매하지 않음\n");
			int drink = sc.nextInt();
			switch (drink) {
			case 1:
				if (money > arr[0].getPrice()) {
					money -= arr[0].getPrice();
					System.out.println("잔돈: " + money);
					continue;
				}
			case 2:
				if (money > arr[1].getPrice()) {
					money -= arr[1].getPrice();
					System.out.println("잔돈: " + money);
					continue;
				} 
			case 3:
				if (money > arr[2].getPrice()) {
					money -= arr[2].getPrice();
					System.out.println("잔돈: " + money);
					continue;
				} 
			case 4:
				if (money > arr[3].getPrice()) {
					money -= arr[3].getPrice();
					System.out.println("잔돈: " + money);
					continue;
				} 
				
			case 5: System.out.println("잔돈: " + money);break esc;
			}
		}
	}
}
