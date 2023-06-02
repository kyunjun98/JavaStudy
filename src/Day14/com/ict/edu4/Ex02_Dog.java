package Day14.com.ict.edu4;

public class Ex02_Dog extends Ex02_Animal{
	String color = "블랙";
	
	@Override
	public void sound() {
		System.out.println("왈왈");
	}
	
	public void play() {
		System.out.println("잔디에서 뛰어 놀기");
	}
}
