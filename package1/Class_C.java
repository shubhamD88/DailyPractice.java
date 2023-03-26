package package1;

public class Class_C {
	public static void main(String []args) {
	
	Class_A a = new Class_A();
	
	//a.m1Private();  ----not accessible
	a.m2Default();
	a.m3Protected();
	a.m4Public();
	
	}

}
