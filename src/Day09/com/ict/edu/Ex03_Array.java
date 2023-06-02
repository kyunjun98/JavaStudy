package Day09.com.ict.edu;

import java.util.Arrays;
import java.util.Collections;

public class Ex03_Array {
	public static void main(String[] args) {

		int tem = 0;
		int[] su1 = {3,4,9,8,2,1,7,10,5,6};

		System.out.println("=======su1=======");
		for(int i=0; i<su1.length-1; i++) {
			for(int j=i+1; j<su1.length; j++) {
				if(su1[i]<su1[j]) { //오름차순 , 내림차순 부호 반대로만 하면됨
					tem = su1[i];
					su1[i] = su1[j];
					su1[j] = tem;
				}
			} 
		}
		for(int i=0; i<su1.length; i++) {
			System.out.print(su1[i] + " ");
		}
		System.out.println("\n=======su2=======");
		
		//Arrays 클래스는 배열 복사, 정렬, List로 전환 등
		//배열에 관련된 기능을 제공하는 클래스
		//오름차순 정렬은 sort()로 가능
		//내림차순은 없음
		int[] su2 = {3,4,9,8,2,1,7,10,5,6};
		Arrays.sort(su2);
		for(int i=0; i<su2.length; i++) {
			System.out.print(su2[i] + " ");
		}
		System.out.println("\n=======su3=======");
		
		//내림차순은 없지만 Collections.reverseOrder() 사용하면 가능하다.
		//기본자료형으로는 오류 발생 따라서 int => Integer로 변경
		Integer[] su3 = {3,4,9,8,2,1,7,10,5,6};
		Arrays.sort(su3, Collections.reverseOrder());
		for(int i=0; i<su3.length; i++) {
			System.out.print(su3[i] + " ");
		}
	}
}
