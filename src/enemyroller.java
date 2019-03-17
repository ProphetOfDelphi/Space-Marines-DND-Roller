import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class enemyroller {
	
	public String enemyGenerator(String owner) throws FileNotFoundException {
		
		String weapon = this.enemyWeaponRoller();
		String armor = this.enemyArmorRoller();
		String name = this.enemyNameRoller(owner);
		
		
		
		return String.format("%s, armed with a %s and wearing %s", name, weapon, armor);
		
	}
	
	private String enemyNameRoller(String owner) throws FileNotFoundException {
		Random gen = new Random();
		
		String filename1;
		String filename2;
		int length1;
		int length2;
		
		if (owner == "Lithua Confederation") {
			filename1 = "firstnames_confed.txt";
			filename2 = "lastnames_confed.txt";
			length1 = 150;
			length2 = 3106;
		}
		else {
			filename1 = "firstnames.txt";
			filename2 = "lastnames.txt";
			length1 = 100;
			length2 = 100;
		}
		Scanner scnr1 = new Scanner(new File(filename1));
		Scanner scnr2 = new Scanner(new File(filename2));
		int numGen1 = gen.nextInt(length1);
		int numGen2 = gen.nextInt(length2);
		String firstname = "";
		String lastname = "";
		
		for (int y = 0; y <= numGen1; ++y) {
			if (y != numGen1) {
			scnr1.nextLine();
			}
			else {
			firstname = scnr1.nextLine();
			}
		}
		for (int y = 0; y <= numGen2; ++y) {
			if (y != numGen2) {
			scnr2.nextLine();
			}
			else {
			lastname = scnr2.nextLine();
			}
		}
		String returnVal = firstname + " " + lastname;
		return returnVal;
	}

	public String enemyWeaponRoller() throws FileNotFoundException {
		
		Random gen = new Random();
		Scanner scnr = new Scanner(new File("weapons.txt"));
		int numGen = gen.nextInt(4);
		String weapon = "";
		
		for (int y = 0; y <= numGen; ++y) {
			if (y != numGen) {
			scnr.nextLine();
			}
			else {
			weapon = scnr.nextLine();
			}
		}
		return weapon;
	}
	
	public String enemyArmorRoller() throws FileNotFoundException {
		
		Random gen = new Random();
		Scanner scnr = new Scanner(new File("armor.txt"));
		int numGen = gen.nextInt(3);
		String armor = "";
		
		for (int y = 0; y <= numGen; ++y) {
			if (y != numGen) {
			scnr.nextLine();
			}
			else {
			armor = scnr.nextLine();
			}
		}
		return armor;
	}
}
