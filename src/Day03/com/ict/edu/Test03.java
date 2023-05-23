package Day03.com.ict.edu;

public class Test03 {
	public static void main(String[] args) {
		//3989초는 몇시간 몇분 몇초인가
				//초 값 입력
		int time = 3989;
				//총 초에 3600초 나누기 = 시간
		int hour = time/3600;
				//시간을 계산하고 남은 초를 60초로 나누기 = 분
		int min = (time%3600)/60;
				//분까지 계산하고 남은 초
		int sec = time%60;
		
		System.out.println(time + "초는 " + hour + "시간 " + min + "분 " + sec + "초입니다.");
	}
}
