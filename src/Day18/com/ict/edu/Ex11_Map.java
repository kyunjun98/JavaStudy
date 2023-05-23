package Day18.com.ict.edu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex11_Map {
	public static void main(String[] args) {
		// 대한민국, 캐나다, 영국, 스위스의 수도가 각각 HashMap에 저장시키고
		// 원하는 나라가 key값이 되어, 화면에서 나라를 물어보면 수도가 출력되는 프로그램 작성

		HashMap<String, String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");

		Set<String> keys = map.keySet();
		Scanner sc = new Scanner(System.in);
		esc: while (true) {
			System.out.println("선택하세요>>");
			String country = sc.next();
			if (map.get(country) == null) {
				System.out.println("저장되어있지 않은 나라입니다.");
			} else if(keys.contains(country)) {
				System.out.println(map.get(country));
			}
			while (true) {
				System.out.println("다시 선택하겠습니까?(y/n)>>");
				String yn = sc.next();
				if (yn.equalsIgnoreCase("y")) {
					continue esc;
				} else if (yn.equalsIgnoreCase("n")) {
					break esc;
				} else {
					continue;

				}
			}
		}

	}
}
