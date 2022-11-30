package day2;

public class SwitchLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num = (int)(Math.random()*5) + 1;
		
	

		switch(num) {
		
		case 1: 
			System.out.println("결과값:" + (300 + 50));
			break;
		case 2:
			System.out.println("결과값:" + (300 - 50));
			break;
		case 3:
			System.out.println("결과값:" + (300 * 50));
			break;
		case 4:
			System.out.println("결과값:" + (300 / 50));
			break;
		case 5:
			System.out.println("결과값:" + (300 % 50));
			break;
		
		
		}
	}

}
