package Bit_Manipulation;

import java.util.*;

public class is_power_of_2_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer : ");
        int n = sc.nextInt();

        if(n < 0){
            System.out.println("Not a power of 2");
            return;
        }

        if((n & (n -1)) == 0){
            System.out.println("Power of 2");
        }else{
            System.out.println("Not a power of 2");
        }

        sc.close();
    }
}
