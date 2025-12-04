package Strings;

import java.util.*;

public class ReplaceEWithI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = sc.next();

        String result = "";

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'e'){
                result += 'i';
            }else{
                result += str.charAt(i);
            }
        }
        System.out.println(result);

        sc.close();
    }
}
