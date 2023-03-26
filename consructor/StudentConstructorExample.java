package consructor;

public class StudentConstructorExample {
	int studId;
	String studName;
	int studAge;
	
	void studInformation(){
		System.out.println("*****************************");
		System.out.println(" student Id : "+studId);
		System.out.println(" student Name : "+studName);
		System.out.println(" student Age : "+studAge);
		
	}
	//Default constructor
	public StudentConstructorExample() {	
	}
	
	public StudentConstructorExample(int studId, String studName, int studAge) {
		this.studId = studId;
		this.studName = studName;
		this.studAge = studAge;
		}
	
	public StudentConstructorExample(String name, int id) {
		this.studName = name ;
		this.studId = id ;
	}
	
	public static void main(String[] args) {
		StudentConstructorExample obj1 = new StudentConstructorExample();//default constructor
		obj1.studInformation();
		StudentConstructorExample obj2 = new StudentConstructorExample(02,"Ram",26);
		obj2.studInformation();
		StudentConstructorExample obj3 = new StudentConstructorExample("Hari",03);
		obj3.studInformation();	
	}

}
