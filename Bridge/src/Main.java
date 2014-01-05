// Decouple an abstraction from its implementation so that the two
// can vary independently
// Progressively adding functionality while separating out major
// differences using abstract classes
// It can be used to change both the abstractions(abstract classes)
// and concrete classes independently
public class Main {

	public static void main(String[] args) {
		
		RemoteButton theTV = new TVRemoteMute(new TVDevice(1, 200));
		RemoteButton theTV2 = new TVRemotePause(new TVDevice(1, 200));
		//RemoteButton theDVD = new DVDRemote(new DVDDevice(1, 14));
		
		System.out.println("Test TV with Mute");
		
		theTV.buttonFivePressed();
		theTV.buttonNinePressed();
		
		theTV2.buttonFivePressed();
		theTV2.buttonNinePressed();
	}
}
