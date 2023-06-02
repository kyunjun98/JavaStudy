package Day04.com.ict.edu;

public class Team2_Math {
	public static void main(String[] args) {
		
		//1. Math.round() : 전달받은 실수를 소수점 첫째자리에서 반올림
		System.out.println(Math.round(10.2)); //10
		System.out.println(Math.round(10.5)); //11
	
		//2. Math.log10(double a) : 밑이 10인 log의 값을 반환
		System.out.println(Math.log10(100)); // 2.0
	
		//3. Math.floor(floor a): floor 입력받은 값과 같거나 작은수를 실수형으로 반환
		System.out.println(Math.floor(20.4)); //20.0
		System.out.println(Math.floor(20.7)); //20.0
		
		//4. Math.pow() : 제곱 반환
		System.out.println(Math.pow(10, 30.2)); //1.584893192461111E30
	
		//5. Math.sqrt() : double형 값의 제곱근 값을 반환
		System.out.println(Math.sqrt(2.1)); //1.449137674618944
	
		//6. Math.rint(double a) : a의 값의 가장 가까운(반올림) 정수로 값을 반환
		System.out.println(Math.rint(11.3)); //11.0
		System.out.println(Math.rint(11.7)); //12.0
		
		//7. Math.ceil() : 인수로 전달받은 값과 같거나 큰 수 중에서 가장 작은 정수를 반환
		System.out.println(Math.ceil(10.3)); //11.0
		System.out.println(Math.ceil(10.5)); //11.0
	
		//8. Math.sin() : 사인 값을 반환
		System.out.println(Math.sin(60)); //-0.3048106211022167
	
		//9. Math.hypot(double a, double b) : c^2 = a^2 + b^2의 값을 반환 -> 피타고라스의 정리
		System.out.println(Math.hypot(3.0, 4.0)); //5.0
	
		//10. Math.random() : 0.0 ~ 1.0 범위의 임의의 double 값을 반환
		System.out.println(Math.random()); //0.7055691096357596 (랜덤값나옴)
	
		//11. Math.abs(): 절대값을 반환함.
		System.out.println(Math.abs(-30.0)); //30
	}
}
