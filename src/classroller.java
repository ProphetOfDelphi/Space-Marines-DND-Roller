import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class classroller {
	
	public String generator(String shipType) throws FileNotFoundException {
		Random gen = new Random();
		String shipClass = "";
		
		if (shipType == "Small Destroyer") {
			Scanner scnr = new Scanner(new File("destroyerclasses.txt"));
			int numGen = gen.nextInt(16);
		
			for (int x = 0; x <= numGen; ++x) {
				if (x != numGen) {
				scnr.nextLine();
				}
				else {
					shipClass = scnr.nextLine();
				}
			}
			scnr.close();
			return shipClass;
		}
		
		if (shipType == "Corvette") {
			Scanner scnr = new Scanner(new File("corvetteclasses.txt"));
			int numGen = gen.nextInt(10);
		
			for (int x = 0; x <= numGen; ++x) {
				if (x != numGen) {
				scnr.nextLine();
				}
				else {
					shipClass = scnr.nextLine();
				}
			}
			scnr.close();
			return shipClass;
		}
		
		if (shipType == "Minesweeper" || shipType == "Minelayer") {
			Scanner scnr = new Scanner(new File("mineclasses.txt"));
			int numGen = gen.nextInt(5);
		
			for (int x = 0; x <= numGen; ++x) {
				if (x != numGen) {
				scnr.nextLine();
				}
				else {
					shipClass = scnr.nextLine();
				}
			}
			scnr.close();
			return shipClass;
		}
		if (shipType == "Blockade Runner") {
			Scanner scnr = new Scanner(new File("runnerclasses.txt"));
			int numGen = gen.nextInt(3);
		
			for (int x = 0; x <= numGen; ++x) {
				if (x != numGen) {
				scnr.nextLine();
				}
				else {
					shipClass = scnr.nextLine();
				}
			}
			scnr.close();
			return shipClass;
		}
		else {
			return "Bougainville";
		}
	}
}
