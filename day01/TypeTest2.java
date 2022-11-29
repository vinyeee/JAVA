package day01;
public class TypeTest2 {
	public static void main(String[] args) {
		int num = 1000;
		System.out.println(1+num);			//1001
		System.out.println(1.0+num);		//1001.0
		System.out.println('1'+num);		//1049
		System.out.println("1"+num);		//11000
		System.out.println(7777777777L);	//대문자L 생략시 에러 => 오버플로우
	}
}
