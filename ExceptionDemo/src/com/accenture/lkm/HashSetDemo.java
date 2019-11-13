package com.accenture.lkm;
import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> userIds = new HashSet<>();
		
		System.out.println(userIds.size());
		
		userIds.add("John1998");
		userIds.add("Riya1998");
		userIds.add("Harsh1997");
		userIds.add("Vishal1998");
		
		System.out.println(userIds.size()+"\n");
		
		System.out.println(userIds.toString()+"\n");
		
		for(String name:userIds) {
			System.out.println(name);
		}		
		
		System.out.println("\n");
		
		Iterator<String> itr = userIds.iterator();
		while(itr.hasNext()) {
			String itrName = itr.next();
			System.out.println(itrName);;
		}
	}

}
