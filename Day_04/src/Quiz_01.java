import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 1;
		int account = 0;
		int input = 0;
		
		while(menu!=4) {
			System.out.println("***ATM �ùķ�����***");
			System.out.println("1. �ܾ���ȸ");
			System.out.println("2. �Ա��ϱ�");
			System.out.println("3. ����ϱ�");
			System.out.println("4. �����ϱ�");
			System.out.print(">> ");
			menu = sc.nextInt();
			
			switch(menu){
			case 1:
				System.out.println("���� ���� �ܾ��� " + account+"�� �Դϴ�.\n");
				break;
			case 2:
				System.out.print("�󸶸� �Ա��Ͻðڽ��ϱ�? >> ");
				input = sc.nextInt();
				account += input;
				System.out.println(input+"���� �ԱݵǾ����ϴ�.\n");
				break;
			case 3:
				System.out.print("�󸶸� ����Ͻðڽ��ϱ�? >> ");
				input = sc.nextInt();
				if((account-input)<0) {
					System.out.println("���� �ܾ��� �����մϴ�.\n");
				}else {
					account -= input;
					System.out.println(input+"���� ��ݵǾ����ϴ�.\n");
				}
				break;
			case 4:
				System.out.println("�����մϴ�.\n");
				return;
			default:
				break;
			}
		}
		
		sc.close();
	}
}
