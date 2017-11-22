package week.two.day.eight;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo01 {

	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(100);
		hashSet.add(102);
		hashSet.add(104);
		hashSet.add(106);
		hashSet.add(101);
		hashSet.add(103);
		hashSet.add(105);
		
		System.out.println(hashSet);
		
		int sum = 0;

		for (Integer x : hashSet)
			sum += x;

		System.out.println("Sum from forEach loop : "+sum);

		Iterator<Integer> itr = hashSet.iterator();
		sum = 0;
		while (itr.hasNext())
			sum += itr.next();
		System.out.println("Sum from iterator : "+sum);

	}

}
