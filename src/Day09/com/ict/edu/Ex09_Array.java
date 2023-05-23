package Day09.com.ict.edu;

public class Ex09_Array {
	public static void main(String[] args) {
		//1. 선언과 생성을 한번에 하기
		//자료형[][] 이름 = new 자료형[1차원 배열의 수][1차원배열 안에 존재하는 배열의 크기]
		char[][] ch =new char[4][2];
		
		//고정길이 일때만 가능
		ch[0][0] = 'A';
		ch[0][1] = 'a';
		
		ch[1][0] = 'B';
		ch[1][1] = 'b';
		
		ch[2][0] = 'C';
		ch[2][1] = 'c';
		
		ch[3][0] = 'D';
		ch[3][1] = 'd';
		
		for(int i=0; i<ch.length; i++) {
			for(int j=0; j<ch[i].length; j++) {
				System.out.print(ch[i][j] + " ");
			}
		}
		System.out.println("\n==========================");
		
		//고정길이, 가변길이 모두 사용하는 방법
		int[][] su = new int[3][2];
		int[] k1 = new int[2];
		k1[0] = 10;
		k1[1] = 20;
		int[] k2 = {100,200};
		int[] k3 = {1000,2000};
		su[0] = k1;
		su[1] = k2;
		su[2] = k3;

		for(int i=0; i<su.length; i++) {
			for(int j=0; j<su[i].length; j++) {
				System.out.print(su[i][j] + " ");
			}
		}
		System.out.println("\n==========================");

		//선언, 생성, 초기값 한번에 사용하는 방법
		String[][] str = {{"a","A"}, {"b","B"}, {"c","C"}, {"d","D"}};
		for(int i=0; i<str.length; i++) {
			for(int j=0; j<str[i].length; j++) {
				System.out.print(str[i][j] + " ");
			}
		}
		
	}		
}
