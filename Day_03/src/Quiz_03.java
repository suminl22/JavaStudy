import java.util.Scanner;

public class Quiz_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~100 사이 입력 : ");
		int num = sc.nextInt();
		
		if(num>=1&&num<=100) {
			System.out.println("===결과===");
			String result;
			if(num%2==0) {
				result = "짝수";
			}else {
				result = "홀수";
			}
			System.out.println("입력한 수는 "+result+" 입니다.");
		}else {
			System.out.println("입력한 값이 범위를 벗어났습니다.");
		}
	}
}
