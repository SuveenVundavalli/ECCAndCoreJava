package week.two.day.eight;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo02 {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("India");
		treeSet.add("China");
		treeSet.add("Bangkok");
		treeSet.add("Dubai");
		treeSet.add("India");
		treeSet.add("Nepal");
		treeSet.add("USA");
		
		System.out.println(treeSet);
		
		

		for (String x : treeSet)
			System.out.println(x);

		

		Iterator<String> itr = treeSet.iterator();
		
		while (itr.hasNext())
			System.out.println(itr.next());

	}

}
