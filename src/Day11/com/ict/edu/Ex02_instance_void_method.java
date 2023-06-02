package Day11.com.ict.edu;

public class Ex02_instance_void_method {
	String name = "홍길동";
	int kor = 90;
	int eng = 80;
	int math = 80;
	int sum = 0;
	double avg = 0.0;
	String hak = " ";
	//모두 void
	
	//총점 구하는 메서드
	public void getSum() {
		sum = kor + eng + math;
	}
	
	//평균 구하는 메서드
	public void getAvg() {
		avg = sum/3.0;
	}
	
	//학점 구하는 메서드
	public void getHak() {
		if(avg>=90) {
			hak = "A";
		} else if(avg>=80) {
			hak = "B";
		} else hak = "F";
	}

}
