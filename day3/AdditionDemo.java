package day3;

import java.util.Scanner;

public class AdditionDemo {

	public static void main(String[] args) {
		
		Addition add = new Addition();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number :");
		int a = scan.nextInt();
		System.out.println("Enter Second Number :");
		int b = scan.nextInt();
		add.add(a, b);
	}

}

class Addition{
	
	void add(int a, int b) {
		int sum = a+b;
		System.out.println("Sum of "+a+" and "+b+" is = "+sum);
	}
	
}