package package1;

public class Class_A {
	
	private void m1Private(){
		System.out.println("Class-A private method m1");
		
	}
	void m2Default() {
		System.out.println("Class-A Default method m2");
	}
	protected void m3Protected() {
		
		System.out.println("Class-A protected method m3");
	}
	public void m4Public() {
		
		System.out.println("Class-A public method m4");
	}
	public static void main(String [] args) {
		Class_A a = new Class_A();
		a.m1Private();
		a.m2Default();
		a.m3Protected();
		a.m4Public();
		
	}

}
