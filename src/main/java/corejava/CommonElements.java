package corejava;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] s1= {1,3,5};
int[] s2= {3,5,9,11};

for(int i=0;i<s1.length;i++) {
	for(int j=0;j<s2.length;j++) {
		if(s1[i]==s2[j]) {
			System.out.println(s1[i]);
			break;
		}
	}
}
	}

}

		
		