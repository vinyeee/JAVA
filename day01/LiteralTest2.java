package day01;

public class LiteralTest2 {

	public static void main(String[] args) {
		System.out.println("123456789t123456789t123456789");			// 일반문자 t
		System.out.println("123456789\t123456789\t123456789");			// tab
		System.out.println("123456789n123456789n123456789");			// 일반문자 n
		System.out.println("123456789\n123456789\n123456789");			// enter(줄바꿈)
		System.out.println("123456789\n\n123456789\n\n123456789");		// 두 번 줄바꿈
		System.out.println("\n\n\n");									// 세 번 줄바꿈
		System.out.println('가');		//println()는 줄바꿈 기능이 있다. 										
		System.out.println('나');
		System.out.println('다');
		System.out.println("\n\n\n");
		System.out.print('가');			//print()는 줄바꿈 기능이 없다.
		System.out.print('나');
		System.out.print('다');
	}
}
