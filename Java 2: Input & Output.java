package problem;

import java.util.Scanner;

public class problem {
    
    // public input:
    //static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        // for any value input, we call scanner library
        Scanner sc = new Scanner(System.in);
        
        boolean b = sc.nextBoolean();  // boolean variable 
        byte by = sc.nextByte();       // range is -128 to 127 (-27 to 27 – 1)
        short s = sc.nextShort();      // 16-bit signed range  range is -32768 to 32767 (or -215 to 215 – 1).
        int n = sc.nextInt();          // 32-bit signed range from -2,147,483,648 to 2,147,4 83,647 (-231 to 231– 1).
        long x = sc.nextLong(n);        // range -263 to 263– 1.
        float f = sc.nextFloat();       // 4 bytes
        double d = sc.nextDouble();      // 8 bytes
        char ch = sc.next().charAt(0);      // range of the char data type is 0 to 65535.
        String str = sc.nextLine(); 
        
        System.out.println("Boolean: "+b);
        System.out.println("byte: "+by);
        System.out.println("Short: "+s);
        System.out.println("Integer: "+n);
        System.out.println("Float: "+f);
        System.out.println("Double: "+d);
        System.out.println("Long value: "+x);
        System.out.println("Charecter: "+ch);
        System.out.println("String: "+str);
    }   
}
