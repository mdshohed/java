
package problem;

import java.util.*;
public class problem {
    public static void main(String[] args) {
        
        //for loop
        int n = 10; 
        for (int i = 0; i<n; i++) {
            System.out.println("value :"+i);
        }
         System.out.println("\n");
        // while loop 
        int i = 0;
        while ( i<n) {
            System.out.println("value: "+i);
            i++;
        }
        System.out.println("\n");


        // do while loop 
        i = 0; 
        do{
             i++;
             if ( i%2==0) {
               System.out.println("do while: "+i);
             }
        }while(i<=n);
    }   
}
