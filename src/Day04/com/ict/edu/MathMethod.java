package Day04.com.ict.edu;

public class MathMethod {

	public static void main(String[] args) {
		
		double x = 20.32131245;
		System.out.println(Math.rint(x)); // x의 값의 가장 가까운(반올림) 정수로 값을 반환
		
		double y = 300.0;
		System.out.println(Math.log10(y)); //밑이 10인 log를 반환
		
		x = 4; 
		y = 3;
		double z = Math.hypot(x, y);// z^2 = x^2 + y^2를 반환 > 피타고라스의 정리
		System.out.println(z);
		
	}

}
