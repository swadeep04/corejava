package corejava;

public class VowelsCount {

	static int i,d,res;
	static int vowelscount(String s) {
		for(i=0,d=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
				d++;
		}
		return d;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("original string is :");
System.out.println("swadeep is good developer");
res = vowelscount("swadeep is good developer");
System.out.println(res);
	}

}
