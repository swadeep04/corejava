package corejava;

public class Vowels {

static int i,z,res; 
	static int vowelscount(String s) {
		for(i=0,z=0;i<s.length();i++) {
		char ch = s.charAt(i);
		if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
			z++;
		
	}
		return z;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("original string is:");
System.out.println("srinath goud is a good developer");
res = vowelscount("srinath goud is a good developer");
System.out.println(res);
	}

}
                                                                                              