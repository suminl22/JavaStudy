import java.util.Scanner;

public class Quiz_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====================");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.println("====================");
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		System.out.println("====================");
		int sum = kor+eng+math;
		System.out.println("합계 : " + sum);
		double avg = (double)sum/3;
		System.out.println("평균 : " + avg);
		System.out.println("====================");
		
	}
}
