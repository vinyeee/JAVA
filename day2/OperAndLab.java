package day2;

public class OperAndLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade = (int)(Math.random() * 6) + 1;
		
		char result;
		if (grade >= 1 && grade <=3)
			result = '저';
		else
			result = '고';
		
		System.out.println(grade + "학년은 " + result +"학년입니다." );
		
			
		
		

	}

}
