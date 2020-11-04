package problem;

import java.util.*;
public class problem {
    public static void main(String[] args) {
        int[] ara = {3,5,7,3,6}; 
        int n = 5;
        for (int i = 0; i<n; i++) {
            System.out.println("Array vlaue "+i+": "+ara[i]);
        }
        
        n = 0; 
        while ( n!=10) {
            System.out.println("while value: " +n);
            n++; 
        }

        n = 0; 
        do {
           System.out.println("do while value: "+ n);
           n++; 
        }while( n!=10); 
    }   
}
