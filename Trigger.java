package dungeon;

public class Trigger {

	public static void main(String[] args) {
		Dungeon d = new Dungeon(5, 4);
		ObjectPosition man = new ObjectPosition(1, 2, "Man");
		ObjectPosition gold = new ObjectPosition(1, 4, "Gold");
		d = d.addObject(man);
		d = d.addObject(gold);
		ObjectPosition monster = new ObjectPosition(3, 2, "Monster");
		d = d.addObject(monster);
		ObjectPosition trigger = new ObjectPosition(3, 4, "Trigger");
		d = d.addObject(trigger);	
		
		
			
		d.print();
		int manAndGoldDis = d.shortDistance(man,gold);
		int monsterAndGoldDis = d.shortDistance(monster,gold);
		int triggerAndMan = d.shortDistance(man,trigger);
		int triggerAndGold = d.shortDistance(gold,trigger);
		
		if (manAndGoldDis<=monsterAndGoldDis) {
			System.out.println(manAndGoldDis + " Units Distance");
		} 
		else if (manAndGoldDis > monsterAndGoldDis && monsterAndGoldDis >= triggerAndMan) {
			System.out.println(triggerAndMan + triggerAndGold  +  " Units Distance" );
		}
		else if (manAndGoldDis > monsterAndGoldDis && monsterAndGoldDis < triggerAndMan) {
			System.out.println("No Possible Solution");
		}
	}
}
