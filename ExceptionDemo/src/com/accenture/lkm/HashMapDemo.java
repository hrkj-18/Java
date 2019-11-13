package com.accenture.lkm;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String> directory = new HashMap<>();
		directory.put(25669,"Harsh");
		directory.put(54369,"Vishel");
		directory.put(86769,"Shrabbi");
		directory.put(12369,"Murlox");
		System.out.println(directory);
		
		Set<Integer> keys = directory.keySet();

		
		Iterator<Integer> itr = keys.iterator(); 
		while(itr.hasNext()) {
			Integer key = itr.next();
			String value = directory.get(key);
			System.out.println(key+" "+value); 
		}

		directory.forEach((contact,name) -> System.out.println("Name : "+name+" Contact : "+contact));
	}

}
