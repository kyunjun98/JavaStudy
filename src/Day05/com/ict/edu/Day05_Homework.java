package Day05.com.ict.edu;

public class Day05_Homework {
	public static void main(String[] args) {
		//1. if ~ else문
		//농구공 5개씩 한박스에 들어간다 40개면 8박스, 26개면 6개이다.
		//k1이 127개이다. 몇박스가 필요할까?
		int k1 = 101;
		if(k1%5==0) {
			System.out.println("필요한 박스: " + (k1/5));
		} else 
			System.out.println("필요한 박스: " + (k1/5 + 1));
		
		//2. for문으로 풀기(for문 1번만)
		//0000
		//0000
		//0000
		//0000
		k1 = 0;
		for(int i=1; i<=16; i++) {
			System.out.print("0 ");
			if(i%4==0) {
			System.out.println();
			}
		}
		System.out.println("==================");
		
		//
		
		//3. 이중for문으로 풀기
		//1000 1x1
		//0100 2x2 
		//0010 3x3
		//0001 4x4
		for(int i =1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				if(i==j) { //i와 j가 같을때 1출력
					System.out.print("1");
				}else System.out.print("0");
			}
			System.out.println();
		}
		System.out.println("==================");

		
		//4. 1 + (-2) + 3 + (-4) + .... 과 같은식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
		//for문을 이용한 누적합, if else 사용
		int sum = 0;
		int count = 0;
		for(int a=0; sum<100; a++) { //for(int i=1; i<=count; i++) 하고 마지막에 ++count 해서 무한반복
			if(a%2==0) { 
				sum += -a; 		//-2 -4 -6 -8 -10 ... -198
			} else sum += a;	// 1  3  5  7   9 ...  197 199
		count = a;
		} 
		System.out.println("누적합이 100일때 i의 값은: " + count);
		System.out.println("==================");
			
		//5.
		//*000 
		//**00 
		//***0 
		//**** 
		for(int i=1; i<=4; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		System.out.println("==================");
		
		//2번째 방법
		for(int i =1; i<5; i++) {
			for(int j =1; j<5; j++) {
				if(j<=i) { //j-i <= 0
					System.out.print("*");
				} else System.out.print(" ");
			} System.out.println();
		}
		System.out.println("==================");
		
		//6.
		//   *
		//  **
		// ***
		//****
		for(int i=1; i<=4; i++) {
			for(int j=4; j>0; j--) {
				if(i<j) {
					System.out.print(" ");
				} 
				else { System.out.print("*");
				}
			}
			System.out.println("");
		}
		System.out.println("==================");
		
		//2번째 방법 for문만 쓰기
		for(int i=0; i<4; i++) {
			for(int j=2; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*	  000*000
		 	  00***00 i<j
		 	  0*****0
		 	  *******
		 	   *****
		 	    ***
		 	     *
		**/
		for(int i = 1; i<10; i+=2) {
			for(int j = 9; i<j; j-=2) {
				System.out.print("0");
			}
			for(int k = 0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<10; i+=2) {
			for(int j = 0; i>j; j+=2) {
				System.out.print("0");
			}
			for(int k = 8; k>i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==================");
	}
}
