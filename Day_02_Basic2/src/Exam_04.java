
public class Exam_04 {
public static void main(String[] args) {
		// 1020
		// 30
		// 103.14
		// 13.14
		// 3.1410     -> 땡!  	// 3.14A	// char는 단독이라면 무조건 문자로 출력!
		// 68.14
		// AB
		// 131
		
		int i1 = 10;
		int i2 = 20;
		float f1 = 3.14f;
		char c1 = 'A';
		char c2 = 'B';
		
		System.out.println("결과 : " + i1 + i2);
		System.out.println("결과 : " + (i1 + i2));
		System.out.println("결과 : " + i1 + f1);
		System.out.println("결과 : " + (i1 + f1));
		System.out.println("결과 : " + f1 + c1);
		System.out.println("결과 : " + (f1 + c1));
		System.out.println("결과 : " + c1 +c2);
		System.out.println("결과 : " + (c1 +c2));
	}
}
