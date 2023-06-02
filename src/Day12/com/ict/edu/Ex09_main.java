package Day12.com.ict.edu;

import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Ex09_Constructor[] arr = new Ex09_Constructor[5];
		// 연준이바보
		for(int i=0; i<arr.length; i++) {
			System.out.print("국어: ");
			int kor = sc.nextInt();
			System.out.print("영어: ");
			int eng = sc.nextInt();
			System.out.print("수학: ");
			int math = sc.nextInt();
			System.out.println("=================");
			Ex09_Constructor sys = new Ex09_Constructor(kor, eng, math);	
			arr[i] = sys;
		}
		//순위
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i].getSum()<arr[j].getSum()) {
				arr[i].setRank(arr[i].getRank() + 1);
				}
			}
		}
		
		//순위정렬
		Ex09_Constructor tem = new Ex09_Constructor(0, 0, 0);
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i].getSum()>arr[j].getSum()) {
					tem = arr[i];
					arr[i] = arr[j];
					arr[j] = tem;
				}
			}
		}
		
		//출력
		System.out.println("총점\t평균\t학점\t순위");
		for(int i=0; i<arr.length; i++) {
			arr[i].gPrn();
		}
		
	}
}
