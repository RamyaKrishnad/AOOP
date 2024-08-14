package Factory;

public class HardLevelFactory {
	public Enemy createEnemy()
	{
	return new OrcEnemy();
	}
	public Weapon createWeapon()
	{
	return new SwordWeapon();
	}
	public PowerUp createPowerUp()
	{
	return new ShieldPowerUp();
	}
	}

