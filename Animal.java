package abstractexample;

public abstract class Animal {
	
	// abstract int i = 19; we can't assign variable as abstract
	
	public abstract void sound();
	
	public abstract void absractMethod();
	
	public void m1 () {
		System.out.println("hello");
	}
	public void m2 () {
		System.out.println("Animal Class - m2 method");
	}

	public static void main(String[] args) {
		//Animal a = new Animal() we can not create a object of abstract class

	}
	Animal (){}

}
