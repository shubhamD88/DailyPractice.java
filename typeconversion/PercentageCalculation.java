package typeconversion;

import java.util.Scanner;

public class PercentageCalculation {
	public static void main(String args []) {
		
		try (Scanner sc = new Scanner (System.in)) {
			short total= 550;
			
			System.out.println("Enter marks of Marathi out of 100 ");
			short M = sc.nextShort();
			System.out.println("Enter marks of Hindi or Sanskrit out of 100 ");
			short H = sc.nextShort();
			System.out.println("Enter marks of English out of 100 ");
			short E = sc.nextShort();
			System.out.println("Enter marks of Science out of 100 ");
			short S = sc.nextShort();
			System.out.println("Enter marks of Maths out of 150 ");
			short Ma = sc.nextShort();
			System.out.println("Enter marks of Social Science out of 100 ");
			short So = sc.nextShort();
			
			System.out.println("Marathi : " +M +'\n'+"Sanskrit or Hindi : "+H+'\n'+"English : "+E+ '\n'+"Science : "+S+'\n'+"Maths : "
			+Ma+'\n'+"Social Science : "+So );
			
			if((M< 35)||(E<35)||(S < 35)||(Ma<70)||(So<35)||(H<35)) {
				System.out.println("You are Fail");
				}
			
			else if((M<= 100)&&(E<=100)&&(S <= 100)&&(Ma<=150)&&(So<=100)&&(H<=100)) {
				int obtained = M+H+ E+ S+ Ma +So;
				System.out.println("Total Marks : "+obtained);
				float percent = (float)obtained*100/total ;
				System.out.println("Your Percentage Is : " +percent+"%");
				if (percent>=80) {
					System.out.println("You are Pass with distingtion");
				}
				else if(percent >=60) {
					System.out.println("You are Pass with Frist Class");
					
				}
				else {
					System.out.println("You are Pass");
				}
				
				}
			else {
				System.out.println("OOPS Wrong Entry Please Check The Marks And Try Again*");
			}
		}
		}
	 
	}


