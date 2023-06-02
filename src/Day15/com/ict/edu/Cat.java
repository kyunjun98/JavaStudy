package Day15.com.ict.edu;

public class Cat extends Animal {
	String color = "삼색이";

	public void play() {
		System.out.println("창밖을 바라본다.");
	}

	@Override
	public void sound() {
		System.out.println("나ㅣㅏ야ㅕ여여여야야야");
	}
	//부모클래스의 해당 메서드 final이 있으면 오버라이딩 안됨
	//재정의만 안되고 메소드 사용은 가능함
//	@Override
//	public void sleep() {
//		System.out.println("12시간 잔다");
//	}
}
