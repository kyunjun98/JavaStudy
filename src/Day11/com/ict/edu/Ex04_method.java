package Day11.com.ict.edu;

public class Ex04_method {
	int su1 = 10;
	int su2 = 20;
	int res = 0;
	
	//메서드이름([인자])
	//인자: 메서드가 실행 할 때 외부에서 필요한 정보를 받기 위한 통로이다.
	//이름이 같지만 인자의 수나 자료형에 따라서 여러개를 만들 수 있다. => 오버로딩
	
	//더하기
	public void add() {
		res = su1 + su2;
	}
	public void add(int k1) {
		res = k1 + su2;
	}
	public void add(int k1, int k2) {
		res = k1 + k2;
	}
	
	public int sub() {
		res = su1 - su2;
		return res;
	}
	public int sub(int k1) {
		int result = k1 - su2;
		return result;
	}
	public int sub(int k1, int k2) {
		return k1 - k2;
	}
}
