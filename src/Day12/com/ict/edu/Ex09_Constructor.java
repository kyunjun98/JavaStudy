package Day12.com.ict.edu;

public class Ex09_Constructor {
	//국어, 영어, 수학 받는 생성자를 만들어서 평균 총점

	private int kor = 0;
	private int eng = 0;
	private int math = 0;
	private int sum = 0;
	private double avg = 0.0;
	private String hak = "";
	private int rank = 1;
	
	public Ex09_Constructor(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		process();
	}
	
	public void process() {
		sum = kor + eng + math;
		avg = (int)(sum/3.0*10)/10.0;{
		if(avg>=90) {
			hak = "A";
		} else if(avg>=80) {
			hak = "B";
		} else { hak = "F"; }
	}
	}

	public void gPrn() {
		System.out.print(sum + "\t");
		System.out.print(avg + "\t");
		System.out.print(hak + "\t");
		System.out.print(rank + "\t");
		System.out.println();
	}
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
}
