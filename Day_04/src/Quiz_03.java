import java.util.Scanner;

public class Quiz_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String op;
		int num1, num2;
		
		while(true) {
			System.out.println("===���� ���α׷�===");
			System.out.print("������ �Է�(+,-,*,/) : ");
			op=sc.nextLine();
			
			switch(op) {
			case "+":
				System.out.println("ù ��° ���� �Է� : ");
				num1 = Integer.parseInt(sc.nextLine());
				System.out.println("�� ��° ���� �Է� : ");
				num2 = Integer.parseInt(sc.nextLine());
				System.out.println("===== ��� ======");
				System.out.println(num1 +" + "+ num2 +" = "+(num1+num2));
				break;
			case "-":
				System.out.println("ù ��° ���� �Է� : ");
				num1 = Integer.parseInt(sc.nextLine());
				System.out.println("�� ��° ���� �Է� : ");
				num2 = Integer.parseInt(sc.nextLine());
				System.out.println("===== ��� ======");
				System.out.println(num1 +" - "+ num2 +" = "+(num1-num2));
				break;
				
			case "*":
				System.out.println("ù ��° ���� �Է� : ");
				num1 = Integer.parseInt(sc.nextLine());
				System.out.println("�� ��° ���� �Է� : ");
				num2 = Integer.parseInt(sc.nextLine());
				System.out.println("===== ��� ======");
				System.out.println(num1 +" * "+ num2 +" = "+(num1*num2));
				break;
				
			case "/":
				System.out.println("ù ��° ���� �Է� : ");
				num1 = Integer.parseInt(sc.nextLine());
				System.out.println("�� ��° ���� �Է� : ");
				num2 = Integer.parseInt(sc.nextLine());
				System.out.println("===== ��� ======");
				System.out.println(num1 +" / "+ num2 +" = "+((double)num1/num2));
				break;
				
			case "q":
				return;
				
			default:
				System.out.println("������ �Է��� �߸��Ǿ����ϴ�.\n\n");
				break;
			}
		}
	}
}
