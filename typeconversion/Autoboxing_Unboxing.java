package typeconversion;

public class Autoboxing_Unboxing {
	public static void main(String args[]) {
		 /* Autoboxing =
		   Autoboxing refers to the conversion of a primitive value into an object of the corresponding
		   wrapper class is called autoboxing. for Ex. converting 'int' into Integer class
		  */
		
		int AB = 334;
		Integer j = AB;
		System.out.println(j);
		
		/* Unboxing 
		 * Unboxing on  the other hand refers to converting an object of wrapper class type to 
		 * its corresponding primitive value
		 * example , conversion of Integer to int.
		 */
		Long l = 23456L;
		long t = l;
		System.out.println(t);
		
	}
	

}

