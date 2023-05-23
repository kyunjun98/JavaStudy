package Day13.com.ict.edu;

import java.util.Arrays;

public class test4 {
	public static void main(String[] args) {
		int[] su = { 90, 87, -20, 120, 67, 23, 40, 53 };
		
		Arrays.sort(su);
		System.out.println("최소값: " + su[0]);
		System.out.println("최대값: " + su[su.length-1]);
	}
}
