import java.util.Scanner;

public class Quiz_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ���� ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.println("�� ��° ���� �Է� : ");
		int num2 = sc.nextInt();
		System.out.println("==== ��� ==== ");
		
		if(num1<num2) {
			System.out.println("�� ��° �Է��� ��("+num2+")�� �� ũ��.");
		}else if(num1==num2) {
			System.out.println("�� �Է� ���� ����");
		}else {
			System.out.println("ù ��° �Է��� ��("+num1+")�� �� ũ��.");
		}
	}
}
