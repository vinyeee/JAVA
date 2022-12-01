package day3;

public class WhileLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = (int)(Math.random() * (10 - 5 + 1)) + 5;
		
		// [for 결과]
		
		System.out.println("[for 결과]");
		
		for (int i = 1; i <= x; i ++) {
			System.out.println(i + " -> " + (int)Math.pow(i, 2));
		}
		
		
		System.out.println();
		
		// [While 결과]
		
		System.out.println("[while 결과]");
		
		int i = 1 ;
		while(i <= x) {
			System.out.println(i + " -> " + (int)Math.pow(i, 2));
			i++;
		}
	}

}
