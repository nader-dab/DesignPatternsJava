import java.util.Scanner;

// When a method returns one of servera possible classes that
// share a common super class. The class is chosen at run time.
// When you don't know ahead of time what class object you need.
// When all of the potential classes are in the same subclass hierarchy.
// To centralize class selection code
// When you don't want the user to have to know every subclass
// To encapsulate object creation
public class Main {
	
	public static void main(String[] args){
		
		Scanner userInput = new Scanner(System.in);
		EnemyShip theEnemy = null;
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		System.out.println("What type ship? (U / R / B)");
		
		if (userInput.hasNextLine()) {
			String typeOfShip = userInput.nextLine();
			theEnemy = shipFactory.makeEnemyShip(typeOfShip);
		}
		
		if (theEnemy != null) {
			doStuff(theEnemy);
		} else {
			System.out.println("Enter a U, R, or B next time");
		}
		
		
	}
	
	public static void doStuff(EnemyShip anEnemyShip){
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
	

}
