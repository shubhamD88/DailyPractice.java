package typeconversion;

public class Student {
	
	int studentId = 1;
	String studentName = "Shubham";
	int studentAge = 25;
	String dressColor = "Blue";
	
	public void studentInformation() {
		System.out.println("Student ID : "+studentId);
		System.out.println("Student Name : "+studentName);
		System.out.println("Student Age : "+studentAge);
		System.out.println("Dress Color : "+dressColor);
		
	}
	
	public static void main(String args[]) {
		Student stu = new Student();
		stu.studentInformation();
	}

}
