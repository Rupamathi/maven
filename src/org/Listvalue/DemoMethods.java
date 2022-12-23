package org.Listvalue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;

public class DemoMethods {

	public static void main(String[] args) {
		
		List<String> a = new ArrayList<String>();
		
		a.add("gayathri");
		a.add("usha");
		a.add("Rupamathi");
		
		System.out.println(a);
		a.add(0, "EKAMBARAM");
		System.out.println(a);
		
		List<String> l = new LinkedList<String>();
		
		
		l.add("Lali");
		l.add("Uma");
		l.add("Rupamathi");
		l.addAll(a);
		
		System.out.println(l);
		l.addAll(2, a);
		System.out.println(l);
		l.add(2, "gayathri");
		System.out.println(l);
		boolean equals = l.equals(a);
		System.out.println(equals);
		
		for(int i=0;i<l.size();i++) {
		String string = l.get(i);
		System.out.println(string);
		}
		
		boolean empty = l.isEmpty();
		System.out.println(empty);
		
		int lastIndexOf = l.lastIndexOf("Rupamathi");
		System.out.println(lastIndexOf);
		
		int indexOf = l.indexOf("Rupamathi");
		System.out.println(indexOf);
		
		Object[] array = l.toArray();
		for(int j =0;j<array.length;j++) {
		System.out.println(array[j]);
		}
		boolean contains = l.contains("vidhya");
		System.out.println(contains);
		boolean containsAll = l.containsAll(a);
		System.out.println(containsAll);
		String remove = l.remove(6);
		System.out.println(remove);
		System.out.println(l);
		boolean remove2 = l.remove("EKAMBARAM");
		System.out.println(remove2);
		System.out.println(l);
//		boolean removeAll = l.removeAll(a);
//		System.out.println(removeAll);
//		System.out.println(l);
//		boolean retainAll = l.retainAll(a);
//		System.out.println(retainAll);
//		System.out.println(l);
		String set = l.set(3, "Vidhya");
		System.out.println(set);
		System.out.println(l);
		List<String> subList = l.subList(0, 6);
		System.out.println(subList);
		

	}

}
