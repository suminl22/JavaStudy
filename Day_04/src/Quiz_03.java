import java.util.Scanner;

public class Quiz_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String op;
		int num1, num2;
		
		while(true) {
			System.out.println("===계산기 프로그램===");
			System.out.print("연산자 입력(+,-,*,/) : ");
			op=sc.nextLine();
			
			switch(op) {
			case "+":
				System.out.println("첫 번째 숫자 입력 : ");
				num1 = Integer.parseInt(sc.nextLine());
				System.out.println("두 번째 숫자 입력 : ");
				num2 = Integer.parseInt(sc.nextLine());
				System.out.println("===== 결과 ======");
				System.out.println(num1 +" + "+ num2 +" = "+(num1+num2));
				break;
			case "-":
				System.out.println("첫 번째 숫자 입력 : ");
				num1 = Integer.parseInt(sc.nextLine());
				System.out.println("두 번째 숫자 입력 : ");
				num2 = Integer.parseInt(sc.nextLine());
				System.out.println("===== 결과 ======");
				System.out.println(num1 +" - "+ num2 +" = "+(num1-num2));
				break;
				
			case "*":
				System.out.println("첫 번째 숫자 입력 : ");
				num1 = Integer.parseInt(sc.nextLine());
				System.out.println("두 번째 숫자 입력 : ");
				num2 = Integer.parseInt(sc.nextLine());
				System.out.println("===== 결과 ======");
				System.out.println(num1 +" * "+ num2 +" = "+(num1*num2));
				break;
				
			case "/":
				System.out.println("첫 번째 숫자 입력 : ");
				num1 = Integer.parseInt(sc.nextLine());
				System.out.println("두 번째 숫자 입력 : ");
				num2 = Integer.parseInt(sc.nextLine());
				System.out.println("===== 결과 ======");
				System.out.println(num1 +" / "+ num2 +" = "+((double)num1/num2));
				break;
				
			case "q":
				return;
				
			default:
				System.out.println("연산자 입력이 잘못되었습니다.\n\n");
				break;
			}
		}
	}
}
