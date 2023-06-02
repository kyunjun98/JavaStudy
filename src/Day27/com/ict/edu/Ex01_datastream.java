package Day27.com.ict.edu;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// DataInputStream과 DataOutputStream
// 기본자료형의 데이터를 주고 받을 때 사용
// 중요) 반드시 입력순서와 출력순서를 맞춰야 한다.
// 기본생성자가 없어서 BufferedStream처럼 FileStream을 이용해야 한다.

public class Ex01_datastream {
	public static void main(String[] args) {
		String pathName = "D:/KYJ/test03.txt";
		File file = new File(pathName);
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			
			//writeXXXX() => XXX는 기본자료형을 말한다.
			dos.writeChar(97);
			dos.writeChar('a');
			dos.writeInt(245);
			dos.writeDouble(178.95);
			dos.writeBoolean(false);
			dos.write('가');
			dos.writeChar(97);
			dos.writeChar('a');
			dos.flush();
			
			// readXXX(), XXX는 기본자료형이다.
			// 반드시 쓰기 순서대로 읽어야 함
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			System.out.println(dis.read());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				dis.close();
				fis.close();
				dos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
