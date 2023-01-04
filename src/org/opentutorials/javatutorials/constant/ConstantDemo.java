package org.opentutorials.javatutorials.constant;

public class ConstantDemo {

	public static void main(String[] args) {
		float a = 2.2F; // float도 실수 2.2도 실수인데 에러가 뜸 
		double b = 2.2;
		System.out.println(a+b);
		
		int c = 2147483647;
	    long d = 2147483648L; // error because 2147483648 is still an int 
		
	    byte e = 100; // can use int to byte and short 
	    short f = 200;
		

	}

}
