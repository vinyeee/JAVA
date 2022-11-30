package day2;

public class ForLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = (int)(Math.random() * 10) + 1;
		int y = (int)(Math.random()* (40 - 30 + 1)) + 30;
		
		int sum = 0;
		for(int i = x; i <= y; i++) {
			sum += i;
			
		}
		System.out.println(sum);
	}

}
