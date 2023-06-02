package Day12.com.ict.edu;

public class Ex05_main {
	public static void main(String[] args) {
		Ex05_Constructor p1 = new Ex05_Constructor();
		String name = p1.getName();
		System.out.println(name);
		int age = p1.getAge();
		System.out.println(age);
		String addr = p1.getAddr();
		System.out.println(addr);
		
		System.out.println("======기본생성자======");
		Ex05_Constructor p2 = new Ex05_Constructor("이지매");
		name = p2.getName();
		System.out.println(name);
		age = p2.getAge();
		System.out.println(age);
		addr = p2.getAddr();
		System.out.println(addr);
		
		System.out.println("======기본생성자x 오버로딩======");
		Ex05_Constructor p3 = new Ex05_Constructor("둘리", 1963);
		name = p3.getName();
		System.out.println(name);
		age = p3.getAge();
		System.out.println(age);
		addr = p3.getAddr();
		System.out.println(addr);
		
		System.out.println("======기본생성자x 오버로딩======");
		Ex05_Constructor p4 = new Ex05_Constructor("임꺽정", 35, "함경도");
		name = p4.getName();
		System.out.println(name);
		age = p4.getAge();
		System.out.println(age);
		addr = p4.getAddr();
		System.out.println(addr);
		
	}
}
