package Strings.StringBuilder;

public class CharSet {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Vinay");
        System.out.println(sb);

                //char at 0
        System.out.println(sb.charAt(0));

        //set char at Index 0
        sb.setCharAt(0,'G');
        System.out.println(sb);
    }
}
