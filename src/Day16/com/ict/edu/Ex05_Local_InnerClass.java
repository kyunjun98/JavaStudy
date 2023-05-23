package Day16.com.ict.edu;

//Local 내부클래스
public class Ex05_Local_InnerClass {
	String name = "둘리";

	public Ex05_Local_InnerClass() {
		System.out.println("외부생성자: " + this);
	}

	public void sound() {
		String str = "호이~!";
		System.out.println(str);
	}

	public void play() {
		int age = 24;

		// 내부클래스
		class Dog {
			String addr = "서울 용산구";

			public Dog() {
				System.out.println("내부생성자: " + this);
			}

			public void prn() {
				System.out.println(name);
				System.out.println(age);
				System.out.println(addr);
				// System.out.println(str);
			} // 내부메서드 끝
		} // 내부클래스 끝
		Dog dog = new Dog();
		dog.prn();
	}// 외부 클래스 멤버메서드 끝
}
