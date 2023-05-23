package Day13.com.ict.edu;

public class galbalbo_method {
	private int draw = 0;
	private int win = 0;
	private int lose = 0;
	
	public void setDraw() {
		System.out.println("비김");
		draw++;
	}
	
	public int getDraw() {
		return draw;
	}	
	
	public void setWin() {
		System.out.println("이김");
		win++;
	}
	
	public int getWin() {
		return win;
	}	
	
	public void setLose() {
		System.out.println("짐");
		lose++;
	}
	public int getLose() {
		return lose;
	}
}
