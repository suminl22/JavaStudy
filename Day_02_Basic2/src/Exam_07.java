import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		// '문장'을 입력받는 기능
		
		// ctrl + shift + o : 자동 import 기능 단축키
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메세지를 남겨주세요.");
		String str = sc.nextLine();
		
		System.out.println("<< 당신이 남긴 메세지는 >>");
		System.out.println(str);
	}
}
