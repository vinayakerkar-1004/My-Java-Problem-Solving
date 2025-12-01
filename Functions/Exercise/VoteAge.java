package Functions.Exercise;

import java.util.*;

public class VoteAge {

    public static boolean getAge(int age){
        if(age > 18){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age : ");
        int age = sc.nextInt();

        System.out.print(getAge(age));
        sc.close();
    }
    
}
