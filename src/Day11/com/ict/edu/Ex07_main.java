package Day11.com.ict.edu;

import java.util.Scanner;

public class Ex07_main {
	public static void main(String[] args) {
		// 5명의 이름, 국어, 영어, 수학을 입력 받아서
		// 이름, 총점, 평균, 학점, 순위를 구하고
		// 순위를 기준으로 오름차순 정렬해서 출력 하자

		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] hak = new String[5];

		Ex07_method sys = new Ex07_method();
		// 입력받기
		for (int i = 0; i < 5; i++) {

			Scanner sc = new Scanner(System.in);
			System.out.print("이름: ");
			name[i] = sc.next();
			System.out.print("국어: ");
			kor[i] = sc.nextInt();
			System.out.print("영어: ");
			eng[i] = sc.nextInt();
			System.out.print("수학: ");
			math[i] = sc.nextInt();

			sys.getSum(kor[i], eng[i], math[i]);
			sum[i] = sys.sum;

			sys.getAvg(sys.sum);
			avg[i] = sys.avg;

			sys.getHak(sys.avg);
			hak[i] = sys.hak;
		}
		System.out.println("이름\t총점\t평균\t학점");
		for (int i = 0; i < 5; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.print(hak[i] + "\t");
			System.out.println();
		}
	}
}
