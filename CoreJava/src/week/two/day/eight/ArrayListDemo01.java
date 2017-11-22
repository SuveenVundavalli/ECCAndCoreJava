package week.two.day.eight;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo01 {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(100);
		arrayList.add(102);
		arrayList.add(104);
		arrayList.add(105);
		arrayList.add(101);
		arrayList.add(103);
		arrayList.add(105);
		
		System.out.println(arrayList);
		
		int sum = 0;
		for(Integer x : arrayList)
			sum += x;
		System.out.println("Sum from forEach loop is : " + sum);
		
		sum = 0;
		
		ListIterator<Integer> itr = arrayList.listIterator();
		while(itr.hasNext())
			sum += itr.next();
		System.out.println("Sum from iterator is : "+sum);
		sum=0;
		while(itr.hasPrevious())
			sum += itr.previous();
		System.out.println("Sum from iterator is : "+sum);
		
		
		
	}

}
