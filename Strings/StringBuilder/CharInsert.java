package Strings.StringBuilder;

public class CharInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Vinay");
        System.out.println(sb);

        //Insert at Index 0 or any
        sb.insert(2,'G');
        System.out.println(sb);
    }
}
