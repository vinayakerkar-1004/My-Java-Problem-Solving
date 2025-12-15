package Sorting;

public class InsertionSort {
    public static void printArray(int arr[]){
        System.out.print("The sorted Arrays are : " );
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};

        for(int i = 1; i < arr.length; i++){
            int currentValue = arr[i];
            int j = i-1;
            while(j >= 0 && currentValue < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = currentValue;
        }
        printArray(arr);
    }
}
