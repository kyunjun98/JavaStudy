package Day15.com.ict.edu4;

public class Ex04_Terran implements Ex04_unit{
	private String name;
	private int energy;
	private boolean fly;
	
	public Ex04_Terran() {	}
	
	public Ex04_Terran(String name, int energy, boolean fly) {
		super();
		this.name = name;
		this.energy = energy;
		this.fly = fly;
	}

//	공격을 받으면 에너지가 떨어진다(에너지가 12떨어진다)
	@Override
	public void decEnergy() {
		energy = energy -12;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public boolean isFly() {
		return fly;
	}
	public void setFly(boolean fly) {
		this.fly = fly;
	}

	
	
	
	
}
