import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("좋아하는 OTT는?");
		System.out.println("1.Netflix\t 2.Disney\t 3.Watcha");
		System.out.print("번호 입력 >> ");
		int input = sc.nextInt();
		
		switch(input) {
			case 1:
				System.out.println("더 글로리 추천");
				break;
			case 2:
				System.out.println("겨울왕국 추천");
				break;
			case 3:
				System.out.println("없는 게 없다 아무거나 추천");
				break;
			default:
				break;
		}
	}
}
