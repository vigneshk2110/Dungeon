package dungeon;


public class ManAlone {

	public static void main(String[] args) {
		
		Dungeon d = new Dungeon(5, 4);
		ObjectPosition man = new ObjectPosition(5, 1, "Man");
		ObjectPosition gold = new ObjectPosition(1, 4, "Gold");
		d = d.addObject(man);
		d = d.addObject(gold);
		d.print();
		int dis = d.shortDistance(man,gold);
		System.out.println("\n" + dis + " units distance");
		
	}
}
