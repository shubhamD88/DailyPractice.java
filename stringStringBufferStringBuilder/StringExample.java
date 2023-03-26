package stringStringBufferStringBuilder;

public class StringExample {

	public static void main(String[] args) {
		//CASE 1
		
		String s = new String("ABCD");
		s.concat("Software");
		System.out.println(s);
		
		System.out.println("############ Case1 BufferString #################");
		StringBuffer sb = new StringBuffer("ABCD");
		sb.append("Software");
		System.out.println(sb);
		
		//CASE 2
		System.out.println("################ Case2 String #################");
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		//boolean value = s.equals(s1);
		System.out.println(s1.equals(s2));  //  Op ----True
		System.out.println(s1==s2);// OP -----False
		
		System.out.println("############ Case2 BufferString ###############");
		StringBuffer sb1 = new StringBuffer("ABC");
		StringBuffer sb2 = new StringBuffer("ABC");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1==sb2);
		
		System.out.println("########## Case2 BufferString sb3 object ###############");
		StringBuffer sb3 = sb1;
		System.out.println(sb1.equals(sb3));
		System.out.println(sb1==sb3);
		
		//CASE  3
		System.out.println("################## CASE 3 ########################");
		String q = new String ("ABC"); // 2 objects will be created
		String q1 = "DEF";            //Only one object created in scp memory area
		
		String q2 = new String("FGH");
		String q3 = new String("FGH");
		String q4 = "DEFG";
		String q5 = "DEFH";
		
		System.out.println(q2==q3);  // OP --False
		System.out.println(q4==q5);  // OP --True
		
		//intern()
		System.out.println("############# Intern () ######################");
		String a = new String ("Shubham");
		String a1 = a.intern();
		String a2 = "RAM";
		System.out.println(a1==a2);
		

	}

}
