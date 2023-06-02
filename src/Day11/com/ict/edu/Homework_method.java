package Day11.com.ict.edu;

public class Homework_method {
	String name = "";
	int kor = 0;
	int eng = 0;
	int math = 0;
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	int rank = 1;
	public String getArray() {
		return (name + ", " + sum + ", " + avg + ", " + hak + ", " + rank);
	}
	// 배열은 같은 자료형을 여러개 저장할 수 있습니다.
	// 클래스를 이용하면 자료형이 다르더라도 여러개 저장 할 수 있다.
}
