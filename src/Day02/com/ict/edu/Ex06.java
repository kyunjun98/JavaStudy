class Ex06 {
	public static void main(String[] args) {
		//String: 	문자열을 처리하기 위해서 만든 클래스
		//	기본자료형은 아니다.
		//	클래스를 자료형으로 사용하므로 참조자료형이다.
		//	근데 기본자료형처럼 사용 가능하다.
		//	반드시 String 변수이름 = "데이터";

		String name = "홍길동";
		int age;
		
		System.out.println(name);

		// + 연산을 할 수 있으면 결과는 무조건 String이다. (연결자 역할)
		System.out.println(name + name + name + name + name);
		name = "1000";
		age = 1000;
		System.out.println(name + 50);
		System.out.println(age + 50);

		int su1 = 20;
		int su2 = 4;
		System.out.println(su1 + su2);
		System.out.println("결과: " + su1 + su2); //앞에부터 계산하기 때문에 결과20이 먼저됨(String) 그리고 4가 더해져서 결과204
		//해결방법
		int sum = su1 + su2;
		System.out.println("결과: " + sum);
		System.out.println("결과: " + (su1 + su2));
	}
}