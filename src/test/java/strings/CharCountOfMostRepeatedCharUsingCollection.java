package strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CharCountOfMostRepeatedCharUsingCollection {
    public static void findMostRepeatedCharCount(String string) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        char[] chars = string.toCharArray();
        for (char c : chars) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }
        System.out.println("The Characters Count as below for the string -> " + string);
        System.out.println(charMap);
        Map.Entry<Character, Integer> maxEntry = Collections.max(charMap.entrySet(), Map.Entry.comparingByValue());
        char mostRepeatedChar = maxEntry.getKey();
        int maxCount = maxEntry.getValue();
        System.out.println("Most Repeated Char from Given String is " + mostRepeatedChar);
        System.out.println("Most reapeated Char count is " + maxCount);
    }

    public static void main(String[] args) {
        String s = "abbcccDDDD";
        findMostRepeatedCharCount(s);
    }
}
