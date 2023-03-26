package method;

public class Method {
	
	public void sum(int a, int b) {
		int c ;
		c = a + b;
		System.out.println("sum = "+c);
	}
	public static void main (String []args) {
		Method m = new Method ();
		m.sum(123, 345);
	}

}
