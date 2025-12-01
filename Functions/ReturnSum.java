package Functions;

import java.util.*;

public class ReturnSum {

    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st no : ");
        int a = sc.nextInt();

        System.out.print("Enter the 2nd no : ");
        int b = sc.nextInt();

        int result = calculateSum(a,b);

        System.out.println("Sum of 2 nos is : " +result);

        sc.close();

    }
    
}
