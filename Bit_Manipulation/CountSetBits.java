package Bit_Manipulation;

import java.util.*;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n :");
        int n = sc.nextInt();

        int count = 0;

        while(n > 0){
            n = n & (n -1);
            count++;

            }
        System.out.println("Number of 1's in binary = " + count);

        sc.close();

    }
}
