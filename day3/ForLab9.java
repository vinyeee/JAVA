package day3;

public class ForLab9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = (int)(Math.random() * 2) + 1;
		
		if (x == 1 ) {
			for (int i = 1; i <= 9; i += 2) {
				for(int j = 1; j <= 9; j++) {
					System.out.println( i + "x" + j + "=" + (i * j));
				}
				System.out.println();
			}
			
		}else {
			for (int i = 2; i <= 9; i += 2) {
				for(int j = 1; j <= 9; j++) {
					System.out.println( i + "x" + j + "=" + (i * j));
				}
				System.out.println();
			}
			
		}
		
	}

}
