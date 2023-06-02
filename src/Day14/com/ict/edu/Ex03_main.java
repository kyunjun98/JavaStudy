package Day14.com.ict.edu;

public class Ex03_main {
	public static void main(String[] args) {
		//자식클래스를 객체로 만들면 부모클래스가 먼저 알아서 만들어진다.
		Ex03_Sub sub = new Ex03_Sub();
		System.out.println("메인에서 호출: " + sub);
		System.out.println();
		
		System.out.println(sub.name);
		System.out.println(sub.age);
		System.out.println(sub.addr);
		
		//외부에서는 private 호출안됨 
		//System.out.println(sub.cat);
		//System.out.println(sub.dog);
		
		System.out.println(Ex03_Sub.computer);
		System.out.println(Ex03_Sub.playStation);
		
	}
}
