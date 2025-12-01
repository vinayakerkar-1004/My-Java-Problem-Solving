package Functions.Exercise;

import java.util.*;

public class Power {

    public static void power(int x, int n){
        int result =1;
        for (int i = 0; i <n ; i++){
            result = result * x;
        }
        System.out.print("x to the power n is : "+ result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter X : ");
        int x = sc.nextInt();

        System.out.print("Enter Y : ");
        int y = sc.nextInt();

        power(x, y);

        sc.close();
    }
    
}
