package Day03.com.ict.edu;

public class Ex03_oper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//비교연산자: >, <, >=, <=, ==(같다), !=(같지않다=다르다)
		//a=!b는 a = !b 로 보기 때문에 a에 !b를 저장한다는 의미임(비교연산자x)
		//연산 결과는 무조건 boolean으로 저장
		
		int su1 = 90;
		int su2 = 80;
		
		boolean res = su1 >= su2;
		System.out.println(res);
		
		double su3 = 89.999;
		double su4 = 80.0;
		
		res = su1 >= su3;
		System.out.println(res);
		
		res = su2 == su4;
		System.out.println(res);
		
		char c1 = 'a';
		char c2 = 'A';
		
		res = su1 >= c1;
		System.out.println(res);
		
		res = c1 >= c2;
		System.out.println(res);
	}

}
