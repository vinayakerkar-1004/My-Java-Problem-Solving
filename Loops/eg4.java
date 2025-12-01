package Loops;

import java.util.Scanner;

public class eg4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter 1 to input marks or 0 to stop:");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter student's marks (out of 100):");
                int marks = sc.nextInt();

                if (marks >= 90 && marks <= 100) {
                    System.out.println("This is Good");
                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } else if (marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well");
                    System.out.println("Because marks don’t matter, but our effort does.");
                } else {
                    System.out.println("Invalid marks! Please enter between 0 to 100.");
                }
            } else if (choice != 0) {
                System.out.println("Invalid choice! Enter 1 or 0.");
            }

        } while (choice != 0);

        System.out.println("Program stopped.");
        sc.close();
    }
}
