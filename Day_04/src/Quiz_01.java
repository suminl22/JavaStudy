import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 1;
		int account = 0;
		int input = 0;
		
		while(menu!=4) {
			System.out.println("***ATM 시뮬레이터***");
			System.out.println("1. 잔액조회");
			System.out.println("2. 입금하기");
			System.out.println("3. 출금하기");
			System.out.println("4. 종료하기");
			System.out.print(">> ");
			menu = sc.nextInt();
			
			switch(menu){
			case 1:
				System.out.println("현재 보유 잔액은 " + account+"원 입니다.\n");
				break;
			case 2:
				System.out.print("얼마를 입금하시겠습니까? >> ");
				input = sc.nextInt();
				account += input;
				System.out.println(input+"원이 입금되었습니다.\n");
				break;
			case 3:
				System.out.print("얼마를 출금하시겠습니까? >> ");
				input = sc.nextInt();
				if((account-input)<0) {
					System.out.println("계좌 잔액이 부족합니다.\n");
				}else {
					account -= input;
					System.out.println(input+"원이 출금되었습니다.\n");
				}
				break;
			case 4:
				System.out.println("종료합니다.\n");
				return;
			default:
				break;
			}
		}
		
		sc.close();
	}
}
