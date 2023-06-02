package Day12.com.ict.edu;

public class Ex08_main {
	public static void main(String[] args) {
		Ex08_Constructor coffee = new Ex08_Constructor("따듯한 아이스아메리카노", 7000);	
		Ex08_Constructor ion = new Ex08_Constructor("따듯한 이온음료", 700);	
		Ex08_Constructor cola = new Ex08_Constructor("탄산빠진 콜라", 1000);	
		Ex08_Constructor ju = new Ex08_Constructor("오렌지주스", 2000);	
		
		Ex08_Constructor[] arr = {coffee, ion, cola, ju};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].getPrn());
		}
	}
}
