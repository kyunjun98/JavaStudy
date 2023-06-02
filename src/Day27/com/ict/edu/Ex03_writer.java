package Day27.com.ict.edu;

import java.io.File;
import java.io.FileWriter;

// 지금까지는 FileOutputStream => 1byte 처리, write(아스키코드), write(byte[] b) 했고
// 이제는 FileWriter => 2byte 처리, write(String str); 
public class Ex03_writer {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			String pasthName = "D:/KYJ/test05.txt";
			File file = new File(pasthName);
			fw = new FileWriter(file);
			
			// 내용
			String msg = "안녕하세요 12345 hello";
			fw.write(msg);
			fw.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
