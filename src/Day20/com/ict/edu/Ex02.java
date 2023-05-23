package Day20.com.ict.edu;
// 임계영역: 멀티 스레드에서 공통으로 사용되는 영역
//	       현재 실행중인 스레드가 다른 스레드에게 제어권을 빼앗긴다.
//	  	   이러한 경우 실시간 처리에서는 문제가 발생 할 수 있다.(티켓팅)
//	       이를 해결하기 위한 방법이 동기화 처리이다.

// 동기화 처리: 임계영역에 synchronized 예약어를 사용함으로써
//		  	  현재 실행 중인 스레드가 끝날때까지 다른 스레드 접글 불가

public class Ex02 implements Runnable {
	int x = 0;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(++x + ": " + Thread.currentThread().getName());
		}
	}
}
