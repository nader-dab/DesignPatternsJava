// Used to create a group of subclasses that have to execute a
// similar group of methods
// You create an abstract class that contains a method called the
// Template Method
// The Template Method contains a series of method calls that every
// subclass object will call
// The subclass objects can override some of the method calls
public class Main {

	public static void main(String[] args) {
		
		Hoagie cust12Hoagie = new ItalianHoagie();
		
		cust12Hoagie.makeSandwich();
		
		Hoagie cust13Hoagie = new VeggieHoagie();
		
		cust13Hoagie.makeSandwich();
	}
}
