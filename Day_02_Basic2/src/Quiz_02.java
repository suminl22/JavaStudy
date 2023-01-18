import java.util.Scanner;

public class Quiz_02 {
	public static void main(String[] args) {
		// 1. 두 숫자를 입력받아 덧셈한 결과를 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 두 개를 입력하시오>> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int result1 = num1+num2;
		System.out.println(num1 + " + " + num2 + " = " + result1);

		
		
	}
}
