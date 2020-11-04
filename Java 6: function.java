package problem;

import java.util.*;
public class problem {
    static int mx = (int)(1e5+7);
    static int inf = (int)(1e9+7);
    
    static int sum(int a,int b) {
        return a + b; 
    }
    static void solve() {
        int[] ara = { 4, 6, 23, 21,9,34,134,5};
        
        int max = ara[0]; 
        int min = ara[0]; 
        for (int i = 1; i<ara.length; i++) {
            if ( ara[i]<min) {
                min = ara[i]; 
            }
            if ( ara[i]>max) {
                max = ara[i]; 
            }
        }
         System.out.println("Max value: "+max);
         System.out.println("Min value: "+min);  
    }
    public static void main(String[] args) {
        int a = 1000; 
        int b = 2334; 
        System.out.println("Sum: "+sum(a, b));  // reutrn value 
        solve();   // void function using for minmum and maximum value;
    }
}
