
public class NoCash implements ATMState {

	ATMMachine atmMachine;
	
	public NoCash(ATMMachine newAtmMachine){
	
		atmMachine = newAtmMachine;
	
	}
	
	@Override
	public void insertCard() {
		System.out.println("We Don't have Money");
		
	}

	@Override
	public void ejectCard() {
		System.out.println("We Don't have Money. You didn't enter a card");
		
	}

	@Override
	public void insertPin(int pinEntered) {
		System.out.println("We Don't have Money");
		
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		System.out.println("We Don't have Money");
		
	}

}
