package jdbc.com.ict.edu3;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("선택하세요");
		System.out.print("1.테이블 전체 데이터 보기 \t ");
		System.out.print("2.테이블 특정 데이터 보기 \n");
		System.out.print("3.테이블 데이터 삽입 \t ");
		System.out.print("4.테이블 데이터 삭제 \n");
		System.out.print("5.테이블 데이터 수정 \n");
		System.out.print(">>>>>>>>>>>>>>>>>>> ");

		int menu = sc.nextInt();

		switch (menu) {
			case 1: 
				DAO.getInstance().getSelectAll();
				break;
			
			case 2: 
				System.out.println("조회할 고객아이디를 입력하세요.");
				System.out.print(">>>>>>>>>>>>>>>>>>> ");
				String c_id = sc.next();
				DAO.getInstance().getDetailSelect(c_id);
				break;
			
			case 3: 
				System.out.println("추가할 정보를 입력하세요.");
				System.out.println("고객아이디: ");
				String in_id = sc.next();
				System.out.println("고객이름: ");
				String in_name = sc.next();
				System.out.println("고객나이: ");
				int in_age = sc.nextInt();
				System.out.println("고객등급: ");
				String in_rank = sc.next();
				System.out.println("고객직업: ");
				String in_job = sc.next();
				System.out.println("고객적립금: ");
				int in_point = sc.nextInt();
				DAO.getInstance().getInsert(in_id, in_name, in_age, in_rank, in_job, in_point);
				break;
			
			case 4: 
				System.out.println("삭제할 고객아이디를 입력하세요.");
				System.out.print(">>>>>>>>>>>>>>>>>>> ");
				c_id = sc.next();
				DAO.getInstance().getDelete(c_id);
				break;
			case 5: 
				System.out.println("수정할 고객 정보를 입력하세요.");
				System.out.println("고객아이디: ");
				in_id = sc.next();
				System.out.println("고객이름: ");
				in_name = sc.next();
				System.out.println("고객나이: ");
				in_age = sc.nextInt();
				System.out.println("고객등급: ");
				in_rank = sc.next();
				System.out.println("고객직업: ");
				in_job = sc.next();
				System.out.println("고객적립금: ");
				in_point = sc.nextInt();
				DAO.getInstance().getUpdate(in_id, in_name, in_age, in_rank, in_job, in_point);
				break;
		}
	}
}
