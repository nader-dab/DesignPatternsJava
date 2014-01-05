
public class SecurityCodeCheck {

	private int securirtyCode = 1234;
	
	public int getSecurirtyCode() { return securirtyCode; }
	
	public boolean isCodeCorrect(int secCodeToCheck){
		
		if(secCodeToCheck == getSecurirtyCode()){
			return true;
		} else {
			return false;
		}
	}
}
