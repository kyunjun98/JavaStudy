package Day09.com.ict.edu;

import java.util.Arrays;

public class Ex11_Array {
	public static void main(String[] args) {
		// p1 => 번호, 총점, 평균, 학점, 순위
		// p2 => 번호, 총점, 평균, 학점, 순위
		// p3 => 번호, 총점, 평균, 학점, 순위
	

		double[][] arr = new double[5][5];
		
		//안쪽 배열 초기값
		double[] p1 = { 1, 270, 90, 'A', 1 };
		double[] p2 = { 2, 210, 70, 'C', 1 };
		double[] p3 = { 3, 180, 60, 'F', 1 };
		double[] p4 = { 4, 300, 100, 'A', 1 };
		double[] p5 = { 5, 285, 95, 'A', 1 };

		//안쪽 배열 주소값을 바깥쪽 배열이랑 연결
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		arr[3] = p4;
		arr[4] = p5;

		//순위 구하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][1] < arr[j][1]) {
					arr[i][4] += 1;
				}
			}
		}
		
		//새로운 배열을 만들어 순위를 오름차순으로 정렬
		double[] tem = new double[5];
		for (int i = 0; i < arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i][4] > arr[j][4]) {
					tem = arr[i];
					arr[i] = arr[j];
					arr[j] = tem;
				}
		}
	}
		
		// 출력
		System.out.println("학번\t총점\t평균\t학점\t순위");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][j]==arr[i][3]) {
					//A,B,C,F로 출력
					System.out.print((char)(arr[i][j]) + "\t");
				} else if(j==2) { //평균만 double로 출력
				System.out.print(arr[i][j] + "\t");
				//나머지는 int로 출력
				} else System.out.print((int)(arr[i][j]) + "\t");
			}
			System.out.println();
		}
	}
}
