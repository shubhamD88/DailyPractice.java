package typeconversion;

public class TypeConversion {
	public static void main(String args[]) {
		 
		/*Implicit Casting
		   Implicit casting */
		byte b = 10;
		int a = b ;
		System.out.println("the value of byte b :" +b);
		System.out.println("the value of int a :" +a);
		long L = b;
		double d = b ;
		System.out.println("the value of long L :" +L);
		System.out.println("the value of double d :" +d);
		
		// Explicit Casting
		System.out.println("******************* Explicit Casting ********************");
		
		int  i = 20;
		short shortVariable = (short)i ;
		System.out.println("the value of short variable :"+ shortVariable);
		
		double doubleVar = 123.456; //data loss
		int intVar = (int)doubleVar;
		System.out.println("the value of double variable :"  +intVar);
		
		int intVariable = 50;
		byte by = (byte)intVariable;
		System.out.println("the value of byte by  :" +by);
		
		
	}
	

}
