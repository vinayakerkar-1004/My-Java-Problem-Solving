package Strings;

public class CompareTo {
    public static void main(String[] args) {
        String name1 = "Vinay";
        String name2 = "Vinay";

            //1. s1 > s2 : +ve value
            //2. s1 = s2 : 0
            //3. s1 < s2 : -ve value

        if(name1.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are NOT equal");
        }

        //DO NOT USE == to check for string equality
       //Gives correct answer here
        if(name1 == name2){
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are NOT equal");
        }

            //Gives incorrect answer here
         if(new String("Vinay") == new String("Vinay")){
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are NOT equal");
        }
    }
}
