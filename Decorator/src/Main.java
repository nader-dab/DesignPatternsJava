// The Decorator allows you to modify an object dynamically
// You would use it when you want the capabilities of inheritance with
// subclasses, but you need to add functionality at runtime
// It is more flexible than inheritance 
// Simplifies code because you add functionality using many simple classes
// Rather than rewrite old code you can extend with new code
public class Main {

	public static void main(String[] args) {
		
		Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		
		System.out.println(basicPizza.getDescription());
		System.out.println(basicPizza.getCost());
	}
}
