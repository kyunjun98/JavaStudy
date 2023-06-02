package Day05.com.ict.edu;

public class Ex03_for {
	public static void main(String[] args) {
		for(int i=1; i<4; i++) {
			System.out.println("실행문" + i);
			for(int j=1; j<6; j++) {
				System.out.println("실행문" + i+ "-" + j);
			} //안쪽 for문 끝
			System.out.println("실행문" + i);
		} //바깥쪽 for문 끝
		System.out.println("=====================================================================");
		
		//x단을 옆으로 출력하고 단이 바뀌면 밑에서 출력
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}
		System.out.println("=====================================================================");
		
		//같은 단을 밑으로 출력하고 다른단은 옆으로 출력
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j + "*" + i + "=" +j*i + "\t");
			}
			System.out.println();
		}
	}
}
