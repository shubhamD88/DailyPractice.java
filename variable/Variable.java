package variable;

public class Variable {
	
	int set = 10; // This is Instant variable
	
	static float CAP_SIZE = 30.4f;// This is static variable this are always constant
	
	public void m1( int a, String b) {
		String str = "adcd"; //
		
		System.out.println("value of set : "+set);
		//System.out.println("value of j : "+j); -- Not accessible compile time error
		System.out.println("value of a : "+a);
		System.out.println("value of b : "+b);
		
	}
	
	public static void main (String []args) {
		int j = 50;  // This is local variable
		
		//System.out.println("str value = "+str);-- Not accessible compile time error
		
		Variable v =new Variable(); 
		v.m1(100, "Krishna");
		
	}
	

}
