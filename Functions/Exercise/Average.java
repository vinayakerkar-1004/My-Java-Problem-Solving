package Functions.Exercise;

import java.util.*;

public class Average {

    public static void printAverage(float a, float b, float c){
        float result = (a+b+c)/3;
        System.out.println("The average of the 3 is : "+result);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the 1st no : ");
        int a = sc.nextInt();
        
        System.out.print("Enter the 2nd no : ");
        int b = sc.nextInt();

        System.out.print("Enter the 3rd no : ");
        int c = sc.nextInt();

        printAverage(a, b, c);

        sc.close();
    }
}
