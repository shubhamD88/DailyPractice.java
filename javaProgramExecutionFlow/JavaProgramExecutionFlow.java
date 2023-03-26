package javaProgramExecutionFlow;

public class JavaProgramExecutionFlow {
	int i;
	String str;
	int a = 10;
	int b = 20;
	static int j = 100;
	{
		System.out.println("Inside instance block...........");
		//int c = a + b;
		//System.out.println("value of c : "+c);
	}
	static {
		System.out.println("Inside static block ");
	}
	
	void instanceMethode() {
		System.out.println("Inside instance method...........");
	}
	
	static void staticMethod() {
		System.out.println("Inside static Method.............");
		//System.out.println("static variable j : "+j);
	}

	public JavaProgramExecutionFlow(int i, String str) {
		super();
		this.i = i;
		this.str = str;
	}

	public static void main(String[] args) {
		System.out.println("Inside main method");
		JavaProgramExecutionFlow obj = new JavaProgramExecutionFlow(23, "asd");
		JavaProgramExecutionFlow.staticMethod();
		obj.instanceMethode();
	}

}
