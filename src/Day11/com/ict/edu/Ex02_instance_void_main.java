package Day11.com.ict.edu;

public class Ex02_instance_void_main {
	public static void main(String[] args) {
		Ex02_instance_void_method k = new Ex02_instance_void_method();
		System.out.println("========메서드 미실행========");
		System.out.println("총점: " + k.sum);
		System.out.println("평균: " + k.avg);
		System.out.println("학점: " + k.hak);
		
		System.out.println("========메서드 실행========");
		k.getSum();
		k.getAvg();
		k.getHak();
		System.out.println("총점: " + k.sum); //이 부분을 메서드 안에다가 넣는다면?
		System.out.println("평균: " + k.avg); //인스턴스변수 안만들고 메서드안에서 모든걸 해결할수 있다.
		System.out.println("학점: " + k.hak);
	}
}
