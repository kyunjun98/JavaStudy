package Day11.com.ict.edu;

public class Ex04_main {
	public static void main(String[] args) {
		Ex04_method k = new Ex04_method();
		
		k.add();
		System.out.println(k.res);
		
		k.add(1000);
		System.out.println(k.res);
		
		k.add(100,1000);
		System.out.println(k.res);
	}
}
