package Bit_Manipulation;

import java.util.Scanner;

public class NumberSystemConversion {

    // ------------------ DECIMAL → BINARY ------------------
    static String decimalToBinary(int n) {
        return Integer.toBinaryString(n);     // built-in (fastest)
    }

    // ------------------ BINARY → DECIMAL ------------------
    static int binaryToDecimal(String bin) {
        return Integer.parseInt(bin, 2);       // convert base 2 → base 10
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // DECIMAL → BINARY
        System.out.print("Enter a decimal number: ");
        int dec = sc.nextInt();
        String binary = decimalToBinary(dec);
        System.out.println("Binary: " + binary);

        // BINARY → DECIMAL
        System.out.print("Enter a binary number: ");
        String bin = sc.next();
        int decimal = binaryToDecimal(bin);
        System.out.println("Decimal: " + decimal);

        sc.close();
    }
}
 