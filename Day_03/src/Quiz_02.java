import java.util.Scanner;

public class Quiz_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번재 숫자 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 숫자 입력 : ");
		int num2 = sc.nextInt();
		System.out.println("==== 결과 ==== ");
		
		if(num1<num2) {
			System.out.println("두 번째 입력한 값("+num2+")이 더 크다.");
		}else if(num1==num2) {
			System.out.println("두 입력 값이 같다");
		}else {
			System.out.println("첫 번째 입력한 값("+num1+")이 더 크다.");
		}
	}
}
