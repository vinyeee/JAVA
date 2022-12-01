package day3;

public class ForLab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = (int)(Math.random() * (10 - 3 + 1)) + 3;
		int y = (int)(Math.random()* 3) + 1;
		System.out.println(x);
		System.out.println(y);
		if (y == 1) {
			for(int i = 1; i <= x; i++) {
				System.out.print("*");
			}
		}
		else if(y == 2){
			for(int i = 1; i <= x; i++) {
				System.out.print("$");
			}
			
		}else {
			for(int i = 1; i <= x; i++) {
				System.out.print("#");
			}
		}
		

	}

}
