package org.removeall;

import java.util.ArrayList;
import java.util.List;

public class RemoveAll {
	public static void main(String[]args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		System.out.println(l);
		
		List<Integer> l2 = new ArrayList<>();
		
		l2.add(30);
		l2.add(40);
		l2.add(50);
		l2.add(60);
		l2.add(80);
		l2.addAll(l);
		System.out.println(l2);
		
		
		l2.removeAll(l);
		System.out.println(l2);
		
		
		
	}

}
