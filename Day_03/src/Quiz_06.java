import java.util.Scanner;

public class Quiz_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = "Hello Java while";
		int i=0;
		
		System.out.print("���ڸ� �Է��Ͻÿ�>> ");
		int count = sc.nextInt();
		
		while(i<count) {
			System.out.println(s);
			i++;
		}
	}

}
