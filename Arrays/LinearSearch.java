package Arrays;

import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();

        int numbers[] = new int[size];
        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the numbe to be searched : ");
        int x = sc.nextInt();

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == x){
                System.out.println("X found at index : " +i);
            }
            
        }

        sc.close();
    }
}
