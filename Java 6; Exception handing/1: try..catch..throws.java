/*

				object
				  |
				Throwable
	______________|___________________________
	|                       Un-Checked        |
  Error               	    Exception         |  Checked 
  							__________________|__Exception____
	|					    |						         |
	|__StackOverFlow		|__RuntimeException              |__IOException
	|__etc  			    |__Arithmatic Exception          |__FileNotFoundException
	|					    |__NumberNotFoundExceptin        |__ClassNotFoundExceptin
						    |__NULLPointexcpetion          	 |__etc...
						    |__ArrayIndexOutBoundsExcpetion
							|__etc...
*/

package Problem;

import java.io.*;
import java.sql.SQLException;
import java.util.*;


public class Swing{
	public static void main(String[] args) throws FileNotFoundException,ArithmeticException,SQLException  {

		uncheck_exception(); 
		checked_file(); 
		
		//throws FileNotfound...
		
		File file = new File("in.txt"); 
		Scanner s = new Scanner(file); 
		
		String string = ""; 
		string = s.nextLine(); 
		System.out.println(string);
	}
	
	public static void uncheck_exception() {
		// Uncheck Exception...
		int i = 23, k = 345, j = 0; 
		try {
			i = k/j;
			System.out.println( "md shohed");
		}catch (ArithmeticException e) {
			System.out.println( "arithmetic Exception");
		}catch (IndexOutOfBoundsException e) {
			System.out.println( "array index bound exception" );
		}catch (Exception e) {
			// what type of exception which will calculate exception class 
			System.out.println(e);	
		}
	}
	
	public static void checked_file() {
		File file = new File( "in.txt"); 
		Scanner scanner = null;
		String scString = ""; 
		
		try {
			scanner = new Scanner(file);
			scString = scanner.nextLine(); 
			
		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(scString);
		scanner.close();
	}
}
