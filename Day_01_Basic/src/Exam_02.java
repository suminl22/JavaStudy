
public class Exam_02 {
public static void main(String[] args) {
	// 변수와 자료형
	byte a = 1;	// 컴퓨터야! a라는 공간을 만들고 거기에 1을 저장해줘
	System.out.println(a);  // a에 있는 것을 출력해줘!
	
	// 1. 정수형
	// 가장 작은 메모리 단위 : bit
	// byte(1) short(2) char(2) int(4) long(8)
	
	// java 후반부에서 파일 전송, 업로드, 다운로드 할 때 많이 쓸 예정
	// a = 128; // Error! - 오버플로우
	a = 127;	// OK
	
	// short = 2 byte = 16 bit <= 32767
	// 거의 안 씀
	short b = 32767;	// OK
	
	// char는 아스키 코드에 있는 문자의 숫자를 저장한다. 양수만 가능
	// C, C++에서는 많이 쓰는데 java에서는 별로
	// 이것만 외워라!
	// 65 = 'A'     97 = 'a' 
	char c = 65000;
	
	// int = 4 byte = 32 bit
	// 이건 짱 많이 씀
	int d = 1000000000;		// 대충 십억 까지 가능
	
	// 나아중에 플젝에서는 쓸만 한데 수업에서는 안 쓸 듯
	long e = 100000000000000L;
	
	
	// 2. 실수형
	// float(4) double(8)
	float f = 3.14F;
	double g = 5.12;
	
	// 3. 논리형
	boolean h = true;	// false
	
	// 4. 참조형
	String i = "1234";
	
	}
}
