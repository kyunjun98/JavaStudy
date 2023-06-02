package Day09.com.ict.edu;

public class Ex04_Array {
	public static void main(String[] args) {
		//순위 구하기
		//1. 모든 사람의 순위를 1등으로 초기값을 지정한다.
		//2. 모든사람과 비교해야 된다. (자기자신은 제외)
		//3. 나(i)보다 남(j)이 크면 내 순위를 증가시킨다.
		
		int[] sum = {74,60,100,90,70,95};
		int[] rank = {1,1,1,1,1,1};
		for(int i=0; i<sum.length; i++) {
			for(int j=0; j<sum.length; j++) {
				if(sum[i]<sum[j]) {
					rank[i] += 1;
				}
			}
		}
		for(int k : rank) {
			System.out.println(k);
		}
	}
}
