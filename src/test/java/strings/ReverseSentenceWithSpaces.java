package strings;

public class ReverseSentenceWithSpaces {

    public  static  String reverseStringWithSpacess(String input)
    {
        String[] words =  input.split(" ");
        StringBuilder finalRevString = new StringBuilder();
        for(int i=words.length-1; i>=0; i--)
        {
            finalRevString.append(words[i]).append(" ");
        }
        return  finalRevString.toString();
    }

    public static void main(String[] args) {
        String s= "My Name is Ramana Reddy";
        String revString= reverseStringWithSpacess(s);
        System.out.println("Original Input is: "+s);
        System.out.println("Reversed Output is: "+revString);
    }
}
