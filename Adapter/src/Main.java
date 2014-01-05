// Allows 2 incompatible interfaces to work together
// Used when the client expects a (target) interface
// The Adapter class allows the use of the available interface and
// the Target interface
// Any class can work together as long as the Adapter solves the issue
// that all classes must implements every method defined by the
// shared interfaces
public class Main {

	public static void main(String[] args) {
		EnemyTank rx7Tank = new EnemyTank();
		
		EnemyRobot fredTheRobot = new EnemyRobot();
		
		EnemyRobotAdapter robotAdapter = new EnemyRobotAdapter(fredTheRobot);
		
		System.out.println("The Robot");
		
		fredTheRobot.reactToHuman("Paul");
		fredTheRobot.walkForward();
		fredTheRobot.smashWithHands();
		
		System.out.println("The Enemy Tank");
		rx7Tank.assignAttacker("Frank");
		rx7Tank.driveForward();
		rx7Tank.fireWeapon();
		
		System.out.println("The Robot with Adapter");
		robotAdapter.assignAttacker("Mark");
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();
		
		
	}
}
