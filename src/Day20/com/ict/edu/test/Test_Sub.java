package Day20.com.ict.edu.test;

public class Test_Sub extends Test_Super{
	String name = "홍반장";
	
	public void play() {
		String name = "홍두께";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}
}
