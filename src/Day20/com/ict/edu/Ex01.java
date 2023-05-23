package Day20.com.ict.edu;
//join(): 현재 스레드는 join()을 호출한 스레드가 끝날때까지
//		   대기상태로 빠져있다가 join()을 호출한 스레드가 끝나면 다시 실행한다.
//		   즉 join()을 호출한 스레드가 끝나야 실행 할 수 있다.

public class Ex01 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("Run: " + Thread.currentThread().getName());
		}
		sound();
	}
	
	public void sound() {
		for (int i = 0; i < 20; i++) {
			System.out.println("Sound: " + Thread.currentThread().getName());
		}
	}
	
}
