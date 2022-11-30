package day2;

public class ConditionOperLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = (int)(Math.random()*5) + 1;
		
		if (num == 1) {
			System.out.println("결과값:" + (300 + 50));
		}
		else if (num == 2) {
			System.out.println("결과값:" + (300 - 50));
		}
		else if (num == 3) {
			System.out.println("결과값:" + (300 * 50));
		}
		else if (num == 4) {
			System.out.println("결과값:" + (300 / 50));
		}
		else if (num == 5) {
			System.out.println("결과값:" + (300 % 50));
		}


	}

}

