package Strings.StringBuilder;

public class Append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("V");
        sb.append("i"); //str = str += 'i';
        sb.append("n"); //str = str += 'n';
        sb.append("a"); //str = str += 'a';
        sb.append("y"); //str = str += 'y';

        System.out.println(sb);
        System.out.println(sb.length());
    }
}
