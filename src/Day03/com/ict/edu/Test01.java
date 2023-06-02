package Day03.com.ict.edu;

public class Test01 {
	public static void main(String[] args) {
		//이름이 홍길동인 사람의 점수가
		//국어 90, 영어 80, 수학 80점이다.
		//총점과 평균을 구하자
		//화면 출력은 이름, 총점, 평균만 출력해라
		//단 평균은 소수점 첫째자리까지 구하자
		
		String name = "홍길동";
		int kor = 90;
		int eng = 80;
		int math = 80;
		
		int sum = kor + eng + math;
		double avg = (int)((sum/3.0)*10)/10.0;
		
		System.out.println(name +"님의 총점은 " + sum +"이며 평균점수는 " + avg + "입니다.");
	}
}
