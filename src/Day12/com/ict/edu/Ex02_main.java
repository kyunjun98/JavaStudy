package Day12.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		Ex02_method p1 = new Ex02_method();
		//이름가져오기
		String str = p1.getName();
		System.out.println(str);
		
		//이름변경
		p1.setName("일지매");
		String res = p1.getName();
		System.out.println(res);
		
	}
}
