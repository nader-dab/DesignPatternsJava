// Used to create objects made from a bunch of other objects.
// The creation of the parts is independent of the main object.
// Hide the creation of the parts from the client.
public class Main {


	public static void main(String[] args) {
		
		RobotBuilder oldStyleRobot = new OldRobotBuilder();
		
		RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);
		
		robotEngineer.makeRobot();
		
		Robot firstRobot = robotEngineer.getRobot();
		
		System.out.println(firstRobot.getRobotHead());
		System.out.println(firstRobot.getRobotTorso());
		System.out.println(firstRobot.getRobotArms());
		System.out.println(firstRobot.getRobotLegs());
	}
}
