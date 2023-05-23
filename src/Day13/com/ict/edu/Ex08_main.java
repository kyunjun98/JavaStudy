package Day13.com.ict.edu;

import Day13.com.ict.edu.Ex03_static;

public class Ex08_main {
	public static void main(String[] args) {
		//이걸 이해하고 싶으면 com.ict.edu.Ex03_main과 비교해볼것
		//k1 -> public = 누구나 다 접근
		//k2 -> 생량, default = 같은 패키지만 접근 가능 
		//k3 -> private = 외부에서 접근 불가 
		System.out.println(Ex03_static.k1);
		//System.out.println(Ex03_static.k2); //패키지가 달라서 접근불가
		//System.out.println(Ex03_static.k3); //private라서 접근불가
	}
}
