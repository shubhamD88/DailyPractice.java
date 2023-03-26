package stringTokenizer;
import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		

		System.out.println("Using constructor 1 - ");
		StringTokenizer str1 = new StringTokenizer("Hello how are you");
		System.out.println("countTokens : "+str1.countTokens());
		
		while(str1.hasMoreTokens()) {
			System.out.println(str1.nextToken());
		}
		
		System.out.println("*******************************************");
		
		System.out.println("Using constructor 2 - ");
		StringTokenizer str2 = new StringTokenizer("Java $ Code $ String ", "$");
		
		while (str2.hasMoreTokens()) {
			
			System.out.println(str2.nextToken());
		}
		
		System.out.println("*******************************************");
		
		System.out.println("Using constructor 3 - ");
		StringTokenizer str3 = new StringTokenizer("JAVA | code | string |","|",true); // true or false by default it is fault
		System.out.println("countTokens for str 3 : "+str3.countTokens());
		
		while(str3.hasMoreTokens()) {
			System.out.println(str3.nextToken());
		}

	}

}

