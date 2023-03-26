package package1;

public class Class_B extends Class_A{
	public static void main(String[]args) {
		
		Class_B b= new Class_B();
		
		//b.m1Private(); ----not accessible
		b.m2Default();
		b.m3Protected();
		b.m4Public();
		
	}
	 

}
