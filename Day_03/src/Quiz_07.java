import java.util.Scanner;

public class Quiz_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("=== 구구단 출력 프로그램 ===");
			System.out.print("1~9단 중 선택 : ");
			int num = sc.nextInt();
			
			if(1<num&&num<10) {
				int i = 1;
	
				while(i<10) {
					System.out.println(num+" * "+i+" = "+num*i);
					i++;
				}
				
				System.out.println();
			}else {
				System.out.println("구구단 범위를 벗어났습니다.");
			}
		}

	}
}
