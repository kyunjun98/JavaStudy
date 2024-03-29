package Day17.com.ict.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

// finally: 예외처리와 상관없이 반드시 실행 해야 되는 문장을 처리할 때 사용
//			주로 데이터베이스, 입/출력, 네트워크에서 사용
// 형식: try {
//			예외 발생 가능한 문장들;
//			예외가 발생된 문장; >> 예외가 발생되면 아래 문장들은 무시하고, catch문으로 이동한다.
//			예외 발생 가능한 문장들;
//		} catch(발생한 예외객체 e) {
//			예외 발생시 처리하는 문장;
//		} catch(발생한 예외객체 e) {
//			예외 발생시 처리하는 문장;
//		} finally {
//			반드시 실행 해야 되는 문장;
//		}
public class Ex03_Exception {
	public static void main(String[] args) {
		// finally 실행문이랑 마지막 수고하셨습니다랑 차이가 무엇인지?
		// return을 하면 JVM으로 되돌아 가야하는데 finally를 실행하고 되돌아 간다.
		Scanner scan = new Scanner(System.in);
		try {
			int su1 = 50;
			System.out.println("정수입력: ");
			int su2 = scan.nextInt();
			System.out.println("정답: " + (su1 / su2));
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력하세요.");
			return;
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		} finally {
			System.out.println("반드시 수행되는 문장");
			scan.close();
		}
		System.out.println("수고하셨습니다.");
	}
}
