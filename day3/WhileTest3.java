package day3;

public class WhileTest3 {

	public static void main(String[] args) {
		System.out.println("main() 수행 시작");
		char hangul = '가';
		while(hangul <= '나') 
			System.out.print(hangul++);		

		System.out.println("\nmain() 수행 종료");
	}
}
