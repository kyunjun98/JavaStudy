package Day28.com.ict.edu;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// ObjectInputStream: 객체 입력 스트림
// readObject(): 객체 역직렬화 메서드
public class Ex04_ObjectInputStream {
	public static void main(String[] args) {
		
		String pathname = "D:/KYJ/object02.ser";
		File file = new File(pathname);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			// 역직렬화
			ArrayList<Ex04_VO> list = (ArrayList<Ex04_VO>) ois.readObject();
			for (Ex04_VO ex04_VO : list) {
				System.out.print(ex04_VO.getName() + "\t");
				System.out.print(ex04_VO.getAge() + "\t");
				System.out.print(ex04_VO.getAddr() + "\t");
				if(ex04_VO.isGender()) {
					System.out.print("남성 \t");
				} else System.out.print("여성 \t");
				System.out.print(ex04_VO.getHeight() + "\n");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
