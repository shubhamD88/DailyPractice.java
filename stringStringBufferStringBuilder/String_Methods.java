package stringStringBufferStringBuilder;

public class String_Methods {

	public static void main(String[] args) {
		
		String s = new String ("Welcome to JAVA WORLD ");
		String s1 = new String ("Explore");
		
		System.out.println("* character at 2 index");  
		
		char c = s.charAt(2);
		System.out.println(c);
		
		System.out.println("* character at 4 index");
		System.out.println(s.charAt(4));
		
		System.out.println("* print all string inlower case ");
		System.out.println(s.toLowerCase());
		
		System.out.println("* comparision between s string & S1 string");
		System.out.println(s.compareTo(s1));//if both string is same then result is 0 otherwise any value
		
		System.out.println("compareToIgnoreCase : "+s.compareToIgnoreCase(s1));
		
		System.out.println("* is content in  both string are same ?");
		System.out.println(s.contentEquals(s1));// True if contents are same otherwise False
		
		System.out.println("* replace charactor J to o");
		System.out.println(s.replace('J', 'O'));
		
		System.out.println("* assing  string  content s1 in s");
		System.out.println(s.replaceAll(s, s1));
		
		System.out.println("* Is string is empty");
		System.out.println(s.isEmpty());
		

	}

}
