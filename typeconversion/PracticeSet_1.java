package typeconversion;
import java.util.Scanner;
public class PracticeSet_1 {
public static void main(String args []) {
	//1 add three no.
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter Value");
		byte a = sc.nextByte();
		byte b = sc.nextByte();
		byte c = sc.nextByte();
		int sum = a+ b+c;
		System.out.println("The Sum is : "+sum);
		
		// 2 calculate CGPA
		System.out.println("CGPA calculatin start enter marks");
		byte sub1 = sc.nextByte();
		byte sub2 = sc.nextByte();
		byte sub3 = sc.nextByte();
		float percent = (float)(sub1+sub2+sub3)*100/300;
		float cgpa =(float) (percent/9.5);
		System.out.println("Percentage is : "+percent+"%");
		System.out.println("CGPA is  : "+cgpa);
		
		// 3 ask user name
		System.out.println("Enter your name : ");
		String name = sc.next();
		System.out.println("Hello "+ name+" Welcome to pendora");
		
		// 4 is input is number
		System.out.println("Enter input : ");
		System.out.println(sc.hasNextInt());
		 byte no = sc.nextByte();
		System.out.println(no);
		
		// 5 convert km to miles
		System.out.println("enter km ");
		float km =sc.nextFloat();
		float miles = (float) (km*0.62137);
		System.out.println(km+" km is equal to "+miles+" miles");
	}
}
}
