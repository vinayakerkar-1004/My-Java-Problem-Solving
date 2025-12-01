package Input_03;

import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         // Input
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         // nextInt()
//         // nextFloat()
//         System.out.println(name);
//         sc.close();
//     }
// }
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the natural no till where u want sumation : ");
        int n = sc.nextInt();

        int sum=0;

        for(int i=1; i<=n; i++){
            sum=(sum+i);
        }
        System.out.println(sum);

        sc.close();
    }
}