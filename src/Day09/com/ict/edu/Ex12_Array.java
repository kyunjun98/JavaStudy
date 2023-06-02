package Day09.com.ict.edu;

import java.util.Scanner;

public class Ex12_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 인원수 받기
		System.out.print("인원수: ");
		int stu = sc.nextInt();

		double[][] arr = new double[stu][8];
		
		
		// 인원수 만큼 국어, 수학, 영어점수 물어보기 매우중요함
		for (int i = 0; i < stu; i++) {	
			double[] p1 = new double[8];
			p1[0] = i + 1;
			System.out.println(p1[0] + "번 학생");
			System.out.print("국어: ");
			p1[1] = sc.nextInt();
			System.out.print("수학: ");
			p1[2] = sc.nextInt();
			System.out.print("영어: ");
			p1[3] = sc.nextInt();
			
			// 총점, 평균, 학점은 뒤에서 만듦
			p1[4] = p1[1] + p1[2] + p1[3];
			p1[5] = (int) (p1[4] / 3.0 * 10) / 10.0;

			if (p1[5] >= 90)
				p1[6] = 'A';
			else if (p1[5] >= 80)
				p1[6]= 'B';
			else if (p1[5] >= 70)
				p1[6] = 'C';
			else
				p1[6] = 'F';
			
			p1[7] = 1;
			// 안쪽배열이 몇개인지 모르기 때문에 i만큼 안쪽배열 생성
			arr[i] = p1;
		}

		// 순위 구하기
		for (int i = 0; i < stu; i++) {
			for (int j = 0; j < stu; j++) {
				if (arr[i][4] < arr[j][4]) {
					arr[i][7] += 1;
				}
			}
		}

		// 새로운 배열을 만들어 순위를 오름차순으로 정렬
		double[] tem = new double[8];
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i][7] > arr[j][7]) {
					tem = arr[i];
					arr[i] = arr[j];
					arr[j] = tem;
				}
			}
		}

		// 출력
		System.out.println("학번\t총점\t평균\t학점\t순위");
		for (int i = 0; i < stu; i++) {
			for (int j = 0; j < 8; j++) {
				if (j > 3 || j == 0) { // 국, 영, 수 제외
					if (j == 6) { // 학점
						System.out.print((char) (arr[i][j]) + "\t");
					} else if (j == 5) { // 평균
						System.out.print(arr[i][j] + "\t");
					} else // 학번, 총점, 순위
						System.out.print((int) (arr[i][j]) + "\t");
				}
			}
			System.out.println();
		}
	}
}
