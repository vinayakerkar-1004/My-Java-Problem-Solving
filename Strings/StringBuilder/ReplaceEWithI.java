package Strings.StringBuilder;

import java.util.*;

public class ReplaceEWithI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        StringBuilder sb = new StringBuilder(sc.next());

        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == 'e'){
                sb.setCharAt(i, 'i');
            }
        }
        System.out.println(sb);

        sc.close();
    }
}
