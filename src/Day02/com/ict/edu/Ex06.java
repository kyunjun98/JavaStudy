class Ex06 {
	public static void main(String[] args) {
		//String: 	���ڿ��� ó���ϱ� ���ؼ� ���� Ŭ����
		//	�⺻�ڷ����� �ƴϴ�.
		//	Ŭ������ �ڷ������� ����ϹǷ� �����ڷ����̴�.
		//	�ٵ� �⺻�ڷ���ó�� ��� �����ϴ�.
		//	�ݵ�� String �����̸� = "������";

		String name = "ȫ�浿";
		int age;
		
		System.out.println(name);

		// + ������ �� �� ������ ����� ������ String�̴�. (������ ����)
		System.out.println(name + name + name + name + name);
		name = "1000";
		age = 1000;
		System.out.println(name + 50);
		System.out.println(age + 50);

		int su1 = 20;
		int su2 = 4;
		System.out.println(su1 + su2);
		System.out.println("���: " + su1 + su2); //�տ����� ����ϱ� ������ ���20�� ������(String) �׸��� 4�� �������� ���204
		//�ذ���
		int sum = su1 + su2;
		System.out.println("���: " + sum);
		System.out.println("���: " + (su1 + su2));
	}
}