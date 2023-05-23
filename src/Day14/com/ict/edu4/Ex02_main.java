package Day14.com.ict.edu4;

public class Ex02_main {
	public static void main(String[] args) {
		Ex02_Dog dog = new Ex02_Dog();
		Ex02_Cat cat = new Ex02_Cat();
		
		dog.sound();
		dog.hobby();
		System.out.println(dog.color);
		System.out.println(dog.eyes);
		System.out.println();
		
		cat.sound();
		cat.hobby();
		System.out.println(cat.color);
		System.out.println(cat.eyes);
		System.out.println();
		
		//객체생성
		//부모클래스 변수 = new 자식클래스생성자();
		Ex02_Animal animal = null; //선언만하기
		int su = 1;
		//다형성
		if(su==1) {
			animal = new Ex02_Cat();
		} else if(su==2) {
			animal = new Ex02_Dog();
		}
		
		//오버라이딩
		animal.sound();
		
		//부모 것만 나옴
		System.out.println(animal.color);
		System.out.println(animal.eyes);
		
		//자식클래스만 가지고 있는 것은 사용 못함
		//animal.play();
	}
}
