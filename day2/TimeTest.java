package day2;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int time = 32150;
		int hour = time / 3600;
		int min = time % 3600 / 60;
		int sec = time % 3600 % 60; 
		System.out.println(hour+"시간 "+ min + "분 " + sec + "초");

	}

}
