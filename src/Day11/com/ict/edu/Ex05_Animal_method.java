package Day11.com.ict.edu;

import java.util.Scanner;

public class Ex05_Animal_method {
	//생존여부
	boolean live;
	//나이
	int age;
	//이름
	String name;
	
	//생존여부를 변경하는 메서드
	public void setLive(boolean x) {
		live = x;
	}
	//생존여부를 반환하는 메서드
	public boolean getLive() {
		return live;
	}
	//나이를 변경하는 메서드
	public void setAge(int x) {
		age = x;
	}
	//나이를 반환하는 메서드
	public int getAge() {
		return age;
	}
	//이름을 변경하는 메서드
	public void setName(String x) {
		name = x;
	}
	//이름을 반환하는 메서드
	public String getName() {
		return name;
	}
}
