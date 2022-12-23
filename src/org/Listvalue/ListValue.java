package org.Listvalue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListValue {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		
		l.add(10);
		l.add(20);
		l.add(10);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		System.out.println(l);
		
		for(int i=0;i<l.size();i++) {
			int value = l.get(i);
		if(value==10) {
			l.set(i, 100);
		}
		}
			System.out.println(l);
			
			
		
		
		
		
		
		
		
			
			 
				
			
		}
	}

		
		


