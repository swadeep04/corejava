package corejava;

import java.util.Scanner;

public class WithoutSwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter first num");
int fnum = sc.nextInt();
System.out.println("enter second number");
int snum= sc.nextInt();
System.out.println("before swapping fnum:"+fnum+"+ snum and "+snum);
fnum=fnum-snum;
snum=fnum+snum;
fnum=snum-fnum;
System.out.println("\n after swapping fnum:"+fnum+"+ snum and "+snum);

	}

}
