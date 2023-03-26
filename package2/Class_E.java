package package2;

import package1.Class_A;

public class Class_E {
	
	public static void main (String[]args) {
	    
		Class_A d = new Class_A();
		
      //d.m1Private();   ----not accessible
	  //d.m2Default();   ----not accessible
	  //d.m3Protected(); ----not accessible
        d.m4Public();
		
		
	}
	
	
	

}
