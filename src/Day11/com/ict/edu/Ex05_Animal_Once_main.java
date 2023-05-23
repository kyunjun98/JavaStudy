package Day11.com.ict.edu;

public class Ex05_Animal_Once_main {
	public static void main(String[] args) {

		Ex05_Animal_Once_method k1 = new Ex05_Animal_Once_method();

		k1.animal("엄지", 14, false);
		k1.getAnimal();
		k1.animal("까치", 14, true);
		k1.getAnimal();
	}
}
