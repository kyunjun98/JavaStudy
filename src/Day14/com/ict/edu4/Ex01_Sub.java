package Day14.com.ict.edu4;

public class Ex01_Sub extends Ex01_Super {
	int weight = 35;
	
	public void hobby() {
		System.out.println("잠자기");
	}
	
	@Override
	public void sound() {
		System.out.println("음악소리");
	}
}
