package Day20.com.ict.edu.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test_Exception {
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		while (true) {
			try {
				int su1 = 50;
				System.out.println("정수입력: ");
				int su2 = scan.nextInt();
				System.out.println("정답: " + (su1 / su2));
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요.");
				scan.nextLine(); // 숫자입력후 엔터를 치면 엔터가 메모리에 남아서 무한루프가 돌음
									// 따라서 nextLine으로 엔터값을 없앰
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
		}
	}
}
