public class Dog {

	int size;
	String breed;
	String name;

	void bark() {
		System.out.println("Ruff! Ruff");

	}

	public static void main(String[] args) {
		Dog mydog = new Dog();
		mydog.bark();
	}
}