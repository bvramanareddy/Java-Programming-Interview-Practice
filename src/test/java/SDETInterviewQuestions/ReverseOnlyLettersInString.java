package SDETInterviewQuestions;

public class ReverseOnlyLettersInString {
    public static void reverseOnlyLettersInString(String input){
        // 1ab2 --> 1ba2
        StringBuilder result =  new StringBuilder();
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length-1;
        while (left<right){
          if (!Character.isLetter(chars[left])){
                left++;
          } else if (!Character.isLetter(chars[right])) {
              right--;
          } else {
              char temp = chars[left];
              chars[left] = chars[right];
              chars[right] =temp;
              left++;
              right--;
          }
        }
        System.out.println("Reversed Only Letters is "+ new String(chars));
    }

    public static void main(String[] args) {
        String s ="1ab2";
        reverseOnlyLettersInString(s);
    }
}
