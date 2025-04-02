package strings;

public class IsPalindrome {
    public static void isPalindromeUsingStringBuilder(String str){
        StringBuilder sb=  new StringBuilder(str);
        String reverseString = sb.reverse().toString();
        if (str.contentEquals(reverseString)){
            System.out.println("Given String is a Palindrome: " +str);
        }
        else {
            System.out.println("Given String is Not Palindrome: "+ str);
        }
    }

    public static void isPalindromeIterate(String s){
        char[] chars = s.toCharArray();
        String rs = "";
        for (int i = chars.length-1; i >= 0 ; i--) {
            rs+= s.charAt(i);
        }
        if (s.contentEquals(rs)){
            System.out.println("It is a palindome->" + s);
        }
        else {
            System.out.println("It is not a Palindrome-> "+ s);
        }
    }

    public static void main(String[] args) {
        String s= "madam";
        String s1= "RamaR";
        isPalindromeUsingStringBuilder(s);
        isPalindromeIterate(s1);
    }
}
