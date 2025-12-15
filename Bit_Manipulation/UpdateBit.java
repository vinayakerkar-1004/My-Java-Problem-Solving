package Bit_Manipulation;

import java.util.*;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Operation to be performed : ");
        int opr = sc.nextInt();
        //opr=1 : set;  opr=0 : clear

        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;

        if(opr == 1){
            int newnumber = bitMask | n;
            System.out.println(newnumber);
        }else{
            int notBit = ~(bitMask);
            int newNumber = notBit & n;
            System.out.println(newNumber);
        }
        sc.close();
    }
}
