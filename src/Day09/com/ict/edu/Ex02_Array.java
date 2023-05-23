package Day09.com.ict.edu;

import java.util.Arrays;
import java.util.Collections;

public class Ex02_Array {
	public static void main(String[] args) {
		//선언과 생성을 동시에 가능, 현업에서 제일 많이 사용
		//char[] k1; 선언
		//k1 = new char[4]; 생성
		char[] k1 = new char[4];
		
		k1[0] = 'J';
		k1[1] = 'A';
		k1[2] = 'V';
		k1[3] = 65; //0~65535까지는 오류 없음
		
		//하나씩 출력
		System.out.println("=======기본출력=======");
		for(int i=0; i<k1.length; i++) {
			System.out.print(k1[i] + " ");
		}
		System.out.println("\n=======개선된 for문=======");
		
		//개선된 for문
		for(char k : k1) {
			System.out.print(k + " ");
		}
		System.out.println("\n=======3개 동시선언=======");
		
		//선언,생성, 초기값을 동시에 가능, 많이 안씀
		char[] k2 = {'J','A','0','1'};
		int[] k3 = {100,200,300,400};
		double[] k4 = {3.14, 4, 6.12, 'a'};
		String[] k5 = {"고길동", "홍길동", "김길동", "신길동"};
		
		for(int i=0; i<4; i++) {
			System.out.println("=======k의 " + i + "번째 배열=======");
			System.out.println(k2[i]);
			System.out.println(k3[i]);
			System.out.println(k4[i]);
			System.out.println(k5[i]);
		}
	}
}
