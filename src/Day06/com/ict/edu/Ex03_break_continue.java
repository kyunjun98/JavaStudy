package Day06.com.ict.edu;

public class Ex03_break_continue {
	public static void main(String[] args) {
		/* break와 continue
		 * break: 현재 위치의 블록을 탈출하는 예약어
		 * continue: continue문을 만나면 아래 수행문을 포기하고 다음회차를 하기 위해서 증감식으로 이동
		 * 보통 if문과 함께 사용한다.
		 * break는 for문과 while문에서 모두 사용, continue는 while문에서도 사용가능하지만 for문에 사용할것(무한루프 돌수도있음)
		 */
		
		//1~10 출력 중 6일때 break문 사용 - 1
		for(int i=1; i<=10; i++) {
			if(i==6) break; //i가 6일때 break문을 만나서 다음 실행문을 포기하고 for문을 벗어남
			System.out.print(i + " ");
		}
		System.out.println("\n===============");
		
		//1~10 출력 중 6일때 break문 사용 - 2
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
			if(i==6) break;
		}
		System.out.println("\n===============");
		
		//1~10 출력 중 6일때 continue문 사용 - 1
		for(int i=1; i<=10; i++) {
			if(i==6) continue; //i가 6일때 continue문을 만나서 다음 실행문을 포기하고 증감식으로 바로감
			System.out.print(i + " ");
		}
		System.out.println("\n===============");
		
		//1~10 출력 중 6일때 continue문 사용 - 2
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
			if(i==6) continue;
		}
		System.out.println("\n===============");
		
		//1~10 홀수출력 (continue문 사용)
		for(int i=1; i<=10; i++) {
			if(i%2==0) continue;
			System.out.print(i + " ");
		}
		System.out.println("\n===============");
	}
}
