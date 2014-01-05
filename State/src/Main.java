// Allows an object to alter its behaviour when its internal state changes.
// The object will appear to change its class.
// Context -> Maintains an instance of a Concrete State subclass
// that defines the current state.
// Sate -> Defines an interface for encapsulation the behaviour
// associated with a particular state of the Context.
// Concrete State -> Each subclass implements a behaviour associated
// with a state of Context

public class Main {

	public static void main(String[] args) {
		
		ATMMachine atmMachine = new ATMMachine();
		
		atmMachine.insertCard();
		
		atmMachine.ejectCard();
		
		atmMachine.insertCard();
		
		atmMachine.insertPin(1234);
		
		atmMachine.requestCash(2000);
		
		atmMachine.insertCard();
		
		atmMachine.insertPin(1234);
	}
}
