
package Javacode;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import com.sun.media.sound.SoftTuning;

public class Codeforces {
	public static void main(String[] args) {
		
		// implement queue tree type..
		Queue<Integer> queue = new LinkedList<>();
		Queue<Integer> arraylist = new ArrayDeque<>();
		Queue<Integer> priority = new PriorityQueue<>();
		
		linklist_fun();
		arraylist_fun(); 
		priority_fun();
		
	} 
	
	public static void linklist_fun() {
		System.out.println("Queue:");
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(23);
		queue.add(3); 
		queue.add(234); 
		System.out.println( "queue list value: "+queue );
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		System.out.println("queue value: "+queue);
		
		int n = queue.peek();
		System.out.println("access value: "+n);
		int x = queue.poll();
		System.out.println("Remove element: "+x);
		
		System.out.print("value: ");
		while (!queue.isEmpty()) {
			System.out.print(queue.peek() + " ");
			queue.poll();
		}
		
	}
	public static void arraylist_fun() {
		
	}
	
	public static void priority_fun() {
		System.out.println("priority queue: ");
		Queue<Integer> priority = new PriorityQueue<>();
		
		priority.offer(235); 
		priority.offer(12); 
		priority.offer(45); 
		priority.offer(6); 
		priority.offer(10); 
		
		
		System.out.println("Priority value: "+priority);
		
		int n = priority.peek(); 
		int x = priority.poll(); 
		System.out.println("assess value: "+n);
		System.out.println( "remove value: "+x);
		
		System.out.println("All value: "+ priority);
		
	}
}
