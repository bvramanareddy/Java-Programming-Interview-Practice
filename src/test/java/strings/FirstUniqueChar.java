package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {
    public static Character firstUniqueChar(String str) {
        LinkedHashMap<Character, Integer> charMap = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> characterIntegerEntry : charMap.entrySet()) {
            if (characterIntegerEntry.getValue() == 1) {
                return characterIntegerEntry.getKey();
            }
        }
        return '_';
    }

    public static void main(String[] args) {
        String s = "ramanar";
        System.out.println(firstUniqueChar(s));
    }
}
