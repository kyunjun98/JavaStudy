package Day11.com.ict.edu;

public class Ex07_method {
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	
	public void getSum(int kor, int eng, int math) {
		sum = kor + eng + math;
	}
	public void getAvg(int sum) {
		avg = (int)(sum/3.0*10)/10.0;
	}
	
	public void getHak(double avg) {
		if (avg >= 90) {
			hak = "A";
		} else if (avg >= 80) {
			hak = "B";
		} else if (avg >= 70) {
			hak = "C";
		} else if (avg >= 60) {
			hak = "D";
		} else
			hak = "F";
	}
}
