package Day27.com.ict.edu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.Buffer;

public class Ex04_writer_buffered {
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			String pasthName = "D:/KYJ/ex04.txt";
			File file = new File(pasthName);
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			// 내용
			bw.write("안녕하세요");
			bw.newLine();
			bw.write("123123");
			bw.newLine();
			bw.write("hello");
			bw.newLine();
			
			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
