

package Javacode;

import java.io.*;

public class Codechef{
	public static Void findfile() throws IOException {   // single or multiple vlaue use throws and throw use what type messege for throws exception
		File file = new File("in.txt"); 
		throw new IOException("not found");
	}
	public static void main(String[] args) {
		try {
			findfile(); 
			System.out.println("java code!");
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
