package Functions.Exercise;

import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positive=0, negative=0, zero=0;

        System.out.print("Press 1 to start and 0 to stop : ");
        int input = sc.nextInt();

        while(input == 1){
            System.out.print("Enter your no : ");
            int number = sc.nextInt();

            if(number>0){
                positive++;
            }else if(number<0){
                negative++;
            }else{
                zero++;
            }

            System.out.print("Press 1 to start and 0 to stop : ");
            input = sc.nextInt();
        }

        System.out.println("Positive : " +positive);
        System.out.println("Negative : " +negative);
        System.out.println("Zero : " +zero);

        sc.close();
    }
}
