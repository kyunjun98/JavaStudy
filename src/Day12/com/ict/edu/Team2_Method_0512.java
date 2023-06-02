package Day12.com.ict.edu;

public class Team2_Method_0512 {
	String name = "";
	int price = 0;
	int money = 0;

	public int setGae(int money) {
		if (money >= price) {
			money = money - price;
		} else {
			System.out.println("금액이 부족합니다.(o표시만 구매가능)");
		}
		return money;
	}

	
}
