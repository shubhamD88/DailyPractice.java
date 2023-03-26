package staticExample;

public class StaticVariable {
	
	
	int studId;
	String studName;
	static String clgName;
	
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public static String getClgName() {
		return clgName;
	}
	public static void setClgName(String clgName) {
		StaticVariable.clgName = clgName;
	}
	public StaticVariable(int studId, String studName,String clgName) {
		super();
		this.studId = studId;
		this.studName = studName;
		StaticVariable.clgName = clgName;
	}
	void studentIndormation() {
		System.out.println("***********************************");
		System.out.println("Student Id : "+studId);
		System.out.println("Student Name : "+studName);
		System.out.println("Student Clg : "+clgName);
	}

	public static void main(String[] args) {
		
		StaticVariable obj1 = new StaticVariable(1,"Vishnu","COEP");
		StaticVariable obj2 = new StaticVariable(2,"Narayan","COEP");
		StaticVariable obj3 = new StaticVariable(3,"Sita","COEP");
		StaticVariable obj4 = new StaticVariable(4,"Ram","COEP");
		
		obj1.studentIndormation();
		obj2.studentIndormation();
		obj3.studentIndormation();
		obj4.studentIndormation();
		
		System.out.println("-------------------------obj1---------------------");
		System.out.println(obj1.getStudId());
		System.out.println(obj1.getStudName());
		System.out.println(obj1.getClgName());
		
		System.out.println("-------------------obj1 updated-------------------");
		obj1.setStudName("Hari");
		obj1.setClgName("GS MOZE");
		
		System.out.println("-------------------After updation-------------------");
		obj1.studentIndormation();
		obj2.studentIndormation();
		obj3.studentIndormation();
		obj4.studentIndormation();

	}


}
