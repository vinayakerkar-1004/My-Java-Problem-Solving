// package Functions;

// import java.util.*;

// public class EvenOrOdd {
    
//     public static int checkEven(int n){
//         if(n<1){
//             System.out.println("Enter no greater than 0");
//         }else if(n % 2== 0){
//             System.out.println(n+ " is an even no");
//         }else{
//             System.out.println(n+ " is Not an even no");
//         }

//         return n;
//     }

//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);

//         System.out.print("Enter the no : ");
//         int n= sc.nextInt();

//         checkEven(n);
//         sc.close();
//     }
// }

package Functions;

import java.util.*;

public class EvenOrOdd {
    
    public static void checkEven(int n){
        if(n<1){
            System.out.println("Enter no greater than 0");
        }else if(n % 2== 0){
            System.out.println(n+ " is an even no");
        }else{
            System.out.println(n+ " is Not an even no");
        }

        return ;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the no : ");
        int n= sc.nextInt();

        checkEven(n);
        sc.close();
    }
}
