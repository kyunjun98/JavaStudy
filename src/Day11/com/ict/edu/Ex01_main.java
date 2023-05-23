package Day11.com.ict.edu;

public class Ex01_main {
	public static void main(String[] args) {

		Ex01_method t1 = new Ex01_method();
		/* Ex01 method.
		 * ---------------------
		 * int kor = 80;
		 * int eng = 95; 
		 * int math = 85;			=> 멤버 필드
		 * int total = 0;
		 * double avg = 0.0; 
		 * ---------------------
		 * getTotal() : void
		 * getTotal2() : int		=> 멤버 메서드
		 * getTotal3() : int 
		 * ---------------------
		 */
		
		//인스턴스 호출 방법: 참초변수.변수, 참조변수.메서드
		String name = t1.name;
		System.out.println(name);
		//void는 호출한곳으로 아무것도 가져오기 않기에 변수에 저장하지 않아도 오류 안뜸
		t1.getTotal();
		System.out.println();
		System.out.println("=============");
		
		//static 객체 생성과 상관없이 호출 가능
		// static 호출: 클래스이름.변수, 클래스이름.메서드
		System.out.println(Ex01_method.key);
		System.out.println("=============");
		
		
		Ex01_method.getAvg();
		System.out.println(Ex01_method.key);
		System.out.println("=============");
		
		
		double k2 = Ex01_method.getAvg2();
		System.out.println(k2);
	}
}
