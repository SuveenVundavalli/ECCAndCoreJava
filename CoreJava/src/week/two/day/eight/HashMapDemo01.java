package week.two.day.eight;

import java.util.HashMap;

public class HashMapDemo01 {

	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("Sachin", 100);
		hashMap.put("Virat", 50);
		hashMap.put("Dhoni", 60);
		hashMap.put("Yuvraj", 70);
		hashMap.put("Rohit", 80);
		hashMap.put("Raina", 90);
		System.out.println(hashMap);
		if(hashMap.containsKey("Sachin")){
			hashMap.put("Sachin", hashMap.get("Sachin")+1);
		}
		System.out.println(hashMap);
	}

}
