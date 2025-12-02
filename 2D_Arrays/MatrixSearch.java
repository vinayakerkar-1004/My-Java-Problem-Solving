import java.util.*;

public class MatrixSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of Rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter the no of Columns : ");
        int cols = sc.nextInt();

        int numbers[][] = new int [rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("enter the no to be Searched :  ");
        int x = sc.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(numbers[i][j] == x){
                    System.out.print(" X is found at location (" + i + ", " + j + ")");
                }
            }
        }
        sc.close();
    }
}
