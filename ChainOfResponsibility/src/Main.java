// This pattern send data to an object and if that object can't use it, it
// sends it to any number of other objects that may be able to use it

public class Main {

	public static void main(String[] args) {
		
		Chain chainCalc1 = new AddNumbers();
		Chain chainCalc2 = new SubtractNunbers();
		Chain chainCalc3 = new MultNumbers();
		Chain chainCalc4 = new DevideNumbers();
		
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		
		Numbers request = new Numbers(4, 2, "mult");
		
		chainCalc1.calculate(request);
	}
}
