
public class Quiz_01 {
	public static void main(String[] args) {
		byte b = 10;
		short s = 20;
		char c = 'A';
		int i;
		float f;
		long l = 100L;
		
		s = b;	// byte -> short : promotion 
		c = (char)b;	// byte -> char : byte�� ���� ������
		s = (short)c;	// char -> short : 
		c = (char)s;
		
		// i = (int)100L;	// L�� 64��Ʈ¥�� long�� �ڷ���
		i = 100;
		
		l = 500;
		
		f = l;	// promotion
		
		// f = (float)5.11;
		f = 5.11f;
	}
}
