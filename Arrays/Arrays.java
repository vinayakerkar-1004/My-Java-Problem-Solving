package Arrays;

import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

            //this loop is for taking the input from the users
        for(int i = 0; i < size; i++){
            numbers[i]= sc.nextInt();
        }

        System.out.print("The numbers are : ");
        //this loop is for the output
        for(int i = 0; i < size; i++){
            System.out.print(numbers[i]+ " ");
        }

        sc.close();
    }
}
//Take an array as input from the user. Search for a given x and print the index at which it occurs.