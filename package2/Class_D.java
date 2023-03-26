package package2;

import package1.Class_A;

public class Class_D extends Class_A {
	public static void main (String[]args) {
	
    Class_D d = new Class_D();
	
	//d.m1Private();  ----not accessible
	//d.m2Default();  ----not accessible
	d.m3Protected();
	d.m4Public();
	
	}

}
