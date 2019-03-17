import java.io.FileNotFoundException;

public class driver {

	public static void main(String[] args) throws FileNotFoundException {
		smallship test1 = new smallship("small", "small");
		
		test1.shipClassRoller();
		test1.shipNameRoll();
		test1.shipEnemyRoll("small");
		test1.ownerRoll("small");
		test1.shipClassNameRoll();
		System.out.println(test1.toString());
		
		enemyroller enemy1 = new enemyroller();
		int x = 0;
		while (test1.getEnemyCount() > x) {
			System.out.println(enemy1.enemyGenerator("Lithua Confederation"));
			++x;
		}
	}
}
