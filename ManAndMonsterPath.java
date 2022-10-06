package dungeon;

public class ManAndMonsterPath {

	public static void main(String[] args) {
		Dungeon d = new Dungeon(5, 4);
		ObjectPosition man = new ObjectPosition(1, 3, "Man");
		ObjectPosition gold = new ObjectPosition(3, 2, "Gold");
		d = d.addObject(man);
		d = d.addObject(gold);
		ObjectPosition monster = new ObjectPosition(5, 3, "Monster");
		d = d.addObject(monster);
		d.print();
		
		
		int manAndGoldDis = d.shortDistance(man,gold);
		int monsterAndGoldDis = d.shortDistance(monster,gold);
		
		if (manAndGoldDis<=monsterAndGoldDis) {
			System.out.println(manAndGoldDis + " Units Distance");
			d.printPath(man,gold,monster);
		} else {
			System.out.println("No Possible Solution");
		}
	}

}
