package Day04.com.ict.edu;

public class For_Star {	
	public static void main(String[] args) {
		//4x3 별모양
		for(int i=0; i<3; i++) {
			for(int a=0; a<4; a++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//왼쪽밀착
		for(int b=0; b<5; b++) {
			for(int c = 0; c<b; c++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//오른쪽밀착
		for(int d=0; d<5; d++) {
			for(int f=4; f>0; f--) {
				if(d<f) {
					System.out.print(" ");
				} 
				else { System.out.print("*");
				}
			}
			System.out.println("");
		}
		//피라미드
		for(int g=0; g<4; g++) {
			for(int h=0; h<3-g; h++) {
				System.out.print(" ");
			}
			for(int i=0; i<2*g+1; i++) {
				System.out.print("*");
			}
			for(int j=0; j>3-g; j--) {
				System.out.print(" ");
			}
			System.out.println("");
		}
		
		//다이아몬드
		for(int i = 1; i<10; i+=2) {
			for(int j = 10; i<j; j-=2) {
				System.out.print(" ");
			}
			for(int k = 0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<10; i+=2) {
			for(int j = 0; i>j; j+=2) {
				System.out.print(" ");
			}
			for(int k = 10; k>i; k--) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
