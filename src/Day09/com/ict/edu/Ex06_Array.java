package Day09.com.ict.edu;

import java.util.Scanner;

public class Ex06_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//학급인원수 받고
		System.out.print("인원수: ");
		int stu = sc.nextInt();
		String[] name = new String[stu];
		int[] kor = new int[stu];
		int[] eng = new int[stu];
		int[] math = new int[stu];
		int[] sum = new int[stu];
		double[] avg = new double[stu];
		String[] hak = new String[stu];
		int[] rank = new int[stu];
		
		//입력값
		for(int i=0; i<stu; i++) {
			System.out.print("이름: ");
			name[i] = sc.next();
			
			System.out.print("국어: ");
			kor[i] = sc.nextInt();

			System.out.print("영어: ");
			eng[i] = sc.nextInt();
			
			System.out.print("수학: ");
			math[i] = sc.nextInt();
			
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int)(sum[i]/3.0*10)/10.0;
			
			if(avg[i]>=90) hak[i] = "A";
			else if(avg[i]>=80) hak[i] = "B";
			else if(avg[i]>=70) hak[i] = "C";
			else hak[i] = "F";
			rank[i] = 1;
		}
		
		//순위 정하기
		for(int i=0; i<stu; i++) {
			for(int j=0; j<stu; j++) {
				if(sum[i]<sum[j]) {
					rank[i] += 1;
				}
			}
		}
		
		//출력값
		for(int i=0; i<stu; i++) {
			System.out.println(name[i] + ", " + sum[i] + ", " + avg[i] + ", " + hak[i] + ", " + rank[i]);
		}
	}
}
