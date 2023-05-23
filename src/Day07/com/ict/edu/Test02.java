package Day07.com.ict.edu;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//원하는 횟수를 입력받고 
		// 만큼 숫자를 입력받고 그 숫자가 홀수, 짝수 판별
		
		System.out.print("원하는 횟수: ");
		int su1 = sc.nextInt();
		String res = "";
		for(int i=1; i<=su1; i++) {		
			System.out.print("판별할 숫자: ");
			int num = sc.nextInt();
			if(num%2==0) res = "짝수";
			else res = "홀수";
			System.out.println(res);
		}
	}
}
