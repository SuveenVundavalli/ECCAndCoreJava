package week.two.day.eight;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo02 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("India");
		arrayList.add("Nepal");
		arrayList.add("China");
		arrayList.add("Bangkok");
		arrayList.add("India");
		arrayList.add("USA");
		arrayList.add("Sweden");
		
		
		System.out.println(arrayList);
		
		String sum = "";
		for(String x : arrayList)
			sum += x+" ";
		System.out.println("Sum from forEach loop is : " + sum);
		
		sum = "";
		
		Iterator<String> itr = arrayList.iterator();
		while(itr.hasNext())
			sum += itr.next()+" ";
		System.out.println("Sum from iterator is : "+sum);
		
		
		
	}

}
