package Practice;

public class P2 {
public static void main(String[] args) {
	String s = "Hello";
	
	//characters present in even index
	for(int i=0; i<s.length(); i++) {
		if(i%2==0) {
			System.out.print(s.charAt(i));
		}
	}
	System.out.println();
	
	//display all the characters in reverse order
	for(int i=s.length()-1; i>=0; i--) {
		System.out.print(s.charAt(i));
	}
	System.out.println();
	System.out.println();
	
	//sub strings of given string with substring()
	for(int i=0; i<s.length(); i++){
		for(int j=i+1; j<=s.length(); j++) {
			System.out.println(s.substring(i,j));
		}
	}
	System.out.println();
	System.out.println();
	
	//sub string without substring()
	for(int i=0; i<s.length(); i++){
		for(int j=i+1; j<=s.length(); j++) {
			for(int k=i; k<j; k++) {
				System.out.print(s.charAt(k));
			}
			System.out.println();
		}
	}
}
}
