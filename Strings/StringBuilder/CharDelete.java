package Strings.StringBuilder;

public class CharDelete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        sb.insert(2, 'n');
        System.out.println(sb);

        //Delete at INdex 0 or any
        // sb.delete(2,3);
        // System.out.println(sb);

        sb.delete(2,4);
        System.out.println(sb);
    }
}
