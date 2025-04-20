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
    public static boolean isPalindromeUsingTwoPointerApproach(String str){
        char[] letters  =  str.toCharArray();
        int left = 0;
        int right= letters.length-1;
        while (left<right){
            if (letters[left]!=letters[right]){
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s= "madam";
        String s1= "RamaR";
        String s2= "Sanjee";
        isPalindromeUsingStringBuilder(s);
        isPalindromeIterate(s1);
        System.out.println("Given String ["+ s + "] IsPalindrome: "+isPalindromeUsingTwoPointerApproach(s));
        System.out.println("Given String ["+ s2 + "] IsPalindrome: "+ isPalindromeUsingTwoPointerApproach(s2));

    }
}
