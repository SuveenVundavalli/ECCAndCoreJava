package week.two.day.eight;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo01 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		linkedHashSet.add(100);
		linkedHashSet.add(102);
		linkedHashSet.add(104);
		linkedHashSet.add(106);
		linkedHashSet.add(101);
		linkedHashSet.add(103);
		linkedHashSet.add(105);
		
		System.out.println(linkedHashSet);
		
		int sum = 0;

		for (Integer x : linkedHashSet)
			sum += x;

		System.out.println("Sum from forEach loop : "+sum);

		Iterator<Integer> itr = linkedHashSet.iterator();
		sum = 0;
		while (itr.hasNext())
			sum += itr.next();
		System.out.println("Sum from iterator : "+sum);

	}

}
