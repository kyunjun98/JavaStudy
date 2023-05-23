package Day08.com.ict.edu;

public class Ex01_String {
	public static void main(String[] args) {
//		7. getBytes() : byte[]
//		해당 문자열을 byte[]로 변환시킨다. (숫자로 변환되어 데이터값이 저장됨)
//		보통 입출력할때 사용한다. (대/소문자, 숫자, 일부특수문자(아스키코드)만 가능 / 영어를 제외한 글자 안됨)
		String a1 = "Java";
		byte[] b1 = a1.getBytes();
		System.out.println(b1[0]);  //J숫자
		System.out.println(b1[1]);  //a숫자
		System.out.println(b1[2]);  //v숫자
		System.out.println(b1[3]);  //a숫자
		for (int i = 0; i < b1.length; i++) {    //for문 자동완성을 만들면 알아서 배열을 찾아준다.
			System.out.println((char)b1[i]);    //char형으로 출력
		}
		System.out.println("========================");
		
//		8. hashCode() : int
//		일반적인 hashCode는 객체의 주소값을 변환하여 생성한 객체의 고유한 정수값
//		String.hashCode는 각 문자열에서 정수값으로 변경
		String a2 = "홍길동";
		System.out.println(a2.hashCode());
		
		String a3 = "홍길동";
		System.out.println(a3.hashCode());
		
//		문자열일때 == 주소가 같냐? (★중요 String(문자열)에서는 안씀!!!!)
		System.out.println(a2 == a3);
		
//		문자열일때 equals (내용이 같냐?)
		System.out.println(a2.equals(a3));
		System.out.println("========================");
		
//		9. indexOf(int ch), indexOf(String str) : int      //charAt()메서드와 반대
//		입력된 char, String를 해당 문자열에 char나 String의 첫번째 위치값을 알려준다
//		찾는 문자나 문자열이 없으면 -1 반환
		String a4 = "BufferedReader";
//		'R'을 찾아라
		System.out.println(a4.indexOf('R'));
//		'r'를 찾아라
		System.out.println(a4.indexOf('r'));
//		'K'를 찾아라
		System.out.println(a4.indexOf('K'));
//		"er"를 찾아라
		System.out.println(a4.indexOf("er"));
		System.out.println("========================");
		
//		10. lastIndexOf(int ch), lastIndexOf(String str) : int
//		입력된 char, String를 해당 문자열에 char나 String의 마지막 위치값을 알려준다
//		'R'을 찾아라
		System.out.println(a4.lastIndexOf('R'));
//		'r'를 찾아라
		System.out.println(a4.lastIndexOf('r'));   //맨마지막에 위치한 'r'을 찾음
//		'K'를 찾아라
		System.out.println(a4.lastIndexOf('K'));
//		"er"를 찾아라
		System.out.println(a4.lastIndexOf("er"));
		System.out.println("========================");
		
//		11. indexOf(int ch, int formIndex), indexOf(String str, int fromIndex): int
//		2번째, 3번째 문자나 문자열 찾기 위함
//		fromIndex => 시작 위치값
		a4 = "BufferedReader";
		System.out.println(a4.indexOf('e', 0));   //a4.indexOf('e')와 같은 내용
		
//		첫번째 'e'의 위치가 4로 나와서 5부터 시작
		System.out.println(a4.indexOf('e', 5));  //잘안씀
		System.out.println(a4.indexOf('e', a4.indexOf('e', 0)+1));   //위치값을 숫자5로 입력할수도 있지만 내용이 바뀔수도 있으니 이런식으로 작성!!!
		
//		두번째 'e'의 위치가 6이 나와서 7부터 시작
		System.out.println(a4.indexOf('e', 7));  //잘안씀
		System.out.println(a4.indexOf('e', a4.indexOf('e', a4.indexOf('e', 0)+1)+1));
		System.out.println("========================");
		
//		12. length() : int => 문자열의 길이(개수) => 1부터 시작
//						※주의※ 문자열의 위치(index) => 0부터 시작
		System.out.println(a4.length());
		
//		13. replace(char oldeChar, Char newChar) : String
//		    replace(String oldeStr, Char newSrt) : String
//		새로운 문자나 문자열을 받아서 치환(바꾸기)한다.
		String a5 ="대한민국";
		String a6 = a5.replace('한', '韓');
		String a7 = a5.replace("한", "한 ♥ ");
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		System.out.println("========================");

//		이름의 첫자와 마지막 자를 제외하고 * 찍기
//		예)  홍길동  => 홍 * 동,  선우은숙 => 선 * * 숙
		String a8 = "홍길동";
		int t1 = a8.length();   //문자 길이 저장
		String res = "";
		for (int i = 0; i < t1; i++) {
			char s = a8.charAt(i);
			if (i==0 || i==t1-1) {    //★ 처음과 끝 조건구하기(i = 인덱스값이기 때문에 t1인 문자 길이에서 -1 해줌
				res += s;
			} else {
				res += '*';
			}
		}
		System.out.println(res);
		
//		전화번호:  010-9876-7410   =>  010-9876-,**** 으로 변경 하기
		String a9 = "010-9876-7410";
		int t2 = a9.length();
		int t3 = a9.lastIndexOf("-");
		res="";
		
		for (int i = 0; i < t2; i++) {
			char s = a9.charAt(i);
			if (i>=0 && i<= t3) {
				res += s;
			} else {
				res += "*";
			}
		}
		System.out.println(res);
		
//		전화번호:  010-9876-7410   =>  010-****-7410 으로 변경 하기
		a9 = "010-9876-7410";
		t2 = a9.length();
		t3 = a9.indexOf("-");    
		int t4 = a9.lastIndexOf("-");
		
		res="";
		for (int i = 0; i < t2; i++) {
			char s = a9.charAt(i);
			if (i>=t3+1 && i<= t4-1) {      //"-"의 사이값 범위, 하이픈까지 찾은 뒤에값부터 '*'처리를 해주기 때문에 +1을 해줌
				res += "*";
			} else {
				res += s;
			}
		}
		System.out.println(res);
		System.out.println("========================");
		
//		14. isEmpty() : boolean
//		해당 문자열이 비어있으면 true, 내용이 있으면 false
		String t5= "HelloWorld";
		System.out.println(t5.isEmpty());
		
		t5="";
		System.out.println(t5.isEmpty());
		System.out.println("========================");

//		15. split(String regex) : String[] -> 문자를 구분자로 쪼갬
//			split(String regex, int limit) : String[]
//		regex => 구분자(나눌 기준),  limit => 배열의 크기(방의 개수,생략가능) / 방번호 = index(0부터 시작)
		t5 = "사과, 딸기, 망고, @ 오렌지, 두리안, 용과";    //for문을 이용해서 배열을 출력 할 수있다
		String[] arr = t5.split("@");
		
//		System.out.println(arr[0]);   배열크기 오류로 오류남
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(arr[5]);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("**********************************");
		
		String[] arr2 = t5.split(",", 3 );     //배열크기 3개로 지정
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("========================");
		
//		16. substring(int beginIndex) : String
//		입력된 시작위치부터 끝까지 문자열 추출
		String t6 = "010-9732-9110";
		String t7 = t6.substring(4);
		System.out.println(t7);
		
		t7=t6.substring(9);
		System.out.println(t7);
		
		t7=t6.substring(t6.lastIndexOf("-")+1);
		System.out.println(t7);
		
//		16-2. substring(int beginIndex, int endIndex) : String
//		beginIndex 위치부터 endIndex 위치까지 (endIndex 위치는 포함하지 않는다.)
		t6 = "010-9732-9110";
		t7= t6.substring(4,8);
		System.out.println(t7);
		
//		★ 한글자 추출 ★
		t7= t6.substring(0,1);    // *tip 0,(앞)에서 1(뒤)을 빼면 추출하려는 글자수 나옴~~
		System.out.println(t7);
		
		System.out.println("**********************************");
//		010-9732-9110 => 010-****-9110  또는 010-9732-****
		String t8="010-9732-9732";
		String t9= "****";
		String t10= t8.replace(t8.substring(4,8), t9);
		System.out.println(t10);
		
		t10= t8.replace(t8.substring(t8.indexOf("-")+1, t8.lastIndexOf("-")), t9);  //※헷깔림 주의※ 
		System.out.println(t10);
		System.out.println("**********************************");
		
		t10= t8.replace(t8.substring(t8.lastIndexOf("-")+1), t9);
		System.out.println(t10);
		
		String[] arr3 = t8.split("-");
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[0]+"-****-"+arr3[2]);
		System.out.println("========================");
	
	}
}
