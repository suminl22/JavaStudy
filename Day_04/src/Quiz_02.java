import java.util.Scanner;

public class Quiz_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		int money = 3000;
		
		int cokeNum = 0;
		int cydarNum = 0;
		int maesilNum = 0;
		
		while(true) {
			System.out.println("=== 자판기 시뮬레이터 ===");
			System.out.println("음료수를 선택하세요.");
			System.out.println("1.콜라(1000)  2.사이다(800)  3.매실차(1500)  [0.소지품확인]");
			System.out.println(">> ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 0:
				System.out.println("======소지품 목록======");
				System.out.println("소지금: "+money);
				System.out.println("콜라: "+cokeNum+"개");
				System.out.println("사이다: "+cydarNum+"개");
				System.out.println("매실차: "+maesilNum+"개");
				System.out.println("====================\n");
				break;
				
			case 1:
				if(money>=1000) {
					System.out.println("콜라를 구매했습니다.");
					cokeNum++;
					System.out.println("콜라: 1개");
					System.out.println("소지금 -1000\n");
					money -= 1000;
				}else {
					System.out.println("잔액이 부족합니다.\n");
				}
				break;
			case 2:
				if(money>=800) {
					System.out.println("사이다를 구매했습니다.");
					cydarNum++;
					System.out.println("사이다: 1개");
					System.out.println("소지금 -800\n");
					money -= 800;
				}else {
					System.out.println("잔액이 부족합니다.\n");
				}
				break;
				
			case 3:
				if(money>=1500) {
					System.out.println("매실차를 구매했습니다.");
					maesilNum++;
					System.out.println("매실차: 1개");
					System.out.println("소지금 -1500\n");
					money -= 1500;
				}else {
					System.out.println("잔액이 부족합니다.\n");
				}
				break;	
				
			default:
				break;
			}
		
		}
	}

}
