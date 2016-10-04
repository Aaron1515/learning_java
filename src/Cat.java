
public class Cat {

	String name;
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.name = "Mr Cat";
		System.out.println("My first cats name: " + cat1.name);
		
		Cat[] cats = new Cat[3];
		
		System.out.println("Empty cat object in an Array: " + cats[0]);
		cats[0] = new Cat();
		cats[1] = new Cat();
		cats[2] = cat1;
		System.out.println("Print out cat object after creating an Cat object: " + cats[0]);
		System.out.println("Assign cat1 to last cat in array: " + cats[2]);
		
		
		int i = 0;
		System.out.println();
		System.out.println("Print out each cat object in a loop");
		System.out.println();
		while (i < cats.length) {
			System.out.println((i + 1) + ": " + cats[i]);
			i++;
		}
	}
	

}
