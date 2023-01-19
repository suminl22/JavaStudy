import java.io.*;

public class Exam_06 {
	public static void main(String[] args) throws Exception{
		// 한 글자 입력받기(버퍼) : System.in.read()
		// 예외전가 : throws Exception
		
		System.out.print("한 글자를 입력해주세요 >> ");
		int input1 = System.in.read();
		System.out.println("입력하신 문자는 " +input1+ " 입니다.");
		// input1 = A이면, 버퍼에는 'A''\r''\n' 총 3개가 들어간다.
		// System.in.read()는 버퍼를 이용하여 input을 받는 친구이기 때문에
		// 연속해서 사용하면 첫 번째 입력값을 통해 버퍼로 들어온 3개가 그 다음 입력에 영향을 준다.
		
		System.out.print("한 글자를 입력해주세요 >> ");
		int input2 = System.in.read();
		System.out.println("입력하신 문자는 " +input2+ " 입니다.");	// \r의 아스키코드인 13 출력
		
		System.out.print("한 글자를 입력해주세요 >> ");
		int input3 = System.in.read();
		System.out.println("입력하신 문자는 " +input3+ " 입니다.");	// \n의 아스키코드인 10 출력
		
		System.out.print("한 글자를 입력해주세요 >> ");
		int input4 = System.in.read();
		System.out.println("입력하신 문자는 " +input4+ " 입니다.");	// 여기서부터는 버퍼가 비어서 새로 입력 가능
		
		// Scanner도 버퍼를 사용한다구!
		
		// 숫자 입력 받고 다음으로 문자열 입력받으려고 하면 실행X
		// why?? 버퍼에 Enter키가 남아서!
		
		// int kor = sc.nextInt();
		// sc.nextLine();	// enter 처리용 or space bar 이용하기
		// String name = sc.nextLine();
		
	}
}