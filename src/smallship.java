import java.io.FileNotFoundException;
import java.util.Random;

public class smallship extends ship {

	public smallship(String name, String shipsize) {
		super(shipsize);
		
	}

	public void shipClassRoller() {
		Random picker = new Random();
		
		int pick = picker.nextInt(6);
		
		switch(pick) {
		
		case 1:
			shipClass = "Small Destroyer";
			break;
		case 2:
			shipClass = "Corvette";
			break;
		case 3:
			shipClass = "Minelayer";
			break;
		case 4:
			shipClass = "Minesweeper";
			break;
		case 5:
			shipClass = "Blockade Runner";
			break;
		default:
			shipClass =  "Small Merchantman";
			break;
		}
		
	}

	public String shipLootRoll(String shipClass) {
		// TODO Auto-generated method stub
		return null;
	}

	public void shipEnemyRoll(String shipClass) {
		Random roll = new Random();
		int preEnemies = roll.nextInt(6);
		 if (preEnemies == 0) {
			 enemies = 2;
		 }
		 else {
			 enemies = preEnemies;
		 }
	}

	public void ownerRoll(String shipClass) {
		owner = "Lithua Confederation";
	}

	public void shipNameRoll() throws FileNotFoundException{
		namegenerator pol = new namegenerator();
		name = pol.generator();
	}

	@Override
	public void shipClassNameRoll() throws FileNotFoundException {
		classroller roll = new classroller();
		shipClassName = roll.generator(shipClass);
		
	}

}
