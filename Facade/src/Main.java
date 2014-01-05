// Simplified interface that performs many other actions 
// behind the scenes
public class Main {

	public static void main(String[] args) {
		
		BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);
		
		accessingBank.withdrawCash(50.00);
		
		accessingBank.withdrawCash(900.00);
		
		accessingBank.depositeCash(200.00);
		
	}
}
