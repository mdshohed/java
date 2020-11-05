package Javacode;

import java.util.*;

public class Codeforces {
	
	public static void main(String[] args) {
		arraylist(); 
		System.out.println();
		
		linklist();
		System.out.println();
		
		vector();
		System.out.println();
		
		stack();
		System.out.println();
		
	}
	static public void arraylist() {
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
	}
	static public void linklist() {
		//linklist..
		System.out.println("Link list:");
		List<Integer> linkList = new LinkedList<>(); 
		linkList.add(33); 
		linkList.add(121); 
		linkList.add(334); 
		linkList.add(22); 
		
		System.out.println("Link list: "+linkList );
		int n = linkList.get(2); 
		System.out.println( "Access value: "+n);
		
		int value = linkList.indexOf(4); 
		System.out.println("index value: "+value);
		
		int remove = linkList.remove(1); 
		System.out.println("remove value: "+remove);
		// after link list..
		linkList.set(1, 333333); 
		System.out.println( "link list: "+linkList);
	}
	
	static public void vector() {
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
	
	static public void stack() {
		// stack.. 
		Stack<Integer> stack = new Stack<>(); 
		
		stack.push(23); 
		stack.push(12); 
		stack.push(5); 
		stack.push(67); 
		
		System.out.println("stack value: "+stack);
		
		stack.pop(); 
		System.out.println("Stack: "+stack);
		int value = stack.peek(); 
		System.out.println("Stack append value: "+value);
		
		int s = stack.search(3); 
		System.out.println("search value: "+s);
		boolean e = stack.empty(); 
		System.out.println("stack is empty or not: "+e);
	}
}
