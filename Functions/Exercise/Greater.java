package Functions.Exercise;

import java.util.*;

public class Greater {

        public static int returnsGreaterNo(int a, int b){
            if(a>b){
                return a;
            }else{
                return b;
            }
        }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the 1st no : ");
        int a = sc.nextInt();

        System.out.print("Enter the 2nd no : ");
        int b = sc.nextInt();
        
        int greater = returnsGreaterNo(a, b);
        System.out.print("The greater number is: " + greater);

        sc.close();
    }
}
