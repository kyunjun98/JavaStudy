package Day02.com.ict.edu;

class test3 {
	public static void main(String[] args) {
		//���Ƕ�̵� �ڿ� ����� �� �پ�� �ۼ��ʿ�x
		for(int a = 1; a<10; a+=2) {
			for(int b = 0; b<a; b+=2) {
				System.out.print(" ");
			}
			for(int c = 10; a<c; c--) {
				System.out.print("*");
			}
			System.out.println();
		}
			
			System.out.println();

		//���̾Ƹ�� �����
		for(int i = 1; i<10; i+=2) {
			for(int j = 10; i<j; j-=2) {
				System.out.print(" ");
			}
			for(int k = 0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<10; i+=2) {
			for(int j = 0; i>j; j+=2) {
				System.out.print(" ");
			}
			for(int k = 10; k>i; k--) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
}