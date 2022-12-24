package recursion;

import java.util.ArrayList;

public class MergeArrayLists {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(21);
		a1.add(13);
		a1.add(14);
		a1.add(12);
		a1.add(15);
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(112);
		a2.add(1212);
		a2.add(12412);
		a2.add(12312);
		a2.add(12512);
		
		a1.addAll(a2);
		
		System.out.println(a1);
	}

}
