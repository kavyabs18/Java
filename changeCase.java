package Practice;

public class changeCase {
public static void main(String[] args) {
	String s = "india newzealand";
	String [] split = s.split(" ");
	String result="";
	for(int i=0; i<split.length;i++) {
		s=((split[i].charAt(0)+"").toUpperCase()+split[i].substring(1)+" ");
		result=result+s;
	}
	System.out.println(result);
	
	


//	int a[] = {1,2,3,4,5};
//	for(int i : a) {
		//System.out.print(i+" ");
//	}
}
}
