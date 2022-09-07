package corejava;

import java.util.Scanner;

public class Swapping2numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		System.out.println("enter the first num");
		int num1= sc.nextInt();
		System.out.println("enter the second num");
		int num2=sc.nextInt();
		System.out.println("before swapping");
		System.out.println(num1);
		System.out.println(num2);
		int temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("after swapping");
		System.out.println(num1);
		System.out.println(num2);
	}

}
