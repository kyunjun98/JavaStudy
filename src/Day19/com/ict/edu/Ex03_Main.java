package Day19.com.ict.edu;

public class Ex03_Main {
	public static void main(String[] args) {
		System.out.println("스레드이름: " + Thread.currentThread().getName());

		Ex03_Cat cat = new Ex03_Cat();
		Ex03_Dog dog = new Ex03_Dog();

		// Runnable은 start 메소드를 가지고 있지 않으므로 오류발생
		// cat.start();

		Thread thread = new Thread(dog);
		thread.start();

//		Thread thread2 = new Thread(cat);
//		thread2.start();

		// 익명
		new Thread(cat).start();

		// 익명: new 클래스(인터페이스 i);
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					System.out.println("aaaaaaa~" + Thread.currentThread().getName());
				}
			}
		}).start();;
		System.out.println("스레드이름: " + Thread.currentThread().getName());
	}
}
