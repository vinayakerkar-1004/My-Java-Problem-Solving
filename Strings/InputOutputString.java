package Strings;

import java.util.*;

public class InputOutputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        // String name = sc.next();
        String name = sc.nextLine();
        System.out.println("Your name is : " +name);

        sc.close();
    }
}
