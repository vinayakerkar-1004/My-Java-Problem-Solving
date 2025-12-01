package Functions;

import java.util.*;

public class Table {

    public static void printMyTable(int n){
        for(int i =1; i<=10; i++){
            int result = n*i;
            System.out.println(n+ " * " +i+ " = " +result);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no : ");
        int n = sc.nextInt();

        printMyTable(n);

        sc.close();
    }
}
