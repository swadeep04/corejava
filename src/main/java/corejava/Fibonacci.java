package corejava;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, first=0,next=1;
		System.out.println("enter how many fibonacci numbers are to be printed:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("The first" +n+" fibonacci are:");
		System.out.println(first +" "+next);
		for(int i=1;i<=n-2;++i) {
			int sum=first+next;
			first = next;
			next=sum;
			System.out.println(" "+sum);
		}
		
	}

}
