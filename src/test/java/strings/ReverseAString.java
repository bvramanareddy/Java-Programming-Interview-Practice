package strings;

public class ReverseAString {

    public static String reverseTheGivenString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "ramana";
        System.out.println(reverseTheGivenString(s));
    }
}
