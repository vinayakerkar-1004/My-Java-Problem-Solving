package Functions;

import java.util.Scanner;

public class Product {
    
    public static int calculateProduct(int a, int b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st no : ");
        int a = sc.nextInt();

        System.out.print("Enter the 2nd no : ");
        int b = sc.nextInt();

        int result = calculateProduct(a,b);

        System.out.println("Product of 2 nos is : " +result);

        sc.close();
    }   
}
