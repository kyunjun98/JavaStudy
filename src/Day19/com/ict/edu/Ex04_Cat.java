package Day19.com.ict.edu;

public class Ex04_Cat implements Runnable {
	@Override
	public void run() {
		while(true) {
			// 3초간 대기
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("야옹 야옹~" + Thread.currentThread().getName());
		}
	}
}
