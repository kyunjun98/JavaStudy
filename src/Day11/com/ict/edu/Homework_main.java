package Day11.com.ict.edu;

import java.util.Scanner;

public class Homework_main {
	public static void main(String[] args) {
		// 5명의 이름, 국어, 영어, 수학을 입력 받아서
		// 이름, 총점, 평균, 학점, 순위를 구하고
		// 순위 기준으로 오름차순 정렬해서 출력하자

		Scanner sc = new Scanner(System.in);
		Homework_method[] arr = new Homework_method[5]; // 바깥쪽 배열
		for (int i = 0; i < arr.length; i++) {
			Homework_method sys = new Homework_method(); // 안쪽 배열

			System.out.print("이름: ");
			sys.name = sc.next();
			System.out.print("국어: ");
			sys.kor = sc.nextInt();
			System.out.print("영어: ");
			sys.eng = sc.nextInt();
			System.out.print("수학: ");
			sys.math = sc.nextInt();

			sys.sum = sys.kor + sys.eng + sys.math;
			sys.avg = sys.sum / 3.0;
			if (sys.avg >= 90) {
				sys.hak = "A";
			} else if (sys.avg >= 80) {
				sys.hak = "B";
			} else if (sys.avg >= 70) {
				sys.hak = "C";
			} else if (sys.avg >= 60) {
				sys.hak = "D";
			} else
				sys.hak = "F";
			sys.rank = 1;
			arr[i] = sys;
		}
		
		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].sum < arr[j].sum) {
					arr[i].rank += 1;
				}
			}
		}

		// 정렬
		Homework_method tem = new Homework_method();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].rank > arr[j].rank) {
					tem = arr[i];
					arr[i] = arr[j];
					arr[j] = tem;
				}
	
			}
		}
		
		// 출력
		for (int i = 0; i < arr.length; i++) {
			String a = arr[i].getArray();
				System.out.println(a);
		}
	}
}
