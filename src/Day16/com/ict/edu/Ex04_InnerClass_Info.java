package Day16.com.ict.edu;

public class Ex04_InnerClass_Info {
	/*내부클래스: 클래스 안에 다른 클래스가 정의 되어 있는 클래스
	* 종류: Member(멤버), Local(지역), static, Anonymous(익명)
	* 1. Member
	* 	외부클래스 {
	* 		외부멤버필드
	* 		생성자
	* 		외부멤버메서드
	* 		내부클래스 {
	* 			내부멤버필드
	* 			생성자
	* 			내부멤버메서드
	* 		}
	* 	}
	* 	특징) 1.내부클래스에서는 외부클래스의 멤버들을 마음대로 사용가능(상속과 비슷)
	* 		 단, 상속에서는 private 접근이 불가능 하지만 내부클래스에서는 접근가능하다.
	* 		 2.외부클래스를 통해서만 내부클래스를 생성할 수 있다. 즉, 내부클래스만 별도로 생성 불가
	* 
	* 2. Local
	* 	외부클래스 {
	* 		외부멤버필드
	* 		생성자
	* 		외부멤버메서드 {
	* 			내부클래스 {
	* 				내부멤버필드
	* 				생성자
	* 				내부멤버메서드
	* 			}
	* 		}
	* 	}
	* 	특징) 1.외부클래스 메서드안에 내부클래스가 존재
	* 		 2.외부클래스가 지역변수처럼 사용
	* 		 3.외부클래스의 메서드가 호출(실행) 될 때 생성 할 수 있다
	* 		 4.지역변수처럼 외부클래스의 메서드가 종료되면 내부클래스도 자동으로 사라진다.
	* 
	* 3. static
	* 	외부클래스 {
	* 		외부멤버필드
	* 		생성자
	* 		외부멤버메서드
	* 		static 내부클래스 {
	* 			static 내부멤버필드
	*  			생성자
	* 			내부멤버메서드
	* 		}
	* 	}
	* 	특징) 1.구조는 Member 내부클래스와 같다.
	* 		 단, 내부클래스의 멤버 변수는 static을 사용할 수 없다.
	* 		 2.불가피하게 내부클래스의 멤버변수를 static으로 사용할 때
	* 		 내부클래스를 static 내부클래스로 만든다.
	* 		 3.접근방법은 static접근방법을 사용하면 된다.(클래스이름.변수명)
	* 		 4.내부클래스를 별도로 생성 할 수 있다.
	* 
	* 4. Anonymous
	*	특징) 1.정의된 이름이 없는 클래스이다.
	*		 2.다시 호출 할 수 없다(일회용으로 한번 사용하고 다시 사용 할 수 없다.)
	*/
}
