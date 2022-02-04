package day3;

import java.util.Scanner;

public class MultiplicationDemo {

	public static void main(String[] args) {
		Multiplication mul=new Multiplication();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First Number :");
		int a = scan.nextInt();
		System.out.println("Enter Second Number :");
		int b = scan.nextInt();
		mul.mul(a,b);
	}

}
class Multiplication{
	
	void mul(int a, int b) {
		int mul = a*b;
		System.out.println("multiplication of "+a+" and "+b+" is = "+mul);
	}
	
}