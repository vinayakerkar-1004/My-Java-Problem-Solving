package Bit_Manipulation;

import java.util.*;

public class ToggleBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number whose Bit will be Toggled : ");
        int n = sc.nextInt();

        System.out.print("Enter the bit position to Toggle : ");
        int pos = sc.nextInt();

        int mask = 1 << pos;

        int  result = n ^ mask;

        System.out.println("Original number (n)  = " + n + " (binary: " + Integer.toBinaryString(n) + ")");
        System.out.println("Mask (1<<pos)        = " + mask + " (binary: " + Integer.toBinaryString(mask) + ")");
        System.out.println("After toggling pos " + pos + " -> " + result + " (binary: " + Integer.toBinaryString(result) + ")");

    }
}
