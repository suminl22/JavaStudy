import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �����ϴ� ������ �����Դϱ�?");
		System.out.println("1. ���	2.����	3. ����");
		System.out.print(">> ");
		// int menu = Integer.parseInt(sc.nextLine());
		int menu = sc.nextInt();
		
		if(menu == 1) {
			System.out.println("����� ����� Apple!");
		}else if(menu == 2) {
			System.out.println("����� ����� Mango!");
		}else if(menu == 3) {
			System.out.println("����� ����� Strawberry!");
		}else {
			System.out.println("�Ŵ� �ٽ� Ȯ�����ּ���");
		}
	}
}
