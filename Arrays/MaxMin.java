package Arrays;

import java.util.*;

public class MaxMin {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of Elemenets : ");
        int size = sc.nextInt();

        int numbers [] = new int[size];
        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i< numbers.length; i++){
            if(numbers[i] > max){
            max = numbers[i];
        }

        if(numbers[i] < min){
            min = numbers[i];
        }
        }

        System.out.println("Largest no is : "+max);
        System.out.println("Smallest no is : "+min);
        sc.close();
    }
}
