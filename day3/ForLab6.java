package day3;

public class ForLab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final char C = '&';
		int x = (int)(Math.random() * (10 - 5 + 1)) + 5;
		
		System.out.println(x); 
		
		for (int i = 1; i <= x; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(C);
				
			}
			System.out.println();
		}
	}

}
