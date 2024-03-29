package Day09.com.ict.edu;

public class Ex01_Array {
	public static void main(String[] args) {
		//배열: 같은 자료형의 데이터들을 한 곳에 모아 둔 묶음
		//	   반드시 같은 자료형이어야 한다. (단, 프로모션, 디모션 가능)
		//	   배열 데이터를 추출할때는 일반적으로 for문을 사용한다.
		//단점: 생성할 때 반드시 크기를 지정해야 된다.
		//	   한번 지정된 크기는 변경되지 않는다.
		//배열의 종류: 1차원 배열과 다차원 배열(배열안에 배열)
		//			위배열은 기본자료형배열과 참조자료형배열(객체배열) 두가지로 나뉨
		
		//배열 생성 순서: 선언 => 생성 => 초기화(데이터 저장)
		//1. 선언: 자료형[] 이름; or 자료형 이름[];
		int[] su;
		
		//2. 생성: 이름 = new 자료형[배열크기=방의 수];
		//		  new 예약어: 메모리에 데이터를 저장할 공간을 만들어라
		//				     => 인스턴스, 객체 생성
		su = new int[4]; 
		
		//3. 초기화: 이름[index=위치값=방 번호] = 입력값;
		//		    같은 자료형만 저장 가능(단, 프로모션, 디모션 가능)
		su[0] = 100;
		su[1] = 'a'; //프로모션
		su[2] = (int)2.4; //디모션 => 형변환 하면 가능
		su[3] = 124;
		//su[4] = 14; 배열크기보다 크면 실행오류
		
		//배열을 호출하면 주소(생성ID)가 출력
		System.out.println(su);
		System.out.println("===================");
		
		for(int i=0; i<su.length; i++) {
			System.out.println(su[i]);
		}
		System.out.println("===================");
		
		//개선된 for문: 배열이나 컬렉션에 주로 사용
		//			  배열 전체에 대해서 정보출력 및 가공 가능
		//단점: 특정 몇개나 특정 하나를 별도로 출력하거나 가공 할 수 없다.
		// : => 오른쪽 배열의 데이터를 순서대로 왼쪽에 넘긴다.
		//k는 index값이 아닌 데이터값이다.
		//위에 for문과 효율차이는 없으니 상황에 따라 사용하면 됨
		for(int k : su) {
			System.out.println(k *10);
		}
	}
}
