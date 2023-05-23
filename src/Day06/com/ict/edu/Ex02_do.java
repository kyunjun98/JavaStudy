package Day06.com.ict.edu;

public class Ex02_do {
	public static void main(String[] args) {
		/*do ~while문 : while문과 같은 반복문
		 * 				단, 먼저 실행 후 조건식이 붙는다.
		 * 형식) 초기식;
		 * 		do {
		 *			실행문;
		 *			증감식;
		 *		} while(조건식);
		 */
		// 0~10 출력
		int i =0;
		do {
			System.out.print(i + " ");
			i++;
		} while(i<=10);
		System.out.println("\n===============");
		
		//1~10 홀수만 출력
		i =1;
		do {
			System.out.print(i + " ");
			i+=2;
		} while(i<=10);
		System.out.println("\n===============");
		
		//7단 출력
		i = 1;
		do {
			System.out.println("7*" + i + "=" + 7*i);
			i++;
		} while(i<=9);
		System.out.println("===============");
		
		//0~10 홀수만 누적합
		i = 1;
		int sum = 0;
		do {
			sum += i;
			i+= 2;
		} while(i<=10);
		System.out.println("1~10 홀수 누적합: " + sum);
		System.out.println("===============");
	}
}
