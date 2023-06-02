package Day17.com.ict.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

// 다중catch: 예외가 하나가 아니라 여러가지가 발생할 경우 사용
// 주의사항: Exception을 사용할 경우 반드시 catch문 중에 가장 아래에 사용
// 형식: try {
//			예외 발생 가능한 문장들;
//			예외가 발생된 문장; >> 예외가 발생되면 아래 문장들은 무시하고, catch문으로 이동한다.
//			예외 발생 가능한 문장들;
//		} catch(발생한 예외객체 e) {
//			예외 발생시 처리하는 문장;
//		} catch(발생한 예외객체 e) {
//			예외 발생시 처리하는 문장;
//		}
public class Ex02_Exception {
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
