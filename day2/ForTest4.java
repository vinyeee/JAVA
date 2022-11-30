package day2;

public class ForTest4 {

	public static void main(String[] args) {
		// 1부터 10까지의 합을 출력
		int sumV = 0;

		for (int n = 1; n <= 10; n++) {
			sumV += n;
		} // 1~10까지 수를  모두 더하는 for문
		System.out.println(sumV);
		sumV = 0;
		for (int n = 1; n <= 10; n++) {
			sumV += n*n;
		} // 1부터  10까지의 제곱 값을 모두 더하는 for문
		System.out.println(sumV);
		
	}
}
