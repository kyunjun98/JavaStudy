package Day26.com.ict.edu;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// D:/KYJ/java1.png 읽어서 D:/KYJ/util/java1.png에 저장
public class Ex04_File_IO {
	public static void main(String[] args) {
		String pathName = "D:/KYJ/java1.png";
		String pathName2 = "D:/KYJ/util/java1.png";

		File file = new File(pathName);		
		File file2 = new File(pathName2);

		FileInputStream fis = null;
		BufferedInputStream bis = null;
				
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(file2,true);
			bos = new BufferedOutputStream(fos);
			
			int b = 0;
			while((b = bis.read()) != -1) {
				bos.write(b);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}