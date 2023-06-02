package Day05.com.ict.edu;

import java.util.Iterator;

public class Ex02_for {
	public static void main(String[] args) {
		//for문 : 정해진 규칙에 따라 실행문을 반복 처리한다.
		//형식) for(초기식; 조건식; 증감식) {
		//		조건식이 참일때 실행할 문장;
		//		조건식이 참일때 실행할 문장;
		//		조건식이 참일때 실행할 문장;
		//	}
		//for문을 만나면 무조건 초기식으로 이동
		//초기식은 조건식으로 이동
		//이때 조건식이 true이면 for문 실행, false면 실행하지 않음
		//for문의 끝을 만나면 무조건 증감식으로 간다.
		
		//{}에서 만들어진 변수는 {} 밖을 벗어나면 사라진다. (사용불가)
		
		//안녕하세요를 10번 출력하기
		for(int i = 0; i<10; i++) {
			System.out.println("안녕하세요");
		}
		System.out.println("======================");
		
		//0~10까지 출력
		for(int i = 1; i<=10; i++) {
			System.out.print(i + " "); //"\t" 탭키만큼 수평으로 띄움
		}
		System.out.println();
		System.out.println("======================");
		
		//0~10까지 짝수만 출력 시험출제될수 있음
		for(int i = 2; i<=10; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//위와 같지만 이 방법이 더 많이 사용함
		for(int i = 1; i<=10; i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("======================");
		
		//0~10까지 홀수만 출력
		for(int i=1; i<=10; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//위와 같지만 이 방법이 더 많이 사용함
		for(int i = 0; i<=10; i++) {
			if(i%2==1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("======================");

		//구구단 7단만 출력
		int SE = 7;
		System.out.println("7단 공식");
		for(int i=1; i<10; i++) {
				System.out.println(SE + " * " + i + " = " + SE*i);
		}
		System.out.println("======================");
		
		//1~10 누적합
		//누적합: 이전저장변수 = 이전저장변수 + 현재값; 초기값은 0
		//누적곱: 이전저장변수 = 이전저장변수 * 현재값; 초기값은 1 -> 초기값 0으로하면 어떤 수를 곱해도 0이 됨
		int sum = 0;
		for(int i=1; i<11; i++) {
			sum += i;
		}
		System.out.println("1~10의 누적합: " + sum);	
		
		//짝수의 누적합
		int even = 0;
		for(int i=1; i<11; i++) {
			if(i%2 ==0)
			even += i;
		}
		System.out.println("짝수의 누적합: " + even);
		System.out.println("======================");
		
		//7! 구하기
		int fac = 7;
		int result = 1;
		for(int i=1; i<=fac; i++) {
			result = result * i;
		}
		System.out.println("7!: " + result);
		
		//1 + (-2) + 3 + (-4) + .... + 9 + (-10)
		//for문을 이용한 누적합, if else 사용
		sum = 0;
		for(int i=1; i<11; i++) {
			if(i%2==0) { // 짝수일때 -부호 붙이고 +연산
				sum += -i;
			} else sum += i; //홀수일때 +연산
		}
		System.out.println(sum);
	}
}
