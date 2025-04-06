package strings;

import java.util.ArrayList;

public class LongestSubString {
    public static int findLongestSubStringWithoutRepeatingChars(String s) {
        int start = 0;
        int end = 0;
        int maxLength = 0;
        ArrayList<Character> list = new ArrayList<>();
        while (end < s.length()) {
            if (!list.contains(s.charAt(end))) {
                list.add(s.charAt(end));
                end++;
                maxLength = Math.max(maxLength, list.size());
            } else {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return maxLength;


    }

    public static void main(String[] args) {
        String str = "abcabca";
        System.out.println(findLongestSubStringWithoutRepeatingChars(str));
    }
}
