package week.two.day.eight;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetDemo02 {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("India");
		hashSet.add("China");
		hashSet.add("Bangkok");
		hashSet.add("Dubai");
		hashSet.add("India");
		hashSet.add("Nepal");
		hashSet.add("USA");
		
		System.out.println(hashSet);
		
		

		for (String x : hashSet)
			System.out.println(x);

		

		Iterator<String> itr = hashSet.iterator();
		
		while (itr.hasNext())
			System.out.println(itr.next());

	}

}
