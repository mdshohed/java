// file input and output

import java.util.Scanner;
//import java.util.*;
public class  first {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in );  // first time Scanner file imput..

        String str = input.nextLine();  // string  input
        int n  = input.nextInt();      // int input
        System.out.println("N = "+n);
        System.out.println("Name = "+str);

    }
}
