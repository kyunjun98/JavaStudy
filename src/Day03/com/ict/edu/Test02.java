package Day03.com.ict.edu;

public class Test02 {
	public static void main(String[] args) {
		//2시간 40분 30초는 몇초일까요
		
		int sec = 1;
		int hour = 3600 * sec;
		int min = 60 * sec;
		
		int time = 2*hour + 40*min + 30*sec;

		System.out.println(time + "초입니다.");
		
		//사용자가 쓰기편하게
		//시,분,초 입력
		int hr = 2;
		int min2 = 40;
		int sec2 = 30;
		
				//	시간				분			초
		int time2 = (hr * 3600) + (min2 * 60) + sec2;
		System.out.println(hr + "시 " + min2 + "분 " + sec2 + "초는 " + time2 + "초입니다.");
		
	}
}
