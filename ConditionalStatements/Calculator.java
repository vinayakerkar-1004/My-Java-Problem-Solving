package ConditionalStatements;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st no :");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd no :");
        int b = sc.nextInt();  
        System.out.println("Enter the operator :");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Addition of 2 nos is : " + (a + b));
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Invalid Operation");
                } else {
                    System.out.println("Addition of 2 nos is : " +(a / b));
                }
                break;
            case '%':
                if (b == 0) {
                    System.out.println("Invalid Operation");
                } else {
                    System.out.println(a % b);
                }
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
        sc.close();
    }
}


// import java.util.*;

// public class Calculator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the 1st no: ");
//         int a = Integer.parseInt(sc.nextLine().trim());

//         System.out.print("Enter the 2nd no: ");
//         int b = Integer.parseInt(sc.nextLine().trim());

//         System.out.print("Enter the operator: ");
//         char op = sc.nextLine().trim().charAt(0);

//         switch (op) {
//             case '+':
//                 System.out.println("Result: " + (a + b));
//                 break;
//             case '-':
//                 System.out.println("Result: " + (a - b));
//                 break;
//             case '*':
//                 System.out.println("Result: " + (a * b));
//                 break;
//             case '/':
//                 if (b != 0)
//                     System.out.println("Result: " + (a / b));
//                 else
//                     System.out.println("Cannot divide by zero!");
//                 break;
//             default:
//                 System.out.println("Invalid operator!");
//         }

//         sc.close();
//     }
// }
