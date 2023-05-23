package Day06.com.ict.edu;

public class Ex05_break_continue_label {
	public static void main(String[] args) {
		/* break label: 레이블이 지정한 블록 탈출
		 * continue label: 레이블이 지정한 블록의 증감식으로 이동
		 */
		System.out.println("============기본============");
		for(int i=1; i<=3; i++) {
			System.out.println("11111111");
			for(int j=1; j<=5; j++ ) {
				System.out.println("i= " + i + ", j= " + j);
			}
			System.out.println("22222222");
		}
		
		//label 다음에는 무조건 for문이 와야 된다.
		System.out.println("============i break esc============");
		esc:
		for(int i=1; i<=3; i++) {
			System.out.println("11111111");
			for(int j=1; j<=5; j++ ) {
				if(i==2) break esc;
				System.out.println("i= " + i + ", j= " + j);
			}
			System.out.println("22222222");
		}

		System.out.println("============j break esc============");
		esc:
		for(int i=1; i<=3; i++) {
			System.out.println("11111111");
			for(int j=1; j<=5; j++ ) {
				if(j==2) break esc;
				System.out.println("i= " + i + ", j= " + j);
			}
			System.out.println("22222222");
		}
		
		System.out.println("============i continue esc============");
		esc:
		for(int i=1; i<=3; i++) {
			System.out.println("11111111");
			for(int j=1; j<=5; j++ ) {
				if(i==2) continue esc;
				System.out.println("i= " + i + ", j= " + j);
			}
			System.out.println("22222222");
		}
		
		System.out.println("============j continue esc============");
		esc:
		for(int i=1; i<=3; i++) {
			System.out.println("11111111");
			for(int j=1; j<=5; j++ ) {
				if(j==2) continue esc;
				System.out.println("i= " + i + ", j= " + j);
			}
			System.out.println("22222222");
		}
	}
}
