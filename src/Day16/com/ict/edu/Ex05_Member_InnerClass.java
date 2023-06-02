package Day16.com.ict.edu;

public class Ex05_Member_InnerClass {
	String name = "홍길동";
	private int age = 24;
	static boolean gender = true;

	public Ex05_Member_InnerClass() {
		System.out.println("외부생성자: " + this);
	}

	public void play() {
		int money = 1000;
		System.out.println("외부 메서드: " + name);
		System.out.println("외부 메서드: " + money);
	}

	// 내부클래스

	public class Inner01 {
		String addr = "서울 마포구";
		int roomNumber = 1;

		public Inner01() {
			System.out.println("내부생성자: " + this);
		}

		public void prn() {
			System.out.println(addr);
			System.out.println(roomNumber);

			// 외부클래스의 멤버도 마음대로 사용 가능(private 포함)
			System.out.println(name);
			System.out.println(age);
			System.out.println(gender);
			
			//외부클래스의 메서드
			play();
		}
	}
}
