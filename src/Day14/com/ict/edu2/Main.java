package Day14.com.ict.edu2;

public class Main {
	public static void main(String[] args) {
		
		MP3_Phone mp3 = new MP3_Phone();
		DCa_Phone dca = new DCa_Phone();
		
		//부모클래스에서 불러옴
		mp3.call();
		mp3.sms();
		
		
		mp3.sound();
		dca.picture();
	}
}
