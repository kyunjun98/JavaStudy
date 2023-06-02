package Day14.com.ict.edu3;

public class Ex01_Sub extends Ex01_Super {
	String name = "홍반장";
	int age = 13;
	double weight = 78.4;

	// this(): 자기자신 생성자를 뜻한다.
	// 생성자의 첫번재줄에 있어야 다른 생성자 호출

	// super(): 부모클래스 생성자를 뜻한다.
	// 자식클래스 생성자 첫줄에 부모클래스 생성자가 숨어있다.
	// super에 인자로 따라감
	// 
	public Ex01_Sub() {
		super("ㅇㅇㅇ");
	}

	public Ex01_Sub(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
