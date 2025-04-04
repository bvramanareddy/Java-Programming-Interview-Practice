package strings;

import java.util.LinkedHashSet;

public class RemoveDuplicatesInString {
    public static String removeDuplicatesInString(String str) {
        char[] chars = str.toCharArray();
        StringBuilder uniqueString = new StringBuilder();
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();
        for (char ch : chars) {
            uniqueChars.add(ch);
        }
        for (char c : uniqueChars) {
            uniqueString.append(c);
        }
        return uniqueString.toString();

    }

    public static String removeDuplicatesEfficientWay(String s) {
        StringBuilder sb = new StringBuilder();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.add(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "automation";
        System.out.println(removeDuplicatesInString(s));
        System.out.println(removeDuplicatesEfficientWay(s));
    }
}
