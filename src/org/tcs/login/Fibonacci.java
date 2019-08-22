package org.tcs.login;

public class Fibonacci {

	public static void main (String[] args) {
		
		int n=10,a=0,b=1;
		
		System.out.println("Fibonacci Series of "+n+ "numbers");
		
		for (int i = 1; i <=n; i++) {
			System.out.println(a+" ");
			int sum=a+b;
			a=b;
			b=sum;
			
		}
		
	}
	

}	 