import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����ϴ� OTT��?");
		System.out.println("1.Netflix\t 2.Disney\t 3.Watcha");
		System.out.print("��ȣ �Է� >> ");
		int input = sc.nextInt();
		
		switch(input) {
			case 1:
				System.out.println("�� �۷θ� ��õ");
				break;
			case 2:
				System.out.println("�ܿ�ձ� ��õ");
				break;
			case 3:
				System.out.println("���� �� ���� �ƹ��ų� ��õ");
				break;
			default:
				break;
		}
	}
}
