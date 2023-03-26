package abstractexample;

public class Dog extends Animal {
	
	public void sound () {
		System.out.println("woof..... Woof.....");
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();

	}

	@Override
	public void absractMethod() {
		// TODO Auto-generated method stub
		
	}

}
