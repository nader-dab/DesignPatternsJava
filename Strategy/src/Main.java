// The Strategy pattern is used when you want to define a class that 
// will have  one behaviour that is similar to other behaviours in a list.
// When you need to use on of several behaviours dynamically.
// + Reduces long lists of conditionals
// + Avoids duplicate code
// + Keeps class changes from forcing other class changes
// + Can hide compliated / secred code from the user
// - Increases the number of Objects
public class Main {

	public static void main(String[] args) {
		
		Animal sparky = new Dog();
		Animal tweety = new Bird();
		 
		System.out.println("Dog " + sparky.tryToFly());
		System.out.println("Bird " + tweety.tryToFly());
	
		sparky.setFlyingType(new ItFlys());
		
		System.out.println("Dog " + sparky.tryToFly());
	}
}
