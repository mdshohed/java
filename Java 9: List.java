package Javacode;

import java.io.*;
import java.util.*;

public class Codeforces { 
	
	
	static Scanner scanner = new Scanner(System.in); 
	public static void main(String[] args) {
		
		// list.. 
		
		// arraylist...
		System.out.println("Array List:");
		ArrayList<Integer> aralist = new ArrayList<>(); 
		aralist.add(13); 
		aralist.add(12); 
		aralist.add(123); 
		System.out.println("Arraylist: "+aralist);
		
		int n = aralist.get(2); 
		System.out.println("Index value: "+n);
		
		int value =aralist.remove(1); 
		System.err.println( "Remove value: "+value);
		
		aralist.set(0, 333333); 
		// after arraylist..
		System.out.println("Arraylist: "+aralist);
		
		
		//linklist..
		System.out.println("Link list:");
		List<Integer> linkList = new LinkedList<>(); 
		linkList.add(33); 
		linkList.add(121); 
		linkList.add(334); 
		linkList.add(22); 
		
		System.out.println("Link list: "+linkList );
		n = linkList.get(2); 
		System.out.println( "Access value: "+n);
		
		value = linkList.indexOf(4); 
		System.out.println("index value: "+value);
		
		int remove = linkList.remove(1); 
		System.out.println("remove value: "+remove);
		// after link list..
		linkList.set(1, 333333); 
		System.out.println( "link list: "+linkList);
		
		
		
		// vector...
		
		Vector<Integer> vector = new Vector<>(); 
		Iterator<Integer> iterator = vector.iterator();
		vector.add(23); 
		vector.add(1); 
		vector.add(344); 
		vector.add(3455); 
		System.out.println("Vector: "+vector);
		
		for (int i:vector ) {
			System.out.println("index value: "+i);
		}
//		while (iterator.hasNext() ) {
//			System.out.println("vector value: "+iterator.next());
//		}
		
	}
}
