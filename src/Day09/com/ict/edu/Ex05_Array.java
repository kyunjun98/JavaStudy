package Day09.com.ict.edu;

import java.util.Arrays;

public class Ex05_Array {
	public static void main(String[] args) {
		String[] name = {"홍", "김", "박", "이", "고"};
		int[] kor = {80,90,50,80,60};
		int[] eng = {30,60,40,100,80};
		int[] math = {90,40,10,90,100};
		int[] sum = new int[name.length];
		double[] avg = new double[name.length];
		char[] hak = new char[name.length];
		int[] rank = {1,1,1,1,1};
		
		for(int i=0; i<name.length; i++) {
			sum[i] = (kor[i] + eng[i] + math[i]);
			avg[i] = (int)(sum[i]/3.0*10)/10.0;
			if(avg[i]>=90) hak[i] = 'A';
			else if(avg[i]>=80) hak[i] = 'B';
			else if(avg[i]>=70) hak[i] = 'C';
			else hak[i] = 'F';
		}
		//순위는 sum값을 다 구하고 나서 돌려야 하기때문에 따로 빼서 구해야한다.
		for(int i=0; i<name.length; i++) {
			for(int j=0; j<sum.length; j++) {
				if(sum[i]<sum[j]) {
					rank[i] += 1;
				} 
			}
			System.out.println(sum[i] + ", " + avg[i] + ", " + hak[i] + ", " + rank[i]);
		}
	}
}
