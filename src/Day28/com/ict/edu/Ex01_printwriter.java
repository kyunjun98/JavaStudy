package Day28.com.ict.edu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

// PrintStream: 1byte 처리, 모든 데이터 출력할 수 있음 (System.out.println())에서 println()이다.
// 				BufferedStream처럼 OutputStream을 이용해서 사용(체인방식)

// PrintWriter: OutputStream(바이트출력), Write(문자출력) 둘 다 사용 가능
public class Ex01_printwriter {
	public static void main(String[] args) {
		String pathName = "D:/KYJ/exam100.txt";
		File file = new File(pathName);
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			// 체인방식
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			
			pw.println("PrintWriter 연습");
			pw.print(123456);
			pw.println('A');
			pw.print(true);
			pw.print(3.145);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				pw.close();
				bw.close();
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
