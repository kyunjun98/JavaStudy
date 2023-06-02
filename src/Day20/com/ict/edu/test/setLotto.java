package Day20.com.ict.edu.test;

import java.util.TreeSet;

public class setLotto {
	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<>();
		for (int i = 0; i < 6; i++) {
			int su = (int) (Math.random() * 45) + 1;
			if (!lotto.add(su)) {
				i--;
			}
		}
		System.out.println(lotto);
	}

}
