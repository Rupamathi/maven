package org.mapvalues;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoMethods {

	public static void main(String[] args) {
		
		Map<Integer,String> h = new HashMap<>();
		
		h.put(1,"Rupa");
		h.put(2, "mathi");
		h.put(3, "Rupa");
		h.put(4, "ishu");
		h.put(5, "usha");
		System.out.println(h);
		
		Map<Integer,String> l = new LinkedHashMap<>();
		
		l.put(6, "Gayathri");
		l.put(7, "Ekagu");
		h.putAll(l);
		System.out.println(h);
		
//		boolean remove =h.remove(1, "Rupa");
//		System.out.println(remove);
//		System.out.println(h);
		
		Set<Integer> keySet = h.keySet();
		System.out.println(keySet);
		Collection<String> values = h.values();
		System.out.println(values);
		boolean containsKey = h.containsKey(10);
		System.out.println(containsKey);
		boolean containsValue = h.containsValue("ishu");
		System.out.println(containsValue);
		boolean equals = h.equals(l);
		System.out.println(equals);
		String string = h.get(6);
		System.out.println(string);
		int hashCode = h.hashCode();
		System.out.println(hashCode);
		String replace = h.replace(7, "Ekambaram");
		System.out.println(replace);
		System.out.println(h);
		boolean replace2 = h.replace(6, "Gayathri", "Gayu");
		System.out.println(replace2);
		System.out.println(h);
		System.out.println(h.size());
		
		Set<Entry<Integer, String>> entrySet = h.entrySet();
		System.out.println(entrySet);
		for(Entry<Integer, String> x:entrySet) {
			
			Integer key = x.getKey();
			System.out.println(key);
			String value = x.getValue();
			System.out.println(value);
			
		}
		

	}

}
