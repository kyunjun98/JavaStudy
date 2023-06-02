package Day02.com.ict.edu;

import java.util.Scanner;

class test {
	public static void main(String[] args) {
		//�ּ�: ���������� �ʴ� ��, ������ ���뼳�� �� �� ���
		
		//����: ���α׷��� ���� ������ ���� �� �ִ� ����
		//����: �ڷ��� �����̸�;
		//           �����̸� = �� ������;
		
		//�� �ڷ����� ����
		boolean b1;
		b1 = true;
		System.out.print(b1);
		for(int i=0; i<20; i++) {
			if(i<5) {
				System.out.println("���� ����" + i + "�Դϴ�");
			} else {System.out.println("�ʰ���");}
		}
	int month;
	Scanner sc = new Scanner(System.in);
	System.out.println("���Է�");
	month = sc.nextInt();

        String monthString = "";
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString);	
	}
}