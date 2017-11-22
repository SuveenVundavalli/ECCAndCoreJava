package week.two.day.eight;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetDemo02 {

	public static void main(String[] args) {

		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("India");
		linkedHashSet.add("China");
		linkedHashSet.add("Bangkok");
		linkedHashSet.add("Dubai");
		linkedHashSet.add("India");
		linkedHashSet.add("Nepal");
		linkedHashSet.add("USA");
		
		System.out.println(linkedHashSet);
		
		

		for (String x : linkedHashSet)
			System.out.println(x);

		

		Iterator<String> itr = linkedHashSet.iterator();
		
		while (itr.hasNext())
			System.out.println(itr.next());

	
	}

}
