package Day12.com.ict.edu;

public class Ex01_2method {
	String name = "";
	int price = 0;
	int money = 0;

	public int setGae(int money) {
		if (money > price) {
			this.money = money - price;
		} else {
			System.out.println("금액 부족");
		}
		return this.money;
	}

}
