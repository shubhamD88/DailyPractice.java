package javaProgramExecutionFlow;

public class B {
	int x;
	int y = 100;
	static String str ="Xyz";
	{
		System.out.println("B - Instance block");
	}
	static {
		System.out.println("B - Static block");
	}
	public B() {
		super();
		System.out.println("B - constructor");
	}

	public static void main(String[] args) {
		System.out.println("B - main method");
		B b = new B();

	}

}
