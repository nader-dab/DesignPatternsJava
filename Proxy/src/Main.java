// Provides a class which will limit access to another class
// You may do this for security reasons, because an Object is 
// intensive to create, or is accessed from a remote location
public class Main {

	public static void main(String[] args) {
		
		
		GetATMData realATMMachine = new ATMMachine();
		
		GetATMData atmProxy = new ATMProxy();
		
		System.out.println("Current ATM State " + atmProxy.getATMData());
		
		System.out.println("Cash in ATM MAchine $" + atmProxy.getCashInMachine());
	}
}
