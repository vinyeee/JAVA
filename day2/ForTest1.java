package day2;

public class ForTest1 {
	public static void main(String[] args) {
		int num = 1;
		for(; num <= 10; num++) {
			System.out.println(num);
		}
		
		System.out.println();
		 
		for(; num <= 10; num+=2)
		        System.out.println(num);
		 System.out.println(num);
	}
}
