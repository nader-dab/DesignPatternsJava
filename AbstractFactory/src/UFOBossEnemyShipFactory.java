
public class UFOBossEnemyShipFactory implements EnemyShipFactory {

	@Override
	public ESWeapon addESGun() {
		
		return new ESUFOBossGun();
	}

	@Override
	public ESEngine addESEngine() {
		// TODO Auto-generated method stub
		return new ESUFOBossEngine();
	}

}
