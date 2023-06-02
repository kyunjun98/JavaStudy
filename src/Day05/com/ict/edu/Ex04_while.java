package Day05.com.ict.edu;

public class Ex04_while {
	public static void main(String[] args) {
		/*while문: for문과 같은 반복문 
		 * 형식1) 
		 * 초기식;
		 * while(조건식) {
		 * 	조건식이 참이면 실행할문장;
		 * 	조건식이 참이면 실행할문장;
		 * 	증감식;
		 * }
		 * while문의 끝을 만나면 조건식으로 간다.
		 * */
		
		/*
		 * 형식2) 무한반복인데 if 조건식을 만나서 true이면 break함.
		 * 초기식;
		 * while(true) {
		 * 	if(빠져나갈조건) {
		 * 		break;
		 * 	}
		 * 	조건식이 참이면 실행할문장;
		 * 	조건식이 참이면 실행할문장;
		 * 	증감식;
		 * }
		 * while문의 끝을 만나면 조건식으로 간다.
		 * */
		
		//1~10까지 출력
		int i = 1;
		while(i<=10) {
			System.out.println("i = " + i);
			i++;
		}
		System.out.println("=====================");
		i = 1;
		
		//위와 같음
		while(true) {
			if(i>10) break;
			System.out.println("i = " + i);
			i++;
		}
		System.out.println("=====================");
		
		//1~10 중 짝수만 출력
		i = 1;
		while(i<=10) {
			if(i%2==0)
			System.out.println("i = " + i);
			i++;
		}
		System.out.println("=====================");

		//구구단 중 7단 출력
		i = 1;
		while(i<=9) {
			System.out.println("7 * " + i + " = " + 7 * i);
			i++;
		}
		System.out.println("=====================");
		
		//1~10 누적합
		int sum = 0;
		i = 1;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println("누적합: " +sum);
		System.out.println("=====================");
		
		//0이 4x4로 출력
		i = 1;
		int j = 1;
		while(i<5) {
			while(j<5) {
				System.out.print("0 ");
				j++;
			}
			System.out.println();
			i++;
			j=1; // j의 값이 5이기 때문에 다시 1로 초기화 시켜줌
		}
		System.out.println("=====================");
		
		i = 1;
		j = 1;
		
		while(i<5) {
			if(j==5) break;
			System.out.print("0 ");
			i++;
			if(i==5) {
				System.out.println();
				i=1;
				j++;
			}
		}
		System.out.println("=====================");
		
		//내가만든 코드를 간단하게 하는방법
		//4의 배수를 사용하여 줄바꿈
		i=1;
		while(i<17) {
			System.out.print("0 ");
			if(i%4==0) {
				System.out.println();
			}
			i++;
		}
	}
}
