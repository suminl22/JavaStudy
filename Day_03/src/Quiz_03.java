import java.util.Scanner;

public class Quiz_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~100 ���� �Է� : ");
		int num = sc.nextInt();
		
		if(num>=1&&num<=100) {
			System.out.println("===���===");
			String result;
			if(num%2==0) {
				result = "¦��";
			}else {
				result = "Ȧ��";
			}
			System.out.println("�Է��� ���� "+result+" �Դϴ�.");
		}else {
			System.out.println("�Է��� ���� ������ ������ϴ�.");
		}
	}
}
