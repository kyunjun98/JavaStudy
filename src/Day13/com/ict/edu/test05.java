package Day13.com.ict.edu;

public class test05 {
	public static void main(String[] args) {
		int[][] su = new int[3][];
		int[] k1 = {10,20,30};
		int[] k2 = {100,200};
		int[] k3 = {1000,2000,3000,4000};
		su[0] = k1;
		su[1] = k2;
		su[2] = k3;
		
		for(int i=0; i<su.length; i++) {
			for(int j=0; j<su[i].length; j++) {
				System.out.print(su[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
