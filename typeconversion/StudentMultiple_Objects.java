package typeconversion;

public class StudentMultiple_Objects {
	int studentId;
	String studentName;
	int studentAge;
	String dressColor;
	
	public void studentInformation() {
		System.out.println("Student ID : "+studentId);
		System.out.println("Student Name : "+studentName);
		System.out.println("Student Age : "+studentAge);
		System.out.println("Dress Color : "+dressColor);
	}
	public StudentMultiple_Objects(int studentId, String studentName, int studentAge, String dressColor) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.dressColor = dressColor;
	}
	
	public static void main(String args[]) {
		StudentMultiple_Objects s = new StudentMultiple_Objects(1,"Vishnu",25,"Red");
		StudentMultiple_Objects s1 = new StudentMultiple_Objects(1,"Narayan",25,"Red");
		StudentMultiple_Objects s2 = new StudentMultiple_Objects(1,"Hari",25,"Red");
		StudentMultiple_Objects s3 = new StudentMultiple_Objects(1,"Krishna",25,"Red");
		StudentMultiple_Objects s4 = new StudentMultiple_Objects(1,"Shubham",25,"Red");
		
		s.studentInformation();
		System.out.println("####################################");
		s1.studentInformation();
		System.out.println("####################################");
		s2.studentInformation();
		System.out.println("####################################");
		s3.studentInformation();
		System.out.println("####################################");
		s4.studentInformation();
		System.out.println("####################################");
		
	}

	

}
