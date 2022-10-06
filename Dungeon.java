package dungeon;

public class Dungeon {
	int noOfRows;
	int noOfColumns;

	ObjectPosition adventurer;
	ObjectPosition gold;
	ObjectPosition monster;
	ObjectPosition pits;
	ObjectPosition triggers;
	char [][] dungeon;


	public Dungeon(int rows, int column) {
		noOfColumns=column;
		noOfRows=rows;
		dungeon = new char[rows][column];

		for (int i = 0; i < noOfRows; i++) {
			for (int j = 0; j <noOfColumns ; j++)
			{
				dungeon[i][j] = '*';
			}

		}
	}

	public void print() {
		for (int i = 0; i < noOfRows; i++) {
			for (int j = 0; j <noOfColumns ; j++)
			{
				System.out.print(dungeon[i][j]+" ");
			}
			System.out.println();
		}
	}

	public Dungeon addObject(ObjectPosition obj) {
		char c = '*';
		if (obj.object.equals("Man")) {
			c = 'A';
		}
		else if (obj.object.equals("Gold")) {
			c = 'G';
		}
		else if (obj.object.equals("Monster")) {
			c = 'M';
		}
		else if (obj.object.equals("Trigger")) {
			c = 'T';
		}
		else if (obj.object.equals("Pit")) {
			c = 'P';
		}
		dungeon[obj.row-1][obj.column-1] = c;
		return this;
	}

	public int shortDistance(ObjectPosition man, ObjectPosition gold) {
		int count = 1;
		if (man.row < gold.row) {
			for (int i = man.row+1; i < gold.row; i++) {
				count++;
			}
			if (man.column<gold.column) {
				for (int i = man.column; i < gold.column; i++) {
					count++;
				}
			}
			else if (man.column>gold.column) {
				for (int i = man.column; i > gold.column; i--) {
					count++;
				}
			}
			return count;
		}
		else if (man.row > gold.row) {
			for (int i = man.row-1; i > gold.row; i--) {
				count++;
			}
			if (man.column<gold.column) {
				for (int i = man.column; i < gold.column; i++) {
					count++;
				}
			}
			else if (man.column>gold.column) {
				for (int i = man.column; i > gold.column; i--) {
					count++;
				}
			}
			return count;
		}
		else if (man.row == gold.row) {
			count = 0;
			if (man.column<gold.column) {
				for (int i = man.column; i < gold.column; i++) {
					count++;
				}
			}
			else if (man.column>gold.column) {
				for (int i = man.column; i > gold.column; i--) {
					count++;
				}
			}
			return count;
		}
		return count;
	}

	public void printPath(ObjectPosition man, ObjectPosition gold) {
		System.out.println("Shortest Path from Man to Gold is...");
		if (man.row < gold.row) {
			for (int i = man.row+1; i < gold.row; i++) {
				System.out.print("(" + i + "," + man.column + ")-->");
			}
			if (man.column<gold.column) {
				for (int i = man.column; i < gold.column; i++) {
					System.out.print("(" + gold.row + "," + i + ")-->");
				}
			}
			else if (man.column>gold.column) {
				for (int i = man.column; i > gold.column; i--) {
					System.out.print("(" + gold.row + "," + i + ")-->");
				}
			}
			System.out.println("(" + gold.row + "," + gold.column + ")");
		}
		else if (man.row > gold.row) {
			for (int i = man.row-1; i > gold.row; i--) {
				System.out.print("(" + i + "," + man.column + ")-->");
			}
			if (man.column<gold.column) {
				for (int i = man.column; i < gold.column; i++) {
					System.out.print("(" + gold.row + "," + i + ")-->");
				}
			}
			else if (man.column>gold.column) {
				for (int i = man.column; i > gold.column; i--) {
					System.out.print("(" + gold.row + "," + i + ")-->");
				}
			}
			System.out.println("(" + gold.row + "," + gold.column + ")-->");
		}
		else if (man.row == gold.row) {
			if (man.column<gold.column) {
				for (int i = man.column; i < gold.column; i++) {
					System.out.print("(" + gold.row + "," + i + ")-->");
				}
			}
			else if (man.column>gold.column) {
				for (int i = man.column; i > gold.column; i--) {
					System.out.print("(" + gold.row + "," + i + ")-->");
				}
			}
			System.out.println("(" + gold.row + "," + gold.column + ")");
		}

	}
}
