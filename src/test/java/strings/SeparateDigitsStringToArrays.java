package strings;

import java.util.Arrays;

public class SeparateDigitsStringToArrays {
    public static void separateStringDigits(String input){
        StringBuilder digitsArray= new StringBuilder();
        StringBuilder stringArray= new StringBuilder();
        for (char ch : input.toCharArray()){
            if (Character.isDigit(ch)){
                digitsArray.append(ch);
            } else if (Character.isAlphabetic(ch)){
                stringArray.append(ch);
            }
        }
        System.out.println(digitsArray.toString());
        System.out.println(stringArray.toString());
    }

    public static void main(String[] args) {
        String s = "abc-123";
        separateStringDigits(s);
    }
}
