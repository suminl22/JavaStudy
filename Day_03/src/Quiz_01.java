import java.util.Scanner;

public class Quiz_01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("오늘 점심메뉴를 선택하세요.");
		System.out.println("1.김밥	2.함박스테이크	3.서브웨이");
		System.out.print("메뉴 번호 입력 >> ");
		int menu = sc.nextInt();
		System.out.println();
		System.out.println("==============");
		if(menu==1) {
			System.out.println("상호명 : 김밥일번지");
			System.out.println("<특징>\n 1.도보 1분\n 2.메뉴가 다양함");
		}else if(menu==2) {
			System.out.println("상호명 : 유안타증권 지하 구내식당");
			System.out.println("<특징>\n 1.도보 10분\n 2.가격 : 7000원");
		}else if(menu==3) {
			System.out.println("상호명 : SUBWAY");
			System.out.println("<특징>\n 1.도보 1분\n 2.건강한 기분");
		}else {
			System.out.println("주어진 메뉴 중에서 선택하시오!");
		}
	}
}
