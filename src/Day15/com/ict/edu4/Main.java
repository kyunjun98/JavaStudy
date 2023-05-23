package Day15.com.ict.edu4;

public class Main {
	public static void main(String[] args) {
		Ex04_Terran terran = new Ex04_Terran();
		terran.setName("마린");
		terran.setFly(false);
		terran.setEnergy(40);
		
		Ex04_protoss protoss = new Ex04_protoss("질럿", 80, false);
		
		Ex04_Zerg zerg = new Ex04_Zerg("뮤탈", 120, true);
		
		terran.decEnergy();
		zerg.decEnergy();
		protoss.decEnergy();
		
		System.out.println("테란에너지: " + terran.getEnergy());
		System.out.println("프로토스에너지: " + zerg.getEnergy());
		System.out.println("저그에너지: " + protoss.getEnergy());
		System.out.println();
		
		terran.decEnergy();
		terran.decEnergy();
		System.out.println("테란에너지: " + terran.getEnergy());
		System.out.println("프로토스에너지: " + zerg.getEnergy());
		System.out.println("저그에너지: " + protoss.getEnergy());
		System.out.println();
		
	}
}
