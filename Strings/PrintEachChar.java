package Strings;

public class PrintEachChar {
    public static void main(String[] args) {
        String firstName = "Vinay";
        String lastName = "Akerkar";
        // String fullName = firstName + lastName;
        String fullName = firstName + " " + lastName;
        System.out.println(fullName.length());

        for(int i = 0; i < fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
