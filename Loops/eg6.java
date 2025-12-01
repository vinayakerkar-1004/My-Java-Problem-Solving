package Loops;

import java.util.*;

public class eg6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n < 2) {
            isPrime = false; // Numbers less than 2 are not prime
        } else {
            for (int i = 2; i * i <= n; i++) { // Loop from 2 to sqrt(n)
                if (n % i == 0) {
                    isPrime = false; // If divisible, it's not prime
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a Prime number.");
        } else {
            System.out.println(n + " is NOT a Prime number.");
        }
        sc.close();

    }
}
