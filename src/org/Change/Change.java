package org.Change;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Change {
	public static void main(String[]args) {
		
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);{
		System.out.println(l);
	}
		Set<Integer>l2 = new LinkedHashSet<>();
		l2.addAll(l);
		l2.add(10);
		l2.add(20);
		l2.add(60);
		l2.add(50);
		l2.add(40);
		l2.add(70);
		l2.add(80);
		l2.add(90);
		System.out.println(l2);
	
		
		
		
		
		
	}

}
