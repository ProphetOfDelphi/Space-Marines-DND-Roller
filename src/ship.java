import java.io.FileNotFoundException;

public abstract class ship {
	
	protected String name;
	
	protected String shipSize;
	
	protected String shipClassName;
	
	protected String shipClass;
	
	protected String owner;
	
	protected int enemies;
	
	public ship(String shipsize) {
		this.shipSize = shipsize;
		
	}
	
	public int getEnemyCount() {
		return enemies;
	}
	
	public abstract void shipClassRoller();
	
	public abstract String shipLootRoll(String shipClass);
	
	public abstract void shipEnemyRoll(String shipClass);
	
	public abstract void ownerRoll(String shipClass);
	
	public abstract void shipNameRoll() throws FileNotFoundException;
	
	public abstract void shipClassNameRoll() throws FileNotFoundException;
	
	@Override
	public String toString() {
		
		return String.format("%s, a %s class %s, with %d enemies on board.", name, shipClassName, shipClass, enemies);
		
	}
}
