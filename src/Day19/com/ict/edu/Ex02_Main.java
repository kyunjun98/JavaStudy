package Day19.com.ict.edu;

public class Ex02_Main {
	public static void main(String[] args) {
		System.out.println("스레드이름: " + Thread.currentThread().getName());
		
		Ex02_Dog dog = new Ex02_Dog();
		Ex02_Cat cat = new Ex02_Cat();
		
		// 멀티스레드: 여러개의 스레드를 만들어서 병렬 처리
		// 스레드 만드는 방법: start()를 호출해서 run()으로 가면 스레드 생성(일꾼 생성)
		// 멀티스레드 사용하려면 start메소드가 없어야함
		dog.start();
		cat.start();
		System.out.println("main: " + Thread.currentThread().getName());
	}
}
