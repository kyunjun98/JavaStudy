package Day11.com.ict.edu;

public class Ex05_Animal_Once_method {
	String name;
	int age;
	boolean live;

	// 이름 나이 생존여부 한번에 변경하자
	// 인자 순서는 다르지만 들어가는 값은 똑같다. 총6개로 만들수 있음
	public void animal(String x, int y, boolean z) {
		name = x;
		age = y;
		live = z;
	}

	public void animal(int y, String x, boolean z) {
		name = x;
		age = y;
		live = z;
	}

	public void animal(String x, boolean z, int y) {
		name = x;
		age = y;
		live = z;
	}

	public void getAnimal() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(live);
	}
}
