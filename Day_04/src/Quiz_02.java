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
			System.out.println("=== ���Ǳ� �ùķ����� ===");
			System.out.println("������� �����ϼ���.");
			System.out.println("1.�ݶ�(1000)  2.���̴�(800)  3.�Ž���(1500)  [0.����ǰȮ��]");
			System.out.println(">> ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 0:
				System.out.println("======����ǰ ���======");
				System.out.println("������: "+money);
				System.out.println("�ݶ�: "+cokeNum+"��");
				System.out.println("���̴�: "+cydarNum+"��");
				System.out.println("�Ž���: "+maesilNum+"��");
				System.out.println("====================\n");
				break;
				
			case 1:
				if(money>=1000) {
					System.out.println("�ݶ� �����߽��ϴ�.");
					cokeNum++;
					System.out.println("�ݶ�: 1��");
					System.out.println("������ -1000\n");
					money -= 1000;
				}else {
					System.out.println("�ܾ��� �����մϴ�.\n");
				}
				break;
			case 2:
				if(money>=800) {
					System.out.println("���̴ٸ� �����߽��ϴ�.");
					cydarNum++;
					System.out.println("���̴�: 1��");
					System.out.println("������ -800\n");
					money -= 800;
				}else {
					System.out.println("�ܾ��� �����մϴ�.\n");
				}
				break;
				
			case 3:
				if(money>=1500) {
					System.out.println("�Ž����� �����߽��ϴ�.");
					maesilNum++;
					System.out.println("�Ž���: 1��");
					System.out.println("������ -1500\n");
					money -= 1500;
				}else {
					System.out.println("�ܾ��� �����մϴ�.\n");
				}
				break;	
				
			default:
				break;
			}
		
		}
	}

}
