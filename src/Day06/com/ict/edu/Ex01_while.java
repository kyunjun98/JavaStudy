package Day06.com.ict.edu;

public class Ex01_while {
	public static void main(String[] args) {
		//구구단-1
		int i = 2;
		while(i<10) {
			int j = 1;
			while(j<10) {
				System.out.println(i + "*" + j + "=" + i*j + "\t");
				j++;
			}
			i++;
		} 
		System.out.println("===========================================================");
		
		//구구단-2
		i = 1;
		while(i<10) {
			int j = 2;
			while(j<10) {
				System.out.print(j + "*" + i + "=" + i*j + "\t");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("===========================================================");
		
		//구구단-3
		i = 1;
		while(i<10) {
			int j = 2;
			while(j<10) {
				System.out.print(j + "*" + i + "=" + i*j + "\t");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
