package Day02.com.ict.edu;

import java.util.Scanner;
class TestIf {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("�г�: ");
		int grade = sc.nextInt();
		if(1<= grade && grade<=6) {
			System.out.print("����: ");
			int kor = sc.nextInt();
			if(0<=kor && kor<=100) {
				System.out.print("����: ");
				int eng = sc.nextInt();
				if(0<=eng && eng<=100) {
					System.out.print("����: ");
					int math = sc.nextInt();
					if(0<=math && math<=100) {
						double avg = (double)(kor + eng + math) / 3;
						System.out.println("�г�: " + grade);
						System.out.println("���: " + avg);
						if(avg>70 && grade>=4) {
							System.out.println("�հ�");
						} else if(avg>60 && grade<4) {
							System.out.println("�հ�");
						} else {System.out.println("���հ�");}
					} else { System.out.print("��������Ʋ��");}
				} else { System.out.print("��������Ʋ��");}
			} else {System.out.print("�������� ��Ʋ��");}
		}
	}
}