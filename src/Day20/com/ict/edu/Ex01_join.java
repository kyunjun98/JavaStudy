package Day20.com.ict.edu;
public class Ex01_join {
	public static void main(String[] args) {
		System.out.println("main: " + Thread.currentThread().getName());
		Ex01 test = new Ex01();
		Thread dog = new Thread(test);
		//dog.setDaemon(true);
		dog.start();
		
		// join 메서드
		try {
			dog.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main: " + Thread.currentThread().getName());
	}
}
