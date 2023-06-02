package Day20.com.ict.edu.test;

import java.util.ArrayList;

public class Test_List {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("이강인");
		list.add("김민채");
		list.add("손흥민");
		list.add("차범근");
		
		if(list.contains("손흥민")) {
			System.out.println(list.indexOf("손흥민"));
		}
		
		for (String string : list) {
			System.out.println(string);
		}
	}
}
