import java.io.*;

public class Exam_06 {
	public static void main(String[] args) throws Exception{
		// �� ���� �Է¹ޱ�(����) : System.in.read()
		// �������� : throws Exception
		
		System.out.print("�� ���ڸ� �Է����ּ��� >> ");
		int input1 = System.in.read();
		System.out.println("�Է��Ͻ� ���ڴ� " +input1+ " �Դϴ�.");
		// input1 = A�̸�, ���ۿ��� 'A''\r''\n' �� 3���� ����.
		// System.in.read()�� ���۸� �̿��Ͽ� input�� �޴� ģ���̱� ������
		// �����ؼ� ����ϸ� ù ��° �Է°��� ���� ���۷� ���� 3���� �� ���� �Է¿� ������ �ش�.
		
		System.out.print("�� ���ڸ� �Է����ּ��� >> ");
		int input2 = System.in.read();
		System.out.println("�Է��Ͻ� ���ڴ� " +input2+ " �Դϴ�.");	// \r�� �ƽ�Ű�ڵ��� 13 ���
		
		System.out.print("�� ���ڸ� �Է����ּ��� >> ");
		int input3 = System.in.read();
		System.out.println("�Է��Ͻ� ���ڴ� " +input3+ " �Դϴ�.");	// \n�� �ƽ�Ű�ڵ��� 10 ���
		
		System.out.print("�� ���ڸ� �Է����ּ��� >> ");
		int input4 = System.in.read();
		System.out.println("�Է��Ͻ� ���ڴ� " +input4+ " �Դϴ�.");	// ���⼭���ʹ� ���۰� �� ���� �Է� ����
		
		// Scanner�� ���۸� ����Ѵٱ�!
		
		// ���� �Է� �ް� �������� ���ڿ� �Է¹������� �ϸ� ����X
		// why?? ���ۿ� EnterŰ�� ���Ƽ�!
		
		// int kor = sc.nextInt();
		// sc.nextLine();	// enter ó���� or space bar �̿��ϱ�
		// String name = sc.nextLine();
		
	}
}