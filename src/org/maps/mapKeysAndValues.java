package org.maps;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class mapKeysAndValues {

	public static void main(String[] args) {
		
		Map<String,Float > m=new TreeMap<String, Float>();
		
		m.put("Baranikumar", 100f);
		m.put("Mukesh", 98.56f);
		m.put("Tamil Selvan", 99.536f);
		m.put("Karthik",96.20f);
		m.put("Nanda Kumar",98.27f);
		m.put("Arshath", 100f);
		m.put("Vimal Raj", 99.56f);
		m.put("Gopi Krishna", 99.163f);
		m.put("xxx",0.001f);
		
		Set<Entry<String, Float>> es = m.entrySet();
		System.out.println(es);
		
		for (Entry<String, Float> fe : es) {
			System.out.println(fe);
		}
		int size = m.size();
		System.out.println(size);
		System.out.println(m.get("Nanda Kumar"));
		System.out.println(m.values());
		System.out.println(m.keySet());
		System.out.println(m.isEmpty());
		System.out.println(m.containsKey("Arshath"));
		System.out.println(m.containsValue(98.65));
		System.out.println(m.remove("xxx",0.001f));
		System.out.println(m.values());
		System.out.println(m.keySet());
		System.out.println(m.get("Vimal Raj"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
