package com.string;

public class S1 {
public static void main(String[] args) {
	String s = "Hello Java Programs";
	char[] ch = s.toCharArray();
	int left = 0;
	int right = ch.length-1;
	while(left<right) {
		if(ch[left]!=' ' && ch[right] != ' ') {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left++;
			right--;
		}
		else if(ch[left]==32) {
			left++;
		}
		else if(ch[right]==32) {
			right--;
		}
	}
	System.out.println(new String(ch));
}
}
