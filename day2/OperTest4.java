package day2;

public class OperTest4 {

	public static void main(String[] args) {
		int num1=100, num2=50;
		
		System.out.println(num1+num2);	//150
		System.out.println(num1-num2);	//50
		System.out.println(num1*num2);	//5000
		System.out.println(num1/num2);	//2
		System.out.println(num1%num2);	//0
		
		System.out.println(num1>num2);	//true
		System.out.println(num1<num2);	//false
		System.out.println(num1==num2); // equal 두 항의 값이 동일하면 true =>false
		System.out.println(num1!=num2); // not equal 두 항의 값이 다르면 true => true
		
		System.out.println(num1>0 && num2>0);	//true
		System.out.println(num1>0 && num2==0);	//false
		
		System.out.println(num1>0 || num2>0);	//true
		System.out.println(num1>0 || num2==0);	//true
		
		System.out.println(num1 + 10 > 110 && num2 % 2 == 0);	//false
		System.out.println(num1>0 && num2 % 2 == 1);	//false

	}

}
