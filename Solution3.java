package com.kodnest.access_modifier_2;
import com.kodnest.access_modifier_1.*;

public class Solution3 extends Solution1 {
	private int c=30;
	public void display() {
		System.out.println(c);
		System.out.println(new Solution3().a);
	}
}
