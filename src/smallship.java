import java.io.FileNotFoundException;
import java.util.Random;

public class smallship extends ship {

	public smallship(String name, String shipsize) {
		super(shipsize);
		
	}

	public void shipClassRoller() {
		Random picker = new Random();
		
		int pick = picker.nextInt(20);
		
		switch(pick) {
		
		case 1:
			shipClass = "Solar Sailer";
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
		case 6:
			shipClass =  "Small Cargo Runner";
			break;
		case 7:
			shipClass = "Tugboat";
			break;
		case 8:
			shipClass = "Fighter";
			break;
		case 9:
			shipClass = "Bomber";
			break;
		case 10:
			shipClass = "Small Merchant Vessel";
			break;
		case 11:
			shipClass = "Collier";
			break;
		case 12:
			shipClass = "Patrol Ship";
			break;
		case 13:
			shipClass = "Clipper";
			break;
		case 14:
			shipClass = "Sloop-of-war";
			break;
		case 15:
			shipClass =  "Pirate Steamer";
			break;
		case 16:
			shipClass = "Gunboat";
			break;
		case 17:
			shipClass = "Point Defense Ship";
			break;
		case 18:
			shipClass = "Brig";
			break;
		case 19:
			shipClass = "Monitor";
			break;
		case 20: 
			shipClass =  "Xebec";
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
		enemies = 3;
	}

	public void ownerRoll(String shipClass) {
		owner = "Darjeeling Space Co";
	}

	public void shipNameRoll() throws FileNotFoundException{
		namegenerator pol = new namegenerator();
		name = pol.generator();
	}

}
