package Day14.com.ict.edu;

//자식클래스에서 부모클래스를 선택해서 상속관게를 맺는다
//상속관계: 자식클래스가 부모클래스의 멤버필드와 멤버메서드를
//		  마음대로 사용할 수 있는 클래스 간의 관계
//	 형식: class 자식클래스명 extends 부모클래스명
//	 특징: 모든 클래스는 하나의 부모클래스를 갖는다.
//	 	  부모클래스가 없으면 Object가 부모클래스이다.
//		  다중 상속을 지원하지 않는다.(즉, 자식클래스는 부모클래스가 하나만 존재한다)
//		  다이얼그램에서는 Aㅡ▷B 클래스A는 자식클래스, 클래스B는 부모클래스
public class Ex03_Sub extends Ex03_Super {
	String name = "홍반장";
	int age = 13;
	double weight = 78.9;
	private String cat = "야옹";

	static String computer = "10세대";
	
	public Ex03_Sub() {
		System.out.println("자식클래스 생성자: " + this);
	}

	public void paly() {
		// 변수 우선 순위
		// 지역변수 > 전역변수(this) > 부모 클래스 변수(super)
		System.out.println("=======기본=======");
		String name = "홍두께";
		System.out.println(name); // 홍두께
		System.out.println(this.name); // 홍반장
		System.out.println(super.name); // 홍길동
		
		//지역변수가 없고, 전역변수, 부모클래스에게만 있으면
		System.out.println("=======전역변수, 부모클래스에만 있을경우=======");
		System.out.println(weight);
		System.out.println(this.weight);
		
		//지역, 전역변수에 없고 부모클래스에만 있으면 다 쓸 수 있다.
		System.out.println("=======부모클래스에만 있을경우=======");
		System.out.println(addr);
		System.out.println(this.addr);
		System.out.println(super.addr);
		
		//private인 경우
		System.out.println("=======private(주석확인)=======");
		System.out.println(cat);
		//private면 상속관계라도 못쓴다.
		//System.out.println(super.dog);
		
		//static인 경우
		System.out.println("=======static=======");
		System.out.println(computer);
		System.out.println(this.computer);
		System.out.println(Ex03_Sub.playStation); //static은 이방법 권장
		
		System.out.println(playStation);
		System.out.println(this.playStation);
		System.out.println(super.playStation);
		System.out.println(Ex03_Super.playStation); //이방법 권장
	}
}
