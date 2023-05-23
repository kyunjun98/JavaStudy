class Ex05 {
	public static void main(String[] args) {
		int kor=90;
		int eng = 80;
		int math = 85;

		//총점
		int sum = kor + eng + math;
		//평균
		int avg = sum / 3; 
		
		double avg2 = sum / 3; //소수점이 없음 왜? sum이 int이기 때문에
		
		double avg3 = (double)(sum/3); //이것도 안나와 왜? 3이 정수이기 때문에
		
		double avg4 = (double)(sum)/3; //3을 따로빼면 된다.

		double avg5 = sum/3.0; //소수점이 있기 때문에 가능하다!
		
		//소수점 둘째자리까지 출력방법
		double avg6 = (int)(avg5*100)/100.0; //avg5*100은 double인데 int로 바꾼다했고 다시 100을 나누면서 둘째짜리됨

		//1의단위 삭제방법
		int sum2 = (int)(sum/10)*10;
		
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(avg2);
		System.out.println(avg3);
		System.out.println(avg4);
		System.out.println(avg5);
		System.out.println(avg6);
		System.out.println(sum2);
		
	}
}