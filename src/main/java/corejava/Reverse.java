package corejava;

public class Reverse {

	public void reverseWordInString(String str) {
		String[] words=str.split(" ");
		String reversedString = "";
		for(int i=0;i<words.length;i++) {
			String word= words[i];
			String reversedword="";
			for(int j=word.length()-1;j>=0;j--) {
				reversedword= reversedword+word.charAt(j);
				
			}
			reversedString=reversedString+reversedword+" ";
			
		}
		System.out.println(str);
		System.out.println(reversedString);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse obj = new Reverse();
	obj.reverseWordInString("i am an ojas employee");

	}

}
