import java.util.Scanner;

public class Quiz_01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ���ɸ޴��� �����ϼ���.");
		System.out.println("1.���	2.�Թڽ�����ũ	3.�������");
		System.out.print("�޴� ��ȣ �Է� >> ");
		int menu = sc.nextInt();
		System.out.println();
		System.out.println("==============");
		if(menu==1) {
			System.out.println("��ȣ�� : ����Ϲ���");
			System.out.println("<Ư¡>\n 1.���� 1��\n 2.�޴��� �پ���");
		}else if(menu==2) {
			System.out.println("��ȣ�� : ����Ÿ���� ���� �����Ĵ�");
			System.out.println("<Ư¡>\n 1.���� 10��\n 2.���� : 7000��");
		}else if(menu==3) {
			System.out.println("��ȣ�� : SUBWAY");
			System.out.println("<Ư¡>\n 1.���� 1��\n 2.�ǰ��� ���");
		}else {
			System.out.println("�־��� �޴� �߿��� �����Ͻÿ�!");
		}
	}
}
