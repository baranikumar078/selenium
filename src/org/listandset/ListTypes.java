package org.listandset;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListTypes {
	public static void main(String[] args) {
		
		List l =new  ArrayList();
		l.add("Java");//0
		l.add("Python");//1
		l.add(466);//2
		l.add('e');//3
		l.add(null);//4
		l.add(true);//5
		l.add(true);//6
		l.add("Java");//7
		l.add(9840221264l);
		
		System.out.println(l);
		int size = l.size();
		System.out.println(size);
		
		for (Object i : l) {
			System.out.println(i);
			
		}
		boolean con = l.contains(466);
		System.out.println(con);
		
		List<Integer> li= new LinkedList<Integer>();
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		li.add(500);
		li.add(600);
		li.add(700);
		System.out.println(li);
		int si = li.size();
		System.out.println(si);
		
		List li1=new ArrayList<>();
		li1.add(10);
		li1.add(20);
		li1.add(30);
		li1.add(90);
		li1.add(10);
		li1.add(10);
		li1.add(40);
		li1.add(50);
		
		
		System.out.println(li1.indexOf(10));
		
		Set<Integer>s=new HashSet<>();
		s.addAll(li);
		System.out.println(s.equals(li));
		System.out.println(s);
		for (Integer in : s) {
			System.out.println(in);
		}
		
		System.out.println(s.retainAll(li));
		System.out.println(s.removeAll(li));
		for (Integer i : s) {
			System.out.println(i);
		}
		
		
		
		
	}

}
