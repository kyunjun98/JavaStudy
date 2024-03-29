package Day16.com.ict.edu;

//추상클래스: 추상메서드를 하나이상 가지고 있는 클래스

abstract class Abc {
	int data = 1000;

	public abstract void printData();
}

class AbcTest extends Abc {
	@Override
	public void printData() {
		System.out.println("data1: " + data);
	}
}

class AbcTest2 {
	// 상속받지 않고 바로 객체 생성
	Abc abc = new Abc() {
		@Override
		public void printData() {
			System.out.println("data2: " + data);
		}
	};
}

class AbcTest3 {
	// 메서드나 메서드 인자에 사용된다.
	public void prn() {
		new Abc() {
			@Override
			public void printData() {
				System.out.println("data3: " + data);
			}
		}.printData(); // Abc() 메서드가 끝나면서 호출

	}
}

public class Ex05_Anonymous_InerrClass {
	public static void main(String[] args) {
		AbcTest t1 = new AbcTest();
		t1.printData();
		
		AbcTest2 t2 = new AbcTest2();
		t2.abc.printData();

		AbcTest3 t3 = new AbcTest3();
		t3.prn();
	}
}
