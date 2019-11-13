package com.accenture.lkm;
import java.util.*;

public class IteratorDemo {

	public static void main(String[] args) {
		HashSet<String> userIds = new HashSet<>();

		userIds.add("Shravan1996");
		userIds.add("Harsh1997");
		userIds.add("Vishal1997");
		userIds.add("Murlox1997");
		
		Iterator<String> itr = userIds.iterator();
		while(itr.hasNext()) {
			String itrName = itr.next();
			System.out.println(itrName);
		}
		
		itr.remove();
		System.out.println(userIds.toString());
		
		
		
	}

}
