import java.util.LinkedList;


public class Main {
	public static void main(String[] args) {
		
		Singleton newInstance = Singleton.getInstance();
		
		System.out.println("Instance 1 ID: " + System.identityHashCode(newInstance));
		
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		
		System.out.println("Player 1: " + playerOneTiles);
		
		Singleton newInstanceTwo = Singleton.getInstance();
		 
		System.out.println("Instance 2 ID: " + System.identityHashCode(newInstanceTwo));
	
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> playerTwoTiles = newInstance.getTiles(7);
		
		System.out.println("Player 2: " + playerTwoTiles);
	}
}
