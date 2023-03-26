package superThis;

public class ClassB {
	int i ;
	int bi =34;
	
	public ClassB() {
		System.out.println("B class non parameterised constructor");
	}
	
	public ClassB(int i) {
		super();
		this.i =i;
		System.out.println("B class non parameterised constructor");
		
	}
	public ClassB (String string) {
		System.out.println(string);
	}

}
