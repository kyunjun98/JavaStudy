package Day14.com.ict.edu;

import java.util.StringTokenizer;

public class Ex02_StringBuffer {
	public static void main(String[] args) {
		//문자열을 추가할 때 사용(메모지 주소가 변경되지 않는다.)
		//추가할 때 append() 사용
		//toString() => String 전환한다
		StringBuffer sb = new StringBuffer("ictedu");
		
		//추가
		sb.append(" 대한민국");
		
		//.toString() 붙이는게 좋다
		System.out.println(sb);
		System.out.println(sb.toString());
		
		//StringTokenizer: 구분자를 이용해서 문자열 분리, split과 차이점은 배열의 크기를 지정 못한
		//				   구분자가 없으면(띄어쓰기, 탭, 줄바꾸기) 알아서 구분한다.
		//nextToken()을 이용해서 문자열 분리
		
		//구분자 없음(띄어쓰기 기준)
		String str = "사과 바나나 망고 오렌지 수박";
		StringTokenizer st = new StringTokenizer(str);
		while(st.hasMoreElements()) {
			String res = st.nextToken();
			System.out.println(res);
		}
		System.out.println("==============");
		
		//구분자 있음, split과 다르게 크기를 지정 못한다.
		str = "사과,바나나,망고,오렌지,수박";
		StringTokenizer st2 = new StringTokenizer(str, ",");
		while(st2.hasMoreElements()) {
			String res = st2.nextToken();
			System.out.println(res);
		}
		System.out.println("==============");
		
		//추천
		String[] arr = str.split(",");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
