package day3;

public class WhileLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cnt = 0;
		
		while(true) {
			int x = (int)(Math.random() * 31);
			
			if (x == 0 || (x >= 27 && x <= 30)){
				break;
			}
			else{
				System.out.println((char)(x + 64) + "("+ x +")");
				cnt++;
			}
			
			
		}
		
		System.out.println("출력횟수는 "+ cnt +"번 입니다.");
		
	}

}
