package day2;

public class ConditionOperLab2_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = (int)(Math.random()*5) + 1;
		int result ;
		if (num == 1) {
			result = 300 + 50;
			System.out.println("결과값:" + result);
		}
		else if (num == 2) {
			result = 300 - 50;
			System.out.println("결과값:" + result);
		}
		else if (num == 3) {
			result = 300 * 50;
			System.out.println("결과값:" + result);
		}
		else if (num == 4) {
			result = 300 / 50;
			System.out.println("결과값:" + result);
		}
		else if (num == 5) {
			result = 300 % 50;
			System.out.println("결과값:" + result);
		}


	}

}
