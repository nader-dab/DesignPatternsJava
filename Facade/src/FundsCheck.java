
public class FundsCheck {

	private double cashInAccount = 1000.00;
	
	public double getCashInAccount(){ return cashInAccount; }
	
	public void decreaseCashInAccount(double cashWithdrawn){
		cashInAccount -= cashWithdrawn;
	}
	
	public void increaseCashInAccount(double cashDeposite) {
		
		cashInAccount += cashDeposite;
	}
	
	public boolean haveEnoughMoney(double cashToWithdraw){
		
		if(cashToWithdraw > getCashInAccount()){
			
			System.out.println("Error: You don't have enough money");
			System.out.println("Current Balance: " + getCashInAccount());
			
			return false;
		} else {
		
			decreaseCashInAccount(cashToWithdraw);
			System.out.println("Withdrawal Complete: Current Balance is " + getCashInAccount());
			return true;
		}
	}
	
	public void makeDeposite(double cashToDeposite){
		
		increaseCashInAccount(cashToDeposite);
		
		System.out.println("Deposite Complete: Current Balance is " + getCashInAccount());
	}
}
