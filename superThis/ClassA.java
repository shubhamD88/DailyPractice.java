package superThis;

public class ClassA extends ClassB{
	int a;
	ClassA(){
		System.out.println("A class non parameterised constructor");
	}
	ClassA(String str){
		System.out.println("A class parameterised constructor "+str);
	}
	
	public ClassA(int a) {
		super (10);
	//	this("stud");
		System.out.println("value of class B - bi variable "+super.bi);
		this.a = a;
		
	}

	public static void main(String[] args) {
		ClassA a1 = new ClassA(200);
		
	
	}

}
