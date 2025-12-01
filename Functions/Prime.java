package Functions;

import java.util.*;

public class Prime {
    
    public static void checkPrime(int n){
        if(n <2){
            System.out.println("Enter the no that should be Greater than or equal 2");
            return;
        }

        boolean isPrime= true;

        for(int i=2; i<=Math.sqrt(n); i++){

        if( n % i == 0){
            isPrime=false;
            break;
        }
        }

        if( isPrime){
            System.out.println(n + "Is is a Prime no");
        }else{
            System.out.println(n + "Is is not a Prime no");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no : ");
        int n = sc.nextInt();

        checkPrime(n);

        sc.close();
    }
    
}
