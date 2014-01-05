import java.util.List;
import java.util.ArrayList;

// The command pattern is a behavioural design pattern in which an
// object is used to represent and encapsulate all the information
// needed to call a method at a later time
// This information includes the method name, the object that owns
// the method and values for the method parameters.
// It allows you to store lists of code that is executed at a later
// time or many times
// Client says I want a specific Command to run then execute() is 
// called on 1 of these encapsulated (hidden) Objects
// An Object called the Invoker transfers this Command to another
// Object called a Receiver to execute the right code

public class Main {

	public static void main(String[] args) {
		ElectronicDevice newDevice = TVRemote.getDevice();
		
		TurnTVOn onCommand = new TurnTVOn(newDevice);
		
		DeviceButton onPressed = new DeviceButton(onCommand);
		
		onPressed.press();
		
		
		TurnTVOff offCommand = new TurnTVOff(newDevice);
		
		DeviceButton offPressed = new DeviceButton(offCommand);
		
		offPressed.press();
		
		Television theTV = new Television();
		Radio theRadio = new Radio();
		
		List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();
		allDevices.add(theTV);
		allDevices.add(theRadio);
		
		TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);
		
		DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
		
		turnThemOff.press();
		turnThemOff.pressUndo();
		
		
	}
}
