package Day11.com.ict.edu;

public class Ex03_instance_return_main {
	public static void main(String[] args) {
		Ex03_instance_return_method k = new Ex03_instance_return_method();
		//반환형일 경우 return 후 저장을 반드시 해줘야 한다!
		int sum = k.getSum();
		double avg = k.getAvg();
		String hak = k.getHak();
		
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(hak);
	}
}
