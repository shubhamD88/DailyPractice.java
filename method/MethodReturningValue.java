package method;

public class MethodReturningValue {
	public int sum (int a, int b) {
		int c;
	    c = a + b ;
	    return c;
	}
	public static void main(String []args) {
		MethodReturningValue m = new MethodReturningValue();
		int result = m.sum(390, 450);
		System.out.println("sum = "+result);
	}

}
