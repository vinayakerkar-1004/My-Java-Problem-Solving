package Functions.Exercise;

import java.util.*;

public class FibonacciFunction {

    // Function to print Fibonacci series
    public static void printFibonacci(int n) {
        int a = 0, b = 1;

        System.out.print(a + " ");

        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                System.out.print(b + " ");

                int temp = b;
                b = a + b;
                a = temp;
            }
        }

        System.out.println(); // new line
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        printFibonacci(n); // Function call

        sc.close();
    }
}

