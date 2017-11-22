package week.two.day.eight;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo01 {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(100);
		treeSet.add(102);
		treeSet.add(104);
		treeSet.add(106);
		treeSet.add(101);
		treeSet.add(103);
		treeSet.add(105);
		
		System.out.println(treeSet);
		
		int sum = 0;

		for (Integer x : treeSet)
			sum += x;

		System.out.println("Sum from forEach loop : "+sum);

		Iterator<Integer> itr = treeSet.iterator();
		sum = 0;
		while (itr.hasNext())
			sum += itr.next();
		System.out.println("Sum from iterator : "+sum);

	}

}
