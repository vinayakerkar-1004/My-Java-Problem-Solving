package Arrays;


import java.util.*;

public class SortedAscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No of Elements : ");int size = sc.nextInt();

        int numbers[] = new int[size];
        for(int i =0; i < size; i++){
            numbers[i] = sc.nextInt();
        } 

        boolean isAscending = true;

        for(int i = 0; i < numbers.length-1; i++){
            if(numbers[i] > numbers[i + 1]){
                isAscending = false;
                break;
            }
        }

        if(isAscending){
            System.out.print("The array is sorted in ascending order");
        }else{
            System.out.print("The array is not sorted in ascending order");
        }
        sc.close();
    }
}
