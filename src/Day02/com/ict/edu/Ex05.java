class Ex05 {
	public static void main(String[] args) {
		int kor=90;
		int eng = 80;
		int math = 85;

		//����
		int sum = kor + eng + math;
		//���
		int avg = sum / 3; 
		
		double avg2 = sum / 3; //�Ҽ����� ���� ��? sum�� int�̱� ������
		
		double avg3 = (double)(sum/3); //�̰͵� �ȳ��� ��? 3�� �����̱� ������
		
		double avg4 = (double)(sum)/3; //3�� ���λ��� �ȴ�.

		double avg5 = sum/3.0; //�Ҽ����� �ֱ� ������ �����ϴ�!
		
		//�Ҽ��� ��°�ڸ����� ��¹��
		double avg6 = (int)(avg5*100)/100.0; //avg5*100�� double�ε� int�� �ٲ۴��߰� �ٽ� 100�� �����鼭 ��°¥����

		//1�Ǵ��� �������
		int sum2 = (int)(sum/10)*10;
		
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(avg2);
		System.out.println(avg3);
		System.out.println(avg4);
		System.out.println(avg5);
		System.out.println(avg6);
		System.out.println(sum2);
		
	}
}