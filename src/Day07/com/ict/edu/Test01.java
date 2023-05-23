package Day07.com.ict.edu;

public class Test01 {
	public static void main(String[] args) {
		//1. 1 + (-2) + 3 + (-4) + ....  +9 + (-10) 누적합
		int sum=0;
		for(int i=1; i<11; i++) {
			if(i%2==0) {
				sum += -i;
			} else sum += i;
		}
		System.out.println(sum);
		System.out.println("======================");
		
		//2. 농구공 5개씩 한박스에 들어간다 40개면 8박스, 26개면 6개이다.
		//k1이 127개이다. 몇박스가 필요할까?
		int k1 = 127;
		int res = k1/5;
		if(k1%5!=0) res += 1;
		
		System.out.println(res);
		System.out.println("======================");
		
		//3. for문으로 풀기
		//0000
		//0000
		//0000
		//0000
		
		//3-1.
		for(int i= 0; i<4; i++) {
			System.out.println("0 0 0 0");
		}
		System.out.println("======================");
		
		//3-2.
		for(int i =1; i<17; i++) {
			System.out.print("0 ");
			if(i%4==0) System.out.println();
		}
		System.out.println("======================");
		
		//4. 이중for문으로 풀기
		//1000 1x1
		//0100 2x2 
		//0010 3x3
		//0001 4x4
		for(int i =0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(i==j) System.out.print("1 "); 
				else System.out.print("0 ");
				
			}
			System.out.println();
		}
		System.out.println("======================");
		
		//5. 1 + (-2) + 3 + (-4) + .... 과 같은식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
		//for문을 이용한 누적합, if else 사용
		int sum2= 0;
		int cnt = 0;
		while(true) {
			if(cnt%2==0) sum2 += -cnt;
			else sum2 += cnt;
			
			if(sum2==100) break;
			cnt++;
		}
		System.out.println(cnt);	
		System.out.println("======================");
		
		//6.
		//*000 
		//**00 
		//***0 
		//**** 
		
		//6-1.
		for(int i=1; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("======================");
		
		//6-2.
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print("*");
				if(i==j) break;
			}
			System.out.println();
		}
		//7.
		//   *
		//  **
		// ***
		//****
		
		//7-1.
		for(int i =1; i<5; i++) {
			for(int j=4;j>0; j--) {
				if(i<j) System.out.print(" ");
				else System.out.print("*");
			}System.out.println();
		}
	}
}
