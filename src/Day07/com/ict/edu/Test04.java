package Day07.com.ict.edu;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//a,b 수를 받아서 1.더하기, 2.빼기, 3.곱하기, 4.나누기 (결과는 double)
		System.out.print("첫번째 수: ");
		int s1 = sc.nextInt();
		
		System.out.print("두번째 수: ");
		int s2 = sc.nextInt();

		System.out.print("연산자선택: \n1.더하기 \n2.빼기 \n3.곱하기 \n4.나누기 \n >>>>>> ");
		int sel = sc.nextInt();
		
		double res = 0.0;
		if(sel==1) res = s1+s2;
		else if(sel==2) res = s1-s2;
		else if(sel==3) res = s1*s2;
		else if(sel==4) res = (int)(s1*10/s2)/10.0;
		else System.out.println("다시입력해");
		System.out.println(res);
	}
}
