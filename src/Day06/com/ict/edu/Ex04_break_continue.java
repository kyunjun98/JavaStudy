package Day06.com.ict.edu;

public class Ex04_break_continue {
	public static void main(String[] args) {
		System.out.println("============기본============");
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=5; j++) {
				System.out.println("i= " + i + ", j= " + j);
			}
		}
		System.out.println("============break============");
		
		//i가 2인 것만 빼고 다 출력
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=5; j++) {
				if(i==2) break;
				System.out.println("i= " + i + ", j= " + j);
			}
		}
		System.out.println("============break============");
		
		//i는 1~3 출력되는데 j는 2를 만나는 순간 빠져나와서 j=1만 출력
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=5; j++) {
				if(j==2) break;
				System.out.println("i= " + i + ", j= " + j);
			}
		}
		System.out.println("============continue============");
		
		//i=2 빼고 출력
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=5; j++) {
				if(i==2) continue;
				System.out.println("i= " + i + ", j= " + j);
			}
		}
		System.out.println("============continue============");
		
		
		//j=2 빼고 출력
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=5; j++) {
				if(j==2) continue;
				System.out.println("i= " + i + ", j= " + j);
			}
		}
		System.out.println("=========================");
	}
}
