import java.io.*;

public class Exam_06 {
	public static void main(String[] args) throws Exception{
		// 한 글자 입력받기(버퍼) : System.in.read()
		// 예외전가 : throws Exception
		
		System.out.print("한 글자를 입력해주세요 >> ");
		int input = System.in.read();
		System.out.println("입력하신 문자 "+ (char)input + "의 아스키코드는 " +input+ " 입니다.");
		
	}
}