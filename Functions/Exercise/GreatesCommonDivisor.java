package Functions.Exercise;

import java.util.Scanner;

public class GreatesCommonDivisor {

    public static void divisor(int x, int y){
        while(x != y){
            if(x > y){
                x = x - y;
            }else{
                y = y - x;
            }
        }
        System.out.println("GCD is : "+ x);
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter X : ");
        int x = sc.nextInt();

        System.out.print("Enter Y : ");
        int y = sc.nextInt();

        divisor(x, y);

        sc.close();
    }
}
