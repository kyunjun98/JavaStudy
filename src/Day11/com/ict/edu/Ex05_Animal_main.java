package Day11.com.ict.edu;

public class Ex05_Animal_main {
	public static void main(String[] args) {
		//객체 생성
		Ex05_Animal_method k1 = new Ex05_Animal_method();
		
		//이름 큰뿔소
		k1.setName("큰뿔소");
		//나이 3
		k1.setAge(3);
		//생존여부 살아있음
		k1.setLive(true);
		//결과 출력
		String name = k1.getName();
		int age = k1.getAge();
		boolean live = k1.getLive();

		System.out.println("========변경 전========");
		System.out.println(name);
		System.out.println(age);
		if(live) {
			System.out.println("살았다");
		} else System.out.println("죽었다");
		System.out.println("========변경 후========");
		
		//이름 펭귄 나이 1 생존여부 살아있음으로 변경
		k1.setName("펭귄");
		k1.setAge(1);
		k1.setLive(true);
		
		//출력
		name = k1.getName();
		age = k1.getAge();
		live = k1.getLive();
		
		System.out.println(name);
		System.out.println(age);
		if(live) {
			System.out.println("살았다");
		} else System.out.println("죽었다");
	}
}
