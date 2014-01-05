
public class UFOEnemyShipFactory implements EnemyShipFactory {

	@Override
	public ESWeapon addESGun() {
		// TODO Auto-generated method stub
		return new ESUFOGun();
	}

	@Override
	public ESEngine addESEngine() {
		// TODO Auto-generated method stub
		return new ESUFOEngine();
	}

}
