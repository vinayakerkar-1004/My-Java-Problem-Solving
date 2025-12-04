package Strings;

import java.util.*;

public class TotalStringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of words whose combined Length you want : ");
        int size = sc.nextInt();
        int totLength = 0;

        String array[] = new String[size];
        for(int i = 0; i < size; i++){
            array[i] = sc.next();
            totLength += array[i].length();
        }

        System.out.print("The combined Length of the words is :"+totLength);
        sc.close();

    }
}
