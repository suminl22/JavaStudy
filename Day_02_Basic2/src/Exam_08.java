import java.util.Scanner;

public class Exam_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력버퍼란?!
		System.out.print("숫자 입력 : ");
		String str = sc.nextLine();
		
		// parseInt(num) : num을 숫자로 분석해라! 
		System.out.println(Integer.parseInt(str));
	}
}
