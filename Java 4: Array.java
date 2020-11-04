package problem;

import java.util.*;
public class problem {
    static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
        // 1D array..
        System.out.println("1D Array input value: ");
        int n = sc.nextInt(); 
        int[] ara = new int[n]; 
        for (int i = 0; i<n; i++) {
            ara[i] = sc.nextInt();
        }
        System.out.println("Output value:");
        for (int i = 0; i<n; i++) {
            System.out.print(ara[i]+" ");
        }
        System.out.println();
        
        //2D array..
        System.out.println("2D Array input value: ");
        n = sc.nextInt();
        int[][] array = new int[n][n]; 
        for (int i = 0; i<array.length; i++){
            for (int j = 0; j<n; j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Output value:");
        for (int i = 0; i<array.length; i++){
            for (int j = 0; j<array[i].length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
    }  
}
