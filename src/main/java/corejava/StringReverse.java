package corejava;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String initial,rev="";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the reverse string");
		initial = sc.nextLine();
		int length = initial.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+initial.charAt(i);
		}
		System.out.println(rev);
		if(rev==initial) {
			System.out.println("given string is polydrome");
			
		}
		else {
			System.out.println("given string is not polydrome");

		}
	}

}
