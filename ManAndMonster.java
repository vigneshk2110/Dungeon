package dungeon;

public class ManAndMonster {

	public static void main(String[] args) {
		Dungeon d = new Dungeon(5, 4);
		ObjectPosition man = new ObjectPosition(1, 3, "Man");
		ObjectPosition gold = new ObjectPosition(3, 4, "Gold");
		d = d.addObject(man);
		d = d.addObject(gold);
		ObjectPosition monster = new ObjectPosition(5, 1, "Monster");
		d = d.addObject(monster);
		d.print();
		
		
		int manAndGoldDis = d.shortDistance(man,gold);
//		System.out.println(manAndGoldDis + "--- Man & Gold");
		int monsterAndGoldDis = d.shortDistance(monster,gold);
//		System.out.println(monsterAndGoldDis + "--- Monster & Gold");
		
		if (manAndGoldDis<=monsterAndGoldDis) {
			System.out.println(manAndGoldDis + " Units Distance");
		} else {
			System.out.println("No Possible Solution");
		}
	}

}
