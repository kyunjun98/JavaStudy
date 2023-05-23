package Day12.com.ict.edu;

public class Ex02_method {
	//직접 접근을 막기 위해서 접근제한자를 사용함
	private String name ="홍길동";
	private int age = 24;
	private double weight = 72.6;
	
	//get() set()을 이용
	//지역변수와 전역변수 이름이 같으면
	//전역변수에 this를 붙인다.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	private boolean gendet = true;
	
	public boolean isGendet() {
		return gendet;
	}
	public void setGendet(boolean gendet) {
		this.gendet = gendet;
	}
	
}
