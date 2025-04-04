package strings;

import java.util.Arrays;

public class AnagramCheck {
    public static void checkForAnagram(String s1, String s2){
        char[] c1= s1.toLowerCase().toCharArray();
        char[] c2= s2.toLowerCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if (Arrays.equals(c1, c2)){
            System.out.println("Given Strings are Anagrams");
        }
        else {
            System.out.println("Given Strings are NOT Anagrams");
        }
    }

    public static void main(String[] args) {
        String str1= "tomato";
        String str2= "matoto";
        checkForAnagram(str1, str2);
    }
}
