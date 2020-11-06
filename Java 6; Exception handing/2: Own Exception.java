package Problem;

import java.util.Scanner;

public class Swing {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		int n ; 
		
		System.out.println("Enter the value: ");
		try {
			n = scanner.nextInt(); 
			if ( n>10 ) {
				throw new myexception(" n can be greater then 10"); 
			}
	
		}catch (Exception e) {
			System.out.println( "wrong answer");
		}
		System.out.println( "Program ends");
	}
}

class myexception extends Exception {
	public myexception() {
		System.out.println( "Number can't not be greater then 10");
	}
	public myexception(String n) {
		super(n); 
	}
}

