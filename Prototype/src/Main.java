// Creating object (instances) by clonning (copying) other objects
// Allows for adding of any subclass instance of a known super class at run time
// When there are numerous potential classes that you want to only use if needed at runtime
// Reduces the need for creating subclasses
public class Main {

	public static void main(String[] args) {
		
		CloneFactory animalMaker = new CloneFactory();
		
		Sheep sally = new Sheep();
		
		Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);
		
		System.out.println(sally);
		System.out.println("Sally hashcode " + System.identityHashCode(sally));
		
		System.out.println(clonedSheep);
		System.out.println("Clone hashcode " + System.identityHashCode(clonedSheep));
		
		
	}
}
