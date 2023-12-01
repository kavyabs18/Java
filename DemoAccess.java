package com.kodnest.access_modifier_1;

import com.kodnest.access_modifier_2.*;

class DemoAccess extends Solution2 {
	
	public static void main(String[] args) {
		System.out.println("S-1");
		Solution1 s = new Solution1();
		System.out.println(s.a);
		System.out.println(new Solution2().b);
		
		System.out.println("S-2");
		Solution2 s2 = new Solution2();
		s2.display();
		
		System.out.println("S-3");
		Solution3 s3 = new Solution3();
		s3.display();
		
		System.out.println("S-4");
		Solution4 s4 = new Solution4();
		s4.display();
	}
}
