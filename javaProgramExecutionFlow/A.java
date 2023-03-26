package javaProgramExecutionFlow;

public class A extends  B{
	int i;
	int j = 20;
	static String str = "adg";
	{
		System.out.println("A - instance block");
	}
	static {
		System.out.println("A - static block");
	}
	public A(int i) {
		super();
		this.i =i;
		System.out.println("A - Inside constructor");
	}

	public static void main(String[] args) {
		System.out.println("A - main method");
		A a = new A(10);

	}

}
