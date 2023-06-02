package day2;

class Ex03 {
	public static void main(String[] args) {
		/*
		����: �Ҽ����� ���� ����
		�Ǽ�: �Ҽ����� �ִ� ����
		�������� �Ǽ��� ũ��.
		����: byte < short < int < long
		�⺻�� int �̴�.
		�Ǽ�: float < double 
		�⺻�� double�̴�. 

		ū�ڷ����� ���� �ڷ����� ���Ǹ� ����� ū�ڷ����� ���´�.
		int + int = int? yes
		long + long = long? yes
		byte + short = short? no 
		short + short = short? no ������ �ּ��� int�� ����
		char�� ���������� ���ڷ� ����Ǵµ� ��� �ɱ�?
		char + int = int�� ����
		*/

		//1. byte(2^8): -128~127 �ʰ��� �����߻�
		byte su1 = 123;
		System.out.println(su1);

		//2. short(2^16): -32768 ~ 32767
		short su2 = 1234;
		System.out.println(su2);
		
		//3. int: ������ �⺻
		int su3 = 12345;
		System.out.println(su3);

		//4. long: int���� �� ���� ������ ������ ����
		//           �⺻������ ���� �ڿ� L �Ǵ� l�� ���δ�. (��������=���θ��)
		//	���θ��: �� ū�ڷ������� ���� �� �� �ִ�.
		long su4 = 123456L;
		System.out.println(su4);

		//�����ڷ����� ū�ڷ����� ����ϸ� ����� ū�ڷ������� ����ȴ�.
		//�����ڷ����� ū�ڷ����� ������ �� �ִ�. 
		long su5 = 125;
		System.out.println(su5);
		
		//���θ���� �Ǵ�����
		//su6�� ���� su7�� ����ȴ�. long�� ������ ���� ������ ������ ��. �ݴ�δ� �Ұ���
		int su6 = 1000000;
		long su7 = su6;
		System.out.println(su7);
		
		//�Ǽ�: float < double;
		//       �⺻�� double;
		
		//float: ���� �ڿ� f�� F�� ���δ�. (���� �Ұ���)
		float su8 = 13.3f;
		System.out.println(su8);
		
		double su9 = 15.3;
		System.out.println(su9);
		
		char ch3 = 'a';
		int su10 = 37;

		double su11 = ch3;
		System.out.println(su11);

		su11 = su10;
		System.out.println(su11);
	}
}