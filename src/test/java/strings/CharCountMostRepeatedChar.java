package strings;

import java.util.HashMap;
import java.util.Map;

public class CharCountMostRepeatedChar {
    public static void findCharCountAndMostRepeatedChar(String string){
        char[] letters = string.toCharArray();
        HashMap<Character, Integer> charMap= new HashMap<>();
        for(char letter : letters){
           charMap.put(letter, charMap.getOrDefault(letter,0)+1);
        }
        System.out.println("Below is the CharacterCount for the given String: "+ string);
        System.out.println(charMap);
        char mostRepeatedChar= ' ';
        int maxCount= 0;
        for (Map.Entry<Character, Integer> entry: charMap.entrySet()){
            if (entry.getValue()>maxCount){
                mostRepeatedChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println("Most Repeated Char amongst all is "+ mostRepeatedChar+ " with charCount of "+ maxCount);
    }

    public static void main(String[] args) {
        String s = "ABBCCCDDDD";
        findCharCountAndMostRepeatedChar(s);
    }
}
