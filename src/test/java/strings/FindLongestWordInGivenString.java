package strings;

import java.util.HashMap;
import java.util.Map;

public class FindLongestWordInGivenString {
    public static void findLongestString(String input){
        String[] words = input.split(" ");
        HashMap<String, Integer> wordsMap = new HashMap<>();
        for (String word : words){
            wordsMap.put(word, word.length());
        }
        int largestWordLength =Integer.MIN_VALUE ;
        String largestWord  = "";
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()){
            if (entry.getValue()>largestWordLength){
                largestWordLength = entry.getValue();
                largestWord= entry.getKey();
            }
        }
        System.out.println("The words with Length are as below");
        System.out.println(wordsMap);
        System.out.println("Largest Word is <"+ largestWord + ">with length of "+ largestWordLength);
    }

    public static void main(String[] args) {
        String s = "Hi My Name is Ramana Reddy";
        findLongestString(s);
    }
}
