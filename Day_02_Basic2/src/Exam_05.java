
public class Exam_05 {
	public static void main(String[] args) {
		int a = 10;
		// 대입연산자 규칙 1. 우항이 좌항으로 대입된다.(예외 없음)
		// 대입연산자 규칙 2. 그러므로 좌항은 반드시 공간이어야만 한다. (변수)
		
		// A+=B
		// int A = 10;	int B = 20;
		
		// A = A + B;
		// A = 10 + 20		좌항은 공간, 우항은 값
		
		int x = 10;
		boolean result;
		result = x>10 && x<20;
		
		char ch = 'a';
		result = ch=='y' || ch =='Y';
		
		result = ((x>=100)&&(x<=200))||x==300;
	}
}
