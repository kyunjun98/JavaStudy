package Day16.com.ict.edu;

public class Ex05_Local_Main {
	public static void main(String[] args) {
		// 내부클래스를 별도로 객체 생성할 수 없다.(static은 제외)
		// Dog test = new Dog();

		Ex05_Local_InnerClass test = new Ex05_Local_InnerClass();
		// Member 내부클래스 만드는 방식으로도 사용 불가
		// Ex05_Local_InnerClass.Inner02 exam = test.new Inner02();

		// 메서드안에 있으므로 메서드를 시행해서 내부클래스를 생성할 수 있다.
		test.play();
		// 메서드가 끝나면 내부클래스도 사라진다. 
		// 내부클래스 끝에 이걸 추가하면 된다(외부클래스 메서드 끝나기 전)
		//Dog dog = new Dog();
		//dog.prn();
	}
}
