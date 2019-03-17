import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class namegenerator {
	

	public String generator() throws FileNotFoundException {
		Random gen = new Random();
		Scanner scnr = new Scanner(new File("shipnames.txt"));
		String name = "";
		int numGen = gen.nextInt(5186);
		
		for (int x = 0; x <= numGen; ++x) {
			if (x != numGen) {
				scnr.nextLine();
			}
			else {
				 name = scnr.nextLine();
			}
		}
		
		scnr.close();
		return name;
		
	}
}
