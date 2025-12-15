package Sorting;

import java.util.*;

public class SelectionSort {
    public static void printArray(int arr[]){
        System.out.print("The Sorted Arrays are : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();

        System.out.print("Enter the nos : ");
        int arr[] = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
                //time complexity = O(n^2)
        for(int i = 0; i < arr.length-1; i++){
            int smallest = i;
            for( int j = i+1; j < arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        printArray(arr);
    }
}
